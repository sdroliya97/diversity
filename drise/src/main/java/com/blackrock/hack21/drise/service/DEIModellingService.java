package com.blackrock.hack21.drise.service;

import com.blackrock.hack21.drise.controller.WebController;
import com.blackrock.hack21.drise.dao.*;
import com.blackrock.hack21.drise.util.ObjectMapperProvider;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@Service
public class DEIModellingService {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    int score = 0;
    String path = WebController.class.getProtectionDomain().getCodeSource().getLocation().getPath();


    // For getting the diversity score on the basis of the team
    public DiversityDescription calculate(TeamComposition teamComposition) throws IOException {
        Map<String, DiversityScore> diversityScoreMap = new HashMap<>();
        diversityScoreMap.put(teamComposition.identifier(), returnScore(teamComposition, teamComposition.isManager()));
        return ImmutableDiversityDescription.builder()
                .name(teamComposition.name())
                .team(teamComposition.team())
                .diversityMap(diversityScoreMap)
                .isManager(teamComposition.isManager())
                .diversityDifference(getDiversityDiff(returnScore(teamComposition, teamComposition.isManager())))
                .build();
    }

    public DiversityModelTeam compareOnSkillsNew(TeamComposition teamComposition,
                                                 List<EmployeeSkills> employeeSkills,
                                                 Integer team,
                                                 String department,
                                                 String skill) {
        DiversityModelTeam diversityModelTeam = optimizer(teamComposition, team);
        List<EmployeeSkills> employeeSkills1 = employeeSkills.stream().filter(emp -> emp.department().equalsIgnoreCase(department)).collect(Collectors.toList());
        if (department.equalsIgnoreCase("ENGINEER")) {
            employeeSkills1 = employeeSkills.stream().filter(emp1 -> emp1.skills().contains(skill)).collect(Collectors.toList());
        }
        return ImmutableDiversityModelTeam.copyOf(diversityModelTeam).withEmployees(employeeSkills1);
    }

