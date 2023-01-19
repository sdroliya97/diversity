package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableQuestionInput.class)
@JsonDeserialize(builder = ImmutableQuestionInput.Builder.class)
public interface QuestionInput {
    String question();

    String answer();

    String correctAnswer();
}
