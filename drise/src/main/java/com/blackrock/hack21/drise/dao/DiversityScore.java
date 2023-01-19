package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Map;

@Value.Immutable
@JsonSerialize(as = ImmutableDiversityScore.class)
@JsonDeserialize(builder = ImmutableDiversityScore.Builder.class)
public interface DiversityScore {
    String genderDiversity();

    Map<String, String> jobTitleDiversity();

    Map<String, String> ageGroupDiversity();

    Map<String, String> experienceDiversity();

    Map<String, String> diversityScore();

    Map<String, String> skillDiversity();

    Map<String, String> teamDeiRank();

    String inclusionScore();

    String equityScore();
}
