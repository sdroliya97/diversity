package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Map;

@Value.Immutable
@JsonSerialize(as = ImmutableDiversityDescription.class)
@JsonDeserialize(builder = ImmutableDiversityDescription.Builder.class)
public interface DiversityDescription {
    String name();

    String team();

    @Value.Default
    default Boolean isManager() { return true; }

    Map<String, DiversityScore> diversityMap();

    Map<String, Double> diversityDifference();

}
