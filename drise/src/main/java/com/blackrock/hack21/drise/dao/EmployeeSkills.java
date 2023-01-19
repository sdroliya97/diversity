package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableEmployeeSkills.class)
@JsonDeserialize(builder = ImmutableEmployeeSkills.Builder.class)
public interface EmployeeSkills {
    String name();

    String department();

    String primarySkill();

    String gender();

    List<String> skills();
}