    public DiversityDescription compareToRegion(List<TeamComposition> teamComposition, String name, String team, Boolean isManager) {
        Map<String, DiversityScore> diversityScoreMap = new HashMap<>();
        teamComposition.forEach(request -> {
            try {
                diversityScoreMap.put(request.identifier(), returnScore(request, isManager));
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        });
        return ImmutableDiversityDescription.builder()
                .name(name)
                .team(team)
                .diversityMap(diversityScoreMap)
                .build();
    }

    private Map<String, Double> getDiversityDiff(DiversityScore diversityScore) {
        Map<String, Double> differenceMap = new HashMap<>();
        differenceMap.put(Constant.age_diversity, getMap(Constant.age_diversity) * 100);
        differenceMap.put(Constant.gender_diversity, getMap(Constant.gender_diversity) * 100);
        differenceMap.put(Constant.experience_diversity, getMap(Constant.experience_diversity) * 100);
        differenceMap.put(Constant.jobTitle_diversity, getMap(Constant.jobTitle_diversity) * 100);

        differenceMap.put(Constant.gender_diversity_team, Double.parseDouble(diversityScore.genderDiversity()));
        differenceMap.put(Constant.gender_diversity_diff, Double.parseDouble(diversityScore.genderDiversity()) - Constant.gender_diversity_ratio * 100);

        double age = diversityScore.ageGroupDiversity().values().stream().mapToDouble(Double::parseDouble).average().getAsDouble();
        double exp = diversityScore.experienceDiversity().values().stream().mapToDouble(Double::parseDouble).average().getAsDouble();
        double jobTitle = diversityScore.jobTitleDiversity().values().stream().mapToDouble(Double::parseDouble).average().getAsDouble();
        differenceMap.put(Constant.age_diversity_team, age);
        differenceMap.put(Constant.experience_diversity_team, exp);
        differenceMap.put(Constant.jobTitle_diversity_team, jobTitle);
        differenceMap.put(Constant.age_diversity_diff, age - (getMap(Constant.age_diversity) * 100));
        differenceMap.put(Constant.experience_diversity_diff, exp - (getMap(Constant.experience_diversity) * 100));
        differenceMap.put(Constant.jobTitle_diversity_diff, jobTitle - (getMap(Constant.jobTitle_diversity) * 100));

        return differenceMap;
    }

    private Double getMap(String key) {
        Map<String, Double> blkConstant = new HashMap<>();

        blkConstant.put(Constant.age_diversity, Constant.age_diversity_ratio);
        blkConstant.put(Constant.gender_diversity, Constant.gender_diversity_ratio);
        blkConstant.put(Constant.experience_diversity, Constant.experience_diversity_ratio);
        blkConstant.put(Constant.jobTitle_diversity, Constant.jobTitle_diversity_ratio);

        return blkConstant.get(key);
    }

    public DiversityModelTeam optimizer(TeamComposition teamComposition, int teamSize) {
        DiversityModelTeam diversityModelTeam = getTeamComp(teamComposition.organization());
        DiversityModelTeam  diversityModel = modelTeam(teamComposition.organization().size() + teamSize);
        return optimizerCalc(diversityModelTeam, diversityModel, teamSize);
    }

    private DiversityModelTeam getTeamComp(List<Employee> employees) {
        Map<String, Integer> ageGroupDiversity = new HashMap<>();
        Map<String, Integer> expDiversity = new HashMap<>();
        Map<String, Integer> jobtitleDiversity = new HashMap<>();
        Map<String, Integer> genderDiversity = new HashMap<>();

        int youth = 0; int middle = 0; int old = 0;
        for(Employee employee: employees) {
            if(employee.age() < 25)
                ++youth;
            else if (employee.age() > 40)
                ++old;
            else
                ++middle;
        }
        ageGroupDiversity.put(Constant.youth, youth);
        ageGroupDiversity.put(Constant.middle_aged, middle);
        ageGroupDiversity.put(Constant.old, old);

        int fresher = 0; int middle_exp = 0; int high = 0;
        for(Employee employee: employees) {
            if(employee.experience() < 3)
                ++fresher;
            else if (employee.experience() > 8)
                ++high;
            else
                ++middle_exp;
        }
        expDiversity.put(Constant.fresher, fresher);
        expDiversity.put(Constant.middle_experienced, middle_exp);
        expDiversity.put(Constant.professional, high);

        Map<String, Map<String, Long>> mapGrouping = employees.stream().collect(groupingBy(Employee::jobTitle, groupingBy(Employee::gender, counting())));
        mapGrouping.forEach((request, mapByTitle) -> {
            mapByTitle.keySet().forEach(req -> {
                jobtitleDiversity.put(request.concat("." + req), Math.toIntExact(mapByTitle.get(req)));
            });
        });

        genderDiversity.put(Constant.female, (int) employees.stream().filter(emp -> emp.gender().equalsIgnoreCase(Constant.female)).count());
        genderDiversity.put(Constant.male, (int) employees.stream().filter(emp -> emp.gender().equalsIgnoreCase(Constant.male)).count());

        return ImmutableDiversityModelTeam.builder()
                .jobTitleDivision(jobtitleDiversity)
                .experienceDivision(expDiversity)
                .ageGroupDivision(ageGroupDiversity)
                .genderDivision(genderDiversity)
                .teamSize(employees.size()).build();
    }

    private DiversityModelTeam optimizerCalc(DiversityModelTeam oldModel, DiversityModelTeam newModel, int teamSize) {
        Map<String, Integer> genderDiversityMap = new HashMap<>();
        Map<String, Integer> jobTitleDiversityMap = new HashMap<>();
        Map<String, Integer> ageDiversityMap = new HashMap<>();
        Map<String, Integer> experienceDiversityMap = new HashMap<>();
        oldModel.genderDivision().keySet().forEach(request -> {
            if (newModel.genderDivision().get(request) - oldModel.genderDivision().get(request) < 0)
                genderDiversityMap.put(request, 0);
            else
                genderDiversityMap.put(request, Math.min(newModel.genderDivision().get(request) - oldModel.genderDivision().get(request), teamSize));
        });
        newModel.jobTitleDivision().keySet().forEach(request -> {
            if (newModel.jobTitleDivision().get(request) -oldModel.jobTitleDivision().getOrDefault(request, 0) < 0)
                jobTitleDiversityMap.put(request, 0);
            else
                jobTitleDiversityMap.put(request, Math.min(newModel.jobTitleDivision().get(request) - oldModel.jobTitleDivision().getOrDefault(request, 0), teamSize));
        });
        newModel.ageGroupDivision().keySet().forEach(request -> {
            if (newModel.ageGroupDivision().get(request) - oldModel.ageGroupDivision().get(request) < 0)
                ageDiversityMap.put(request, 0);
            else
                ageDiversityMap.put(request, Math.min(newModel.ageGroupDivision().get(request) - oldModel.ageGroupDivision().get(request), teamSize));
        });
        newModel.experienceDivision().keySet().forEach(request -> {
            experienceDiversityMap.put(request, newModel.experienceDivision().get(request) - oldModel.experienceDivision().getOrDefault(request, 0));
        });

        return ImmutableDiversityModelTeam.builder()
                .teamSize(teamSize)
                .genderDivision(genderDiversityMap)
                .ageGroupDivision(ageDiversityMap)
                .experienceDivision(experienceDiversityMap)
                .jobTitleDivision(jobTitleDiversityMap)
                .build();
    }

    private DiversityScore returnScore(TeamComposition teamComposition, Boolean isManager) throws IOException {
        double empNum = teamComposition.organization().size() + 1;

        List<EmployeeSkills> employeeSkills = ObjectMapperProvider.objectMapper.readValue(new File(path + "json/skill.json"), new TypeReference<List<EmployeeSkills>>(){});
        double female = teamComposition.organization().stream().filter(emp -> emp.gender().equalsIgnoreCase("Female")).count();
        if (isManager) {
            return ImmutableDiversityScore.builder()
                    .teamDeiRank(getTeamDeiRank())
                    .ageGroupDiversity(getAgeDiversity(teamComposition, empNum))
                    .diversityScore(getRetentionDiversity(teamComposition, empNum))
                    .experienceDiversity(getExperienceDiversity(teamComposition, empNum))
                    //.skillDiversity(getSkillsDiversityScore(employeeSkills, empNum, teamComposition))
                    .jobTitleDiversity(getJobTitleDiversity(teamComposition, empNum))
                    .genderDiversity(df.format(female/empNum*100))
                    .equityScore(getEquityScore(getRetentionDiversity(teamComposition, empNum)))
                    .inclusionScore(df.format(score * 10))
                    .build();
        }
        else {
            return ImmutableDiversityScore.builder()
                    .ageGroupDiversity(getAgeDiversity(teamComposition, empNum))
                    .diversityScore(Collections.emptyMap())
                    .experienceDiversity(getExperienceDiversity(teamComposition, empNum))
                    //.skillDiversity(getSkillsDiversityScore(employeeSkills, empNum, teamComposition))
                    .jobTitleDiversity(getJobTitleDiversity(teamComposition, empNum))
                    .genderDiversity(df.format(female/empNum*100))
                    .equityScore("null")
                    .inclusionScore("null")
                    .build();
        }
    }

    // For modelling of the team on basis of size
    public DiversityModelTeam modelTeam(Integer number) {
        Map<String, Integer> genderDiversityMap = new HashMap<>();
        int female = (int) (number * Constant.gender_Ratio);
        genderDiversityMap.put(Constant.female, female);
        genderDiversityMap.put(Constant.male, number - female);

        return ImmutableDiversityModelTeam.builder()
                .putAllGenderDivision(genderDiversityMap)
                .putAllJobTitleDivision(getJobTitleModel(number))
                .teamSize(number)
                .ageGroupDivision(getAgeGroupModel(number))
                .experienceDivision(getExperienceGroupModel(number))
                .build();
    }

    private Map<String, String> getJobTitleDiversity(TeamComposition teamComposition, double empNum) {
        Map<String, Map<String, Long>> mapGrouping = teamComposition.organization().stream().collect(groupingBy(Employee::jobTitle, groupingBy(Employee::gender, counting())));
        Map<String, String> jobDiversity = new HashMap<>();
        mapGrouping.forEach((request, mapByTitle) -> {
            mapByTitle.keySet().forEach(req -> {
                String value = df.format((mapByTitle.get(req)/empNum * 100));
                jobDiversity.put(request.concat("." + req), value);
            });
        });
        return jobDiversity;
    }

    private Map<String, Integer> getJobTitleModel(Integer number) {
        Map<String, Integer> jobTitleDiversityMap = new HashMap<>();
        int associates = (int) (number * Constant.associate_ratio);
        int md = (int) (number * Constant.managing_director_ratio);
        int vp = (int) (number * Constant.vice_president_ratio);
        int director = (int) (number * Constant.director_ratio);
        int analysts = number - associates - vp - md - director;
        int associates_male = (int) (associates * Constant.gender_Ratio);
        int analyst_male = (int) (analysts * Constant.gender_Ratio);
        int vp_male = (int) (vp * Constant.gender_Ratio);
        int md_male = (int) (md * Constant.gender_Ratio);
        int director_male = (int) (director * Constant.gender_Ratio);

        jobTitleDiversityMap.put(Constant.managing_director.concat("." + Constant.female), md-md_male);
        jobTitleDiversityMap.put(Constant.director.concat("." + Constant.female), director-director_male);
        jobTitleDiversityMap.put(Constant.vice_president.concat("." + Constant.female),vp- vp_male);
        jobTitleDiversityMap.put(Constant.associate.concat("." + Constant.female), associates-associates_male);
        jobTitleDiversityMap.put(Constant.analyst.concat("." + Constant.female), analysts-analyst_male);

        jobTitleDiversityMap.put(Constant.managing_director.concat("." + Constant.male), md_male);
        jobTitleDiversityMap.put(Constant.director.concat("." + Constant.male),  director_male);
        jobTitleDiversityMap.put(Constant.vice_president.concat("." + Constant.male), vp_male);
        jobTitleDiversityMap.put(Constant.associate.concat("." + Constant.male), associates_male);
        jobTitleDiversityMap.put(Constant.analyst.concat("." + Constant.male), analyst_male);
        return jobTitleDiversityMap;


    }

    private Map<String, String> getAgeDiversity(TeamComposition teamComposition, double empNum) {
        Map<String, String> ageGroupDiversity = new HashMap<>();
        int youth = 0; int middle = 0; int old = 0;
        for(Employee employee: teamComposition.organization()) {
            if(employee.age() < 25)
                ++youth;
            else if (employee.age() > 40)
                ++old;
            else
                ++middle;
        }
        ageGroupDiversity.put(Constant.youth, df.format(youth/empNum*100));
        ageGroupDiversity.put(Constant.middle_aged, df.format(middle/empNum*100));
        ageGroupDiversity.put(Constant.old, df.format(old/empNum*100));
        return ageGroupDiversity;
    }

    private Map<String, Integer> getAgeGroupModel(Integer teamSize) {
        Map<String, Integer> ageGroupModel = new HashMap<>();
        int youthPeople = (int) (teamSize * Constant.youth_ratio);
        int oldAge = (int) (teamSize * Constant.old_ratio);
        ageGroupModel.put(Constant.old, oldAge);
        ageGroupModel.put(Constant.youth, youthPeople);
        ageGroupModel.put(Constant.middle_aged, teamSize - oldAge - youthPeople);
        return ageGroupModel;
    }

    private Map<String, String> getExperienceDiversity(TeamComposition teamComposition, double empNum) {
        Map<String, String> experienceDiversityMap = new HashMap<>();
        int fresher = 0; int middle = 0; int high = 0;
        for(Employee employee: teamComposition.organization()) {
            if(employee.experience() < 3)
                ++fresher;
            else if (employee.experience() > 8)
                ++high;
            else
                ++middle;
        }
        experienceDiversityMap.put(Constant.fresher, df.format(fresher/empNum*100));
        experienceDiversityMap.put(Constant.middle_experienced, df.format(middle/empNum*100));
        experienceDiversityMap.put(Constant.professional, df.format(high/empNum*100));
        return experienceDiversityMap;
    }

    private Map<String, Integer> getExperienceGroupModel(Integer teamSize) {
        Map<String, Integer> experienceModel = new HashMap<>();
        int fresher = (int) (teamSize * Constant.fresher_ratio);
        int highExperience = (int) (teamSize * Constant.high_experienced);
        experienceModel.put(Constant.fresher, fresher);
        experienceModel.put(Constant.professional, highExperience);
        experienceModel.put(Constant.middle_experienced, teamSize - fresher - highExperience);
        return experienceModel;
    }

    private Map<String, String> getRetentionDiversity(TeamComposition teamComposition, Double empNum) {
        Map<String, String> diversityScore = new HashMap<>();
        teamComposition.organization().stream().collect(groupingBy(Employee::gender)).forEach((request, employees) -> {
            diversityScore.put(Constant.retention.concat("." + request), df.format(employees.stream().filter(employee -> Objects.nonNull(employee.joinDate())).filter(emp -> LocalDate.parse(emp.joinDate()).isBefore(LocalDate.now().minusYears(5))).count()/ empNum * 100));
            diversityScore.put(Constant.leavers.concat("." + request), df.format(employees.stream().filter(employee -> Objects.nonNull(employee.leaveDate())).filter(emp -> LocalDate.parse(emp.leaveDate()).isAfter(LocalDate.now().minusMonths(1))).count()/ empNum * 100));
            diversityScore.put(Constant.joiners.concat("." + request), df.format(employees.stream().filter(employee -> Objects.nonNull(employee.joinDate())).filter(emp -> LocalDate.parse(emp.joinDate()).isAfter(LocalDate.now().minusMonths(1))).count()/ empNum * 100));
            diversityScore.put(Constant.promotions.concat("." + request), df.format(employees.stream().filter(employee -> Objects.nonNull(employee.promotedRecently())).filter(Employee::promotedRecently).count()/ empNum * 100));
        });
        return diversityScore;
    }

    private String getEquityScore(Map<String, String> diversityScore) {
        return df.format(diversityScore.values().stream().mapToDouble(Double::parseDouble).average().getAsDouble());
    }

    public CoursesOutput getCourseDetails(Integer userid, List<QuestionInput> questionInput) throws IOException {
        score = (int) questionInput.stream().filter(question -> question.answer().equalsIgnoreCase(question.correctAnswer())).count();
        String coursepath = "/Users/ggupta/work_space/drise/src/src/test/resources/json/StrongCourse.json";
        File file = new File(coursepath);
        List<CourseDetails> courseDetails = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<CourseDetails>>(){});

        // store the score in user data

        File employeeFile = new File(path + "json/employees.json");
        List<Employee> allEmployees = new ArrayList<>();
        Employee emp = null;

        allEmployees = ObjectMapperProvider.objectMapper.readValue(employeeFile, new TypeReference<List<Employee>>(){});

        for (int i = 0; i < allEmployees.size(); i++) {
            if (allEmployees.get(i).id().equals(userid)) {
                emp = allEmployees.remove(i);
                break;
            }
        }

        emp = ImmutableEmployee.copyOf(emp).withAssessmentScore(score);
        allEmployees.add(emp);
        ObjectMapperProvider.objectMapper.writeValue(employeeFile, allEmployees);

        return ImmutableCoursesOutput.builder().answerScore(score).addAllCourseDetails(courseDetails).build();
    }

