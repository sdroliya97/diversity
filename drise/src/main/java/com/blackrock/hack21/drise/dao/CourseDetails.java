package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableCourseDetails.class)
@JsonDeserialize(builder = ImmutableCourseDetails.Builder.class)
public interface CourseDetails {
    String category();

    String name();

    String courseLink();
}
