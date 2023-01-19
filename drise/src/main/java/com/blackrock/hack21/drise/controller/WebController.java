package com.blackrock.hack21.drise.controller;

import com.blackrock.hack21.drise.dao.*;
import com.blackrock.hack21.drise.service.*;
import com.blackrock.hack21.drise.util.ObjectMapperProvider;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;

@CrossOrigin(value = "http://localhost:4500")
@RestController
@RequestMapping("/drise")
public class WebController {

    private final DEIModellingService deiModellingService;
    private final QuestionService questionService;
    private final Analyzer analyzer;
    private final PDFService pdfService;

    String path = WebController.class.getProtectionDomain().getCodeSource().getLocation().getPath();

    public WebController(DEIModellingService deiModellingService,
                         QuestionService questionService,
                         Analyzer analyzer,
                         PDFService pdfService) {
        this.deiModellingService = deiModellingService;
        this.questionService = questionService;
        this.analyzer = analyzer;
        this.pdfService = pdfService;
    }

    @GetMapping(value = "/teamModel")
    public DiversityModelTeam getTeamModelling(@RequestParam("key") Integer teaMSize) {
        return deiModellingService.modelTeam(teaMSize);
    }

    @GetMapping(value = "/diversityScore")
    public DiversityDescription getDiversityDescription(@RequestParam("key") String userName) throws IOException {
        File file = new File(MessageFormat.format("{1}json/{0}.json", userName, path));
        TeamComposition teamComposition = null;
        try {
            teamComposition = ObjectMapperProvider.objectMapper.readValue(file, TeamComposition.class);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return deiModellingService.calculate(Objects.requireNonNull(teamComposition));
    }

    @GetMapping(value = "/compareWithSkills")
    public DiversityModelTeam getWithSkills(@RequestParam("name") String username,
                                            @RequestParam("teamSize") Integer team,
                                            @RequestParam("departmemt") String department,
                                            @RequestParam(value = "skills", required = false) String skill) {
        File file = new File(MessageFormat.format( path + "json/{0}.json", username));
        TeamComposition teamComposition = null;
        List<EmployeeSkills> employeeSkills = null;
        try {
            employeeSkills = ObjectMapperProvider.objectMapper.readValue(new File(path + "json/skill.json"), new TypeReference<List<EmployeeSkills>>(){});;
            teamComposition = (ObjectMapperProvider.objectMapper.readValue(file, TeamComposition.class));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return deiModellingService.compareOnSkillsNew(teamComposition, employeeSkills, team, department, skill);
    }

    @GetMapping(value = "/compareTo")
    public DiversityDescription getDiversityDescriptionComparator(@RequestParam("name") String userName,
                                                                  @RequestParam("region") String region) {
        File file = new File(MessageFormat.format("{1}json/{0}.json", userName, path));
        File regionFile = new File(MessageFormat.format("{1}json/{0}.json", region, path));
        String name = null;
        String team = null;
        Boolean isManager = null;
        List<TeamComposition> teamComposition = new ArrayList<>();
        try {
            teamComposition.add(ObjectMapperProvider.objectMapper.readValue(file, TeamComposition.class));
            name = teamComposition.get(0).name();
            team = teamComposition.get(0).team();
            isManager = teamComposition.get(0).isManager();
            teamComposition.add(ObjectMapperProvider.objectMapper.readValue(regionFile, TeamComposition.class));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return deiModellingService.compareToRegion(Objects.requireNonNull(teamComposition), name, team, isManager);
    }

    @GetMapping(value = "/optimize")
    public DiversityModelTeam getDiversityDescriptionOptimizer(@RequestParam("name") String userName,
                                                               @RequestParam("teamSize") int teamSize) {
        File file = new File(MessageFormat.format( path + "json/{0}.json", userName));
        TeamComposition teamComposition = null;
        try {
            teamComposition = (ObjectMapperProvider.objectMapper.readValue(file, TeamComposition.class));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return deiModellingService.optimizer(Objects.requireNonNull(teamComposition), teamSize);
    }

    @GetMapping(value = "/questions")
    public List<Question> getAllQuestions() {
        File file = new File(path + "json/question_data.json");
        List<Question> allQuestions = null;
        try {
            allQuestions = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Question>>(){});
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        Collections.reverse(allQuestions);
        return allQuestions;
    }

    @GetMapping(value = "/question/{id}")
    public Question getAllQuestions(@PathVariable("id") Long id) {
        File file = new File(path + "json/question_data.json");
        List<Question> allQuestions = null;
        try {
            allQuestions = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Question>>(){});
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return questionService.getQuestion(allQuestions, id);
    }

    @GetMapping(value = "/sentiment")
    public DiversityResult getSentiment(@RequestParam("line") String quesAnswer) {
        analyzer.initialize();
        return analyzer.getSentimentResult(quesAnswer);
    }

    @PostMapping(value = "/submitQuestion")
    public List<Question> postQuestion(@RequestBody Question question) {
        String path1 = path + "json/question_data.json";
        File file = new File(path1);
        List<Question> allQuestions = null;
        try {
            allQuestions = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Question>>(){});
            allQuestions.add(question);
            ObjectMapperProvider.objectMapper.writeValue(file, allQuestions);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        Collections.reverse(allQuestions);
        return allQuestions;
    }

    @PostMapping(value = "/submitAnswer")
    public Question postAnswer(@RequestBody Answer answer) {
        String path1 = path + "json/question_data.json";
        File file = new File(path1);
        List<Question> allQuestions = new ArrayList<>();
        Question question = null;
        try {
            allQuestions = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Question>>(){});
            // remove question as of now we are going to add that again
            for (int i = 0; i < allQuestions.size(); i++) {
                if (answer.questionId().equals(allQuestions.get(i).id())) {
                    question = allQuestions.remove(i);
                    break;
                }
            }

            List<Answer> answers = new ArrayList<>(question.answers());

            answer = ImmutableAnswer.copyOf(answer).withSentiment(getSentiment(answer.answer()));

            answers.add(answer);
            question = ImmutableQuestion.copyOf(question).withAnswers(answers);
            allQuestions.add(question);
            ObjectMapperProvider.objectMapper.writeValue(file, allQuestions);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return question;
    }

    @RequestMapping(value = "/pdfReturn", method = RequestMethod.POST,
            produces = "application/pdf", consumes = "application/json")
    public ResponseEntity<InputStreamResource> getPDFDocument(@RequestBody PdfViewer diversityDescription,
                                                              @RequestParam(value = "size") Integer teamSize) {
        ByteArrayInputStream bis = pdfService.createPDF(diversityDescription, teamSize);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=iTableText.pdf");

        return ResponseEntity
                .ok()
                .header(headers.toString())
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }

    @PostMapping(value = "/updateAnswer")
    public Answer upvoteAnswer(@RequestBody Answer answer) {
        String path1 = path + "json/question_data.json";
        String employeesPath = path + "json/employees.json";
        File file = new File(path1);
        File employeesFile = new File(employeesPath);

        List<Question> allQuestions = new ArrayList<>();
        List<Employee> allEmployees = new ArrayList<>();

        Question question = null;
        Employee emp = null;
        Answer ans = null;

        try {
            allQuestions = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Question>>(){});
            allEmployees = ObjectMapperProvider.objectMapper.readValue(employeesFile, new TypeReference<List<Employee>>(){});

            // remove question as of now we are going to add that again
            for (int i = 0; i < allQuestions.size(); i++) {
                if (allQuestions.get(i).id().equals(answer.questionId())) {
                    question = allQuestions.remove(i);
                    break;
                }
            }

            List<Answer> answers = new ArrayList<>(question.answers());

            for (int i = 0; i < answers.size(); i++) {
                if (answers.get(i).id().equals(answer.id())) {
                    ans = answers.remove(i);
                    break;
                }
            }

            for (int i = 0; i < allEmployees.size(); i++) {
                if (allEmployees.get(i).id().equals(answer.employee().id())) {
                    emp = allEmployees.remove(i);
                    break;
                }
            }

            if (answer.upvotes().length > ans.upvotes().length) {
                emp = ImmutableEmployee.copyOf(emp).withPoints(emp.points() + 1);
            } else if (answer.downvotes().length > ans.downvotes().length) {
                emp = ImmutableEmployee.copyOf(emp).withPoints(emp.points() - 1);
            }
            answers.add(answer);
            question = ImmutableQuestion.copyOf(question).withAnswers(answers);

            allEmployees.add(emp);
            allQuestions.add(question);

            ObjectMapperProvider.objectMapper.writeValue(file, allQuestions);
            ObjectMapperProvider.objectMapper.writeValue(employeesFile, allEmployees);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return answer;
    }

    @GetMapping(value = "/champions")
    public List<Employee> getChampions() {
        File file = new File(path + "json/employees.json");
        List<Employee> allEmployees = null;
        List<Employee> champions = null;
        try {
            allEmployees = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Employee>>(){});
            champions = allEmployees.stream().filter(employee -> employee.points() > 5).sorted((f1, f2) -> Integer.compare(f2.points() + f2.courseTakenScore() + f2.assessmentScore(), f1.points() + f1.courseTakenScore() + f1.assessmentScore())).limit(20).collect(Collectors.toList());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return champions;

    }

    @GetMapping(value = "/trendingQuestions")
    public List<Question> getTrendingQuestions() {
        File file = new File(path + "json/question_data.json");
        List<Question> allQuestions = null;
        List<Question> trendingQuestions = null;

        try {
            allQuestions = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Question>>(){});

            Comparator<Question> comparator
                    = (h1, h2) -> h1.timestamp().compareTo(h2.timestamp());

            trendingQuestions = allQuestions.stream().sorted((f1, f2) -> Long.compare(f2.timestamp().getTime(), f1.timestamp().getTime())).limit(4).collect(Collectors.toList());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return trendingQuestions;

    }

    @PostMapping(value = "/withInMeCourse")
    public CoursesOutput getCourseDetailsOnScore(@RequestParam("user") Integer userid, @RequestBody List<QuestionInput> questionInput) throws IOException {
        return deiModellingService.getCourseDetails(userid, questionInput);
    }

    @GetMapping(value = "/selectedCourses")
    public Employee countCourses(@RequestParam("numCourses") Integer coursesCount, @RequestParam("userid") Integer userid) {
        File file = new File(path + "json/employees.json");
        List<Employee> allEmployees = null;
        Employee emp = null;
        try {
            allEmployees = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Employee>>(){});

            for (int i = 0; i < allEmployees.size(); i++) {
                if (allEmployees.get(i).id().equals(userid)) {
                    emp = allEmployees.remove(i);
                    break;
                }
            }
            emp = ImmutableEmployee.copyOf(emp).withCourseTakenScore(coursesCount);
            allEmployees.add(emp);
            ObjectMapperProvider.objectMapper.writeValue(file, allEmployees);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return emp;
    }

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees() {
        File file = new File(path + "json/employees.json");
        List<Employee> allEmployees = null;
        try {
            allEmployees = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Employee>>(){});
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return allEmployees;
    }

    @GetMapping(value = "/updateMobilityData")
    public Employee updateMobility(@RequestParam("user") Integer userid, @RequestParam Boolean lookingForMobility, @RequestParam String role, @RequestParam List<String> skills){
        File file = new File(path + "json/employees.json");
        List<Employee> allEmployees = null;
        Employee emp = null;

        try {
            allEmployees = ObjectMapperProvider.objectMapper.readValue(file, new TypeReference<List<Employee>>() {
            });

            for (int i = 0; i < allEmployees.size(); i++) {
                if (allEmployees.get(i).id().equals(userid)) {
                    emp = allEmployees.remove(i);
                    break;
                }
            }
            emp = ImmutableEmployee.copyOf(emp).withLookingForChange(lookingForMobility).withRoleOfChange(role).withSkills(skills);
            allEmployees.add(emp);
            ObjectMapperProvider.objectMapper.writeValue(file, allEmployees);
        } catch (IOException exception){
            exception.printStackTrace();
        }

        return emp;
    };

    @GetMapping(value="/getEmployeeBasedOnParameterV3")
    public List<Employee>getEmployeeBasedOnParameterVersion3(@RequestParam Map<String, String> values){

        String employeesPath=path+"json/employees.json";
        File employeesFile=new File(employeesPath);
        List<Employee>allEmployees=new ArrayList<>();
        List<Employee>resultList=new ArrayList<>();

        String role=values.get("role").toLowerCase().replace(" ","_");

        try{
            allEmployees=ObjectMapperProvider.objectMapper.readValue(employeesFile,new TypeReference<List<Employee>>(){
            });
            List<Employee> allEmployeesLookingForChange = allEmployees.stream().filter(
                    e -> e.lookingForChange() && role.equals(e.roleOfChange().toLowerCase().replace(" ","_"))).collect(Collectors.toList());
            String criteria=values.get("criteria");
            String criteriaValue = values.get("criteriaValue");
            List inputData = Arrays.asList(criteriaValue.split(","));
            if("gender".equals(criteria)){
                for(int i=0;i<allEmployeesLookingForChange.size();i++){
                    if(inputData.contains(allEmployeesLookingForChange.get(i).gender())){
                        resultList.add(allEmployeesLookingForChange.get(i));
                    }
                }
            }else if("age".equals(criteria)){
                for(int i =0;i<allEmployeesLookingForChange.size();i++){
                    if(allEmployeesLookingForChange.get(i).age()<25 && inputData.contains("lessThan25")){
                        resultList.add(allEmployeesLookingForChange.get(i));
                    }else if(allEmployeesLookingForChange.get(i).age()>=25 && allEmployeesLookingForChange.get(i).age()<=40 && inputData.contains("between25And40")){
                        resultList.add(allEmployeesLookingForChange.get(i));
                    }else if(allEmployees.get(i).age()>40 && inputData.contains("greaterThan40")){
                        resultList.add(allEmployeesLookingForChange.get(i));
                    }
                }
            }else if("experience".equals(criteria)){
                for(int i=0;i<allEmployeesLookingForChange.size();i++){
                    if(allEmployeesLookingForChange.get(i).experience()<3 && inputData.contains("lessThan3")){
                        resultList.add(allEmployeesLookingForChange.get(i));
                    }else if(allEmployeesLookingForChange.get(i).experience()>=3 && allEmployeesLookingForChange.get(i).experience()<=8 && inputData.contains("between3And8")){
                        resultList.add(allEmployeesLookingForChange.get(i));
                    }else if(allEmployeesLookingForChange.get(i).experience()>8 && inputData.contains("greaterThan8")){
                        resultList.add(allEmployeesLookingForChange.get(i));
                    }
                }
            }else if("designation".equals(criteria)){
                for(int i=0;i<allEmployeesLookingForChange.size();i++){
                    String employeeDesignation=allEmployeesLookingForChange.get(i).jobTitle().replace(" ","_")+"."+allEmployeesLookingForChange.get(i).gender();
                    if(inputData.contains(employeeDesignation)){
                        resultList.add(allEmployeesLookingForChange.get(i));
                    }
                }
            }
        }
        catch(IOException exception){
            exception.printStackTrace();
        }

        return resultList;
    }

    @PostMapping(value = "/analyseText")
    public TextAnalyzerResponse calculateDeiScore(@RequestBody Map<String, String> data) throws IOException {
        return new TextAnalyticsService().analyse(data.get("data"));
    }

}