    private Map<String, String> getSkillsDiversityScore(List<EmployeeSkills> employeeSkills,
                                                        double teamSize,
                                                        TeamComposition teamComposition) {
        List<String> employeeName = teamComposition.organization().stream().map(Employee::name).collect(Collectors.toList());
        List<EmployeeSkills> employeeSkills1 = new ArrayList<>();
        Map<String, String> skillDiversityMap = new HashMap<>();
        for (String name: employeeName) {
            employeeSkills1.add(employeeSkills.stream().filter(emp -> emp.name().equalsIgnoreCase(name)).findFirst().get());
        }
        Map<String, Long> skillMap = employeeSkills1.stream().collect(groupingBy(EmployeeSkills::primarySkill, counting()));
        skillMap.forEach((request, mapBySkill) -> {
                String value = df.format((skillMap.get(request)/teamSize * 100));
                skillDiversityMap.put(request, value);
            });
        return skillDiversityMap;
    }

    private Map<String, String> getTeamDeiRank() {
        Map<String, String> getTeamDeiRank = new HashMap<String, String>();
        getTeamDeiRank.put("a","11");
        getTeamDeiRank.put("b","12");
        getTeamDeiRank.put("c","10");
        getTeamDeiRank.put("d","10");
        getTeamDeiRank.put("e","30");
        getTeamDeiRank.put("f","12");
        getTeamDeiRank.put("g","45");
        getTeamDeiRank.put("h","32");
        getTeamDeiRank.put("i","56");
        getTeamDeiRank.put("j","76");
        getTeamDeiRank.put("k","45");
        getTeamDeiRank.put("l","76");



        return getTeamDeiRank;
    }
}
