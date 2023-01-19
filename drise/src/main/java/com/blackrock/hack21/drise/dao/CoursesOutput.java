package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableCoursesOutput.class)
@JsonDeserialize(builder = ImmutableCoursesOutput.Builder.class)
public interface CoursesOutput {
    Integer answerScore();

    List<CourseDetails> courseDetails();
}
