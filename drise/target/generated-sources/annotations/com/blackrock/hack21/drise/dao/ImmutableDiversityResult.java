package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link DiversityResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDiversityResult.builder()}.
 */
@Generated(from = "DiversityResult", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableDiversityResult implements DiversityResult {
  private final Double sentimentScore;
  private final String sentimentType;
  private final DiversityAnalysis sentimentClass;

  private ImmutableDiversityResult(
      Double sentimentScore,
      String sentimentType,
      DiversityAnalysis sentimentClass) {
    this.sentimentScore = sentimentScore;
    this.sentimentType = sentimentType;
    this.sentimentClass = sentimentClass;
  }

  /**
   * @return The value of the {@code sentimentScore} attribute
   */
  @JsonProperty("sentimentScore")
  @Override
  public Double sentimentScore() {
    return sentimentScore;
  }

  /**
   * @return The value of the {@code sentimentType} attribute
   */
  @JsonProperty("sentimentType")
  @Override
  public String sentimentType() {
    return sentimentType;
  }

  /**
   * @return The value of the {@code sentimentClass} attribute
   */
  @JsonProperty("sentimentClass")
  @Override
  public DiversityAnalysis sentimentClass() {
    return sentimentClass;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityResult#sentimentScore() sentimentScore} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sentimentScore
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityResult withSentimentScore(Double value) {
    Double newValue = Objects.requireNonNull(value, "sentimentScore");
    if (this.sentimentScore.equals(newValue)) return this;
    return new ImmutableDiversityResult(newValue, this.sentimentType, this.sentimentClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityResult#sentimentType() sentimentType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sentimentType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityResult withSentimentType(String value) {
    String newValue = Objects.requireNonNull(value, "sentimentType");
    if (this.sentimentType.equals(newValue)) return this;
    return new ImmutableDiversityResult(this.sentimentScore, newValue, this.sentimentClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityResult#sentimentClass() sentimentClass} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sentimentClass
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityResult withSentimentClass(DiversityAnalysis value) {
    if (this.sentimentClass == value) return this;
    DiversityAnalysis newValue = Objects.requireNonNull(value, "sentimentClass");
    return new ImmutableDiversityResult(this.sentimentScore, this.sentimentType, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDiversityResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDiversityResult
        && equalTo((ImmutableDiversityResult) another);
  }

  private boolean equalTo(ImmutableDiversityResult another) {
    return sentimentScore.equals(another.sentimentScore)
        && sentimentType.equals(another.sentimentType)
        && sentimentClass.equals(another.sentimentClass);
  }

  /**
   * Computes a hash code from attributes: {@code sentimentScore}, {@code sentimentType}, {@code sentimentClass}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + sentimentScore.hashCode();
    h += (h << 5) + sentimentType.hashCode();
    h += (h << 5) + sentimentClass.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DiversityResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "DiversityResult{"
        + "sentimentScore=" + sentimentScore
        + ", sentimentType=" + sentimentType
        + ", sentimentClass=" + sentimentClass
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link DiversityResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DiversityResult instance
   */
  public static ImmutableDiversityResult copyOf(DiversityResult instance) {
    if (instance instanceof ImmutableDiversityResult) {
      return (ImmutableDiversityResult) instance;
    }
    return ImmutableDiversityResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDiversityResult ImmutableDiversityResult}.
   * <pre>
   * ImmutableDiversityResult.builder()
   *    .sentimentScore(Double) // required {@link DiversityResult#sentimentScore() sentimentScore}
   *    .sentimentType(String) // required {@link DiversityResult#sentimentType() sentimentType}
   *    .sentimentClass(com.blackrock.hack21.drise.dao.DiversityAnalysis) // required {@link DiversityResult#sentimentClass() sentimentClass}
   *    .build();
   * </pre>
   * @return A new ImmutableDiversityResult builder
   */
  public static ImmutableDiversityResult.Builder builder() {
    return new ImmutableDiversityResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDiversityResult ImmutableDiversityResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DiversityResult", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_SENTIMENT_SCORE = 0x1L;
    private static final long INIT_BIT_SENTIMENT_TYPE = 0x2L;
    private static final long INIT_BIT_SENTIMENT_CLASS = 0x4L;
    private long initBits = 0x7L;

    private Double sentimentScore;
    private String sentimentType;
    private DiversityAnalysis sentimentClass;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DiversityResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DiversityResult instance) {
      Objects.requireNonNull(instance, "instance");
      sentimentScore(instance.sentimentScore());
      sentimentType(instance.sentimentType());
      sentimentClass(instance.sentimentClass());
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityResult#sentimentScore() sentimentScore} attribute.
     * @param sentimentScore The value for sentimentScore 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sentimentScore")
    public final Builder sentimentScore(Double sentimentScore) {
      this.sentimentScore = Objects.requireNonNull(sentimentScore, "sentimentScore");
      initBits &= ~INIT_BIT_SENTIMENT_SCORE;
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityResult#sentimentType() sentimentType} attribute.
     * @param sentimentType The value for sentimentType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sentimentType")
    public final Builder sentimentType(String sentimentType) {
      this.sentimentType = Objects.requireNonNull(sentimentType, "sentimentType");
      initBits &= ~INIT_BIT_SENTIMENT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityResult#sentimentClass() sentimentClass} attribute.
     * @param sentimentClass The value for sentimentClass 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sentimentClass")
    public final Builder sentimentClass(DiversityAnalysis sentimentClass) {
      this.sentimentClass = Objects.requireNonNull(sentimentClass, "sentimentClass");
      initBits &= ~INIT_BIT_SENTIMENT_CLASS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDiversityResult ImmutableDiversityResult}.
     * @return An immutable instance of DiversityResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDiversityResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDiversityResult(sentimentScore, sentimentType, sentimentClass);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_SENTIMENT_SCORE) != 0) attributes.add("sentimentScore");
      if ((initBits & INIT_BIT_SENTIMENT_TYPE) != 0) attributes.add("sentimentType");
      if ((initBits & INIT_BIT_SENTIMENT_CLASS) != 0) attributes.add("sentimentClass");
      return "Cannot build DiversityResult, some of required attributes are not set " + attributes;
    }
  }
}
