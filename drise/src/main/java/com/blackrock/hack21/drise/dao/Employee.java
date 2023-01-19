package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.xpath.operations.Bool;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableEmployee.class)
@JsonDeserialize(builder = ImmutableEmployee.Builder.class)
public interface Employee {

    @Nullable
    Integer id();

    String name();

    int age();

    String gender();

    String jobTitle();

    int experience();

    @Nullable
    String joinDate();

    @Nullable
    String leaveDate();

    @Nullable
    Integer points();

    @Nullable
    String websterLink();

    @Nullable
    String userid();

    @Nullable
    Integer assessmentScore();

    @Nullable
    Integer courseTakenScore();


    @Value.Default
    default Boolean promotedRecently() { return  false; }

    @Value.Default
    default Boolean lookingForChange() { return  false; }

    String currentRole();

    @Nullable
    String roleOfChange();

    @Nullable
    List<String> skills();

    String organisation();
}
