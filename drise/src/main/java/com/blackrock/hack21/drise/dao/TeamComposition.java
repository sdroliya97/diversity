package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableTeamComposition.class)
@JsonDeserialize(builder = ImmutableTeamComposition.Builder.class)
public interface TeamComposition {
    String name();

    String team();

    String region();

    @Value.Default
    default Boolean isManager() { return  true; }

    String identifier();

    List<Employee> organization();
}
