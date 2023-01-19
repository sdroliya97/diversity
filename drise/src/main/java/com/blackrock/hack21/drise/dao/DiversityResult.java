package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableDiversityResult.class)
@JsonDeserialize(builder = ImmutableDiversityResult.Builder.class)
public interface DiversityResult {

    Double sentimentScore();

    String sentimentType();

    DiversityAnalysis sentimentClass();
}
