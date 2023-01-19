package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Date;
import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableQuestion.class)
@JsonDeserialize(builder = ImmutableQuestion.Builder.class)
public interface Question {
    Long id();

    Date timestamp();

    Boolean askedAnon();

    String questionTitle();

    Employee employee();

    List<Answer> answers();
}
