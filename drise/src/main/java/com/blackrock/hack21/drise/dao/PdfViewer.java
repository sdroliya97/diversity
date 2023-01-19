package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Map;

@Value.Immutable
@JsonSerialize(as = ImmutablePdfViewer.class)
@JsonDeserialize(builder = ImmutablePdfViewer.Builder.class)
public interface PdfViewer {
    String name();

    String team();

    String operation();

    Map<String, Integer> genderDivision();

    Map<String, Integer> jobTitleDivision();

    Map<String, Integer> ageGroupDivision();

    Map<String, Integer> experienceDivision();
}
