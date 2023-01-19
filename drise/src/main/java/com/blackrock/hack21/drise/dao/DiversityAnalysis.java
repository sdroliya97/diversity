package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableDiversityAnalysis.class)
@JsonDeserialize(builder = ImmutableDiversityAnalysis.Builder.class)
public interface DiversityAnalysis {

    @Nullable
    Double veryPositive();

    @Nullable
    Double positive();

    @Nullable
    Double neutral();

    @Nullable
    Double negative();

    @Nullable
    Double veryNegative();
}
