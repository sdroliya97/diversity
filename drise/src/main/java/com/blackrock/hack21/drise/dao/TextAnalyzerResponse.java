package com.blackrock.hack21.drise.dao;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Set;

@Value.Immutable
@JsonSerialize(as = ImmutableTextAnalyzerResponse.class)
@JsonDeserialize(builder = ImmutableTextAnalyzerResponse.Builder.class)
public interface TextAnalyzerResponse {

    double biasScore();

    Set<String> biasWords();
}
