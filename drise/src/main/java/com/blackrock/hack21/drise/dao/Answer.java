package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Date;

@Value.Immutable
@JsonSerialize(as = ImmutableAnswer.class)
@JsonDeserialize(builder = ImmutableAnswer.Builder.class)
public interface Answer {
    Long id();

    Long questionId();

    Boolean answeredAnon();

    Date timestamp();

    Employee employee();

    String answer();

    Integer[] upvotes();

    Integer[] downvotes();

    @Nullable
    DiversityResult sentiment();

}
