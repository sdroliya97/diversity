package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;

@Value.Immutable
@JsonSerialize(as = ImmutableDiversityModelTeam.class)
@JsonDeserialize(builder = ImmutableDiversityModelTeam.Builder.class)
public interface DiversityModelTeam {
    Integer teamSize();

    Map<String, Integer> genderDivision();

    Map<String, Integer> jobTitleDivision();

    Map<String, Integer> ageGroupDivision();

    Map<String, Integer> experienceDivision();

    List<EmployeeSkills> employees();
}
