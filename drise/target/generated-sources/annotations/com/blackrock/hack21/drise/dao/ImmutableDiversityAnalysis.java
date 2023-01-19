package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link DiversityAnalysis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDiversityAnalysis.builder()}.
 */
@Generated(from = "DiversityAnalysis", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableDiversityAnalysis implements DiversityAnalysis {
  private final @Nullable Double veryPositive;
  private final @Nullable Double positive;
  private final @Nullable Double neutral;
  private final @Nullable Double negative;
  private final @Nullable Double veryNegative;

  private ImmutableDiversityAnalysis(
      @Nullable Double veryPositive,
      @Nullable Double positive,
      @Nullable Double neutral,
      @Nullable Double negative,
      @Nullable Double veryNegative) {
    this.veryPositive = veryPositive;
    this.positive = positive;
    this.neutral = neutral;
    this.negative = negative;
    this.veryNegative = veryNegative;
  }

  /**
   * @return The value of the {@code veryPositive} attribute
   */
  @JsonProperty("veryPositive")
  @Override
  public @Nullable Double veryPositive() {
    return veryPositive;
  }

  /**
   * @return The value of the {@code positive} attribute
   */
  @JsonProperty("positive")
  @Override
  public @Nullable Double positive() {
    return positive;
  }

  /**
   * @return The value of the {@code neutral} attribute
   */
  @JsonProperty("neutral")
  @Override
  public @Nullable Double neutral() {
    return neutral;
  }

  /**
   * @return The value of the {@code negative} attribute
   */
  @JsonProperty("negative")
  @Override
  public @Nullable Double negative() {
    return negative;
  }

  /**
   * @return The value of the {@code veryNegative} attribute
   */
  @JsonProperty("veryNegative")
  @Override
  public @Nullable Double veryNegative() {
    return veryNegative;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityAnalysis#veryPositive() veryPositive} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for veryPositive (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityAnalysis withVeryPositive(@Nullable Double value) {
    if (Objects.equals(this.veryPositive, value)) return this;
    return new ImmutableDiversityAnalysis(value, this.positive, this.neutral, this.negative, this.veryNegative);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityAnalysis#positive() positive} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for positive (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityAnalysis withPositive(@Nullable Double value) {
    if (Objects.equals(this.positive, value)) return this;
    return new ImmutableDiversityAnalysis(this.veryPositive, value, this.neutral, this.negative, this.veryNegative);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityAnalysis#neutral() neutral} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for neutral (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityAnalysis withNeutral(@Nullable Double value) {
    if (Objects.equals(this.neutral, value)) return this;
    return new ImmutableDiversityAnalysis(this.veryPositive, this.positive, value, this.negative, this.veryNegative);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityAnalysis#negative() negative} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for negative (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityAnalysis withNegative(@Nullable Double value) {
    if (Objects.equals(this.negative, value)) return this;
    return new ImmutableDiversityAnalysis(this.veryPositive, this.positive, this.neutral, value, this.veryNegative);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityAnalysis#veryNegative() veryNegative} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for veryNegative (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityAnalysis withVeryNegative(@Nullable Double value) {
    if (Objects.equals(this.veryNegative, value)) return this;
    return new ImmutableDiversityAnalysis(this.veryPositive, this.positive, this.neutral, this.negative, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDiversityAnalysis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDiversityAnalysis
        && equalTo((ImmutableDiversityAnalysis) another);
  }

  private boolean equalTo(ImmutableDiversityAnalysis another) {
    return Objects.equals(veryPositive, another.veryPositive)
        && Objects.equals(positive, another.positive)
        && Objects.equals(neutral, another.neutral)
        && Objects.equals(negative, another.negative)
        && Objects.equals(veryNegative, another.veryNegative);
  }

  /**
   * Computes a hash code from attributes: {@code veryPositive}, {@code positive}, {@code neutral}, {@code negative}, {@code veryNegative}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(veryPositive);
    h += (h << 5) + Objects.hashCode(positive);
    h += (h << 5) + Objects.hashCode(neutral);
    h += (h << 5) + Objects.hashCode(negative);
    h += (h << 5) + Objects.hashCode(veryNegative);
    return h;
  }

  /**
   * Prints the immutable value {@code DiversityAnalysis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "DiversityAnalysis{"
        + "veryPositive=" + veryPositive
        + ", positive=" + positive
        + ", neutral=" + neutral
        + ", negative=" + negative
        + ", veryNegative=" + veryNegative
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link DiversityAnalysis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DiversityAnalysis instance
   */
  public static ImmutableDiversityAnalysis copyOf(DiversityAnalysis instance) {
    if (instance instanceof ImmutableDiversityAnalysis) {
      return (ImmutableDiversityAnalysis) instance;
    }
    return ImmutableDiversityAnalysis.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDiversityAnalysis ImmutableDiversityAnalysis}.
   * <pre>
   * ImmutableDiversityAnalysis.builder()
   *    .veryPositive(Double | null) // nullable {@link DiversityAnalysis#veryPositive() veryPositive}
   *    .positive(Double | null) // nullable {@link DiversityAnalysis#positive() positive}
   *    .neutral(Double | null) // nullable {@link DiversityAnalysis#neutral() neutral}
   *    .negative(Double | null) // nullable {@link DiversityAnalysis#negative() negative}
   *    .veryNegative(Double | null) // nullable {@link DiversityAnalysis#veryNegative() veryNegative}
   *    .build();
   * </pre>
   * @return A new ImmutableDiversityAnalysis builder
   */
  public static ImmutableDiversityAnalysis.Builder builder() {
    return new ImmutableDiversityAnalysis.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDiversityAnalysis ImmutableDiversityAnalysis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DiversityAnalysis", generator = "Immutables")
  public static final class Builder {
    private Double veryPositive;
    private Double positive;
    private Double neutral;
    private Double negative;
    private Double veryNegative;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DiversityAnalysis} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DiversityAnalysis instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable Double veryPositiveValue = instance.veryPositive();
      if (veryPositiveValue != null) {
        veryPositive(veryPositiveValue);
      }
      @Nullable Double positiveValue = instance.positive();
      if (positiveValue != null) {
        positive(positiveValue);
      }
      @Nullable Double neutralValue = instance.neutral();
      if (neutralValue != null) {
        neutral(neutralValue);
      }
      @Nullable Double negativeValue = instance.negative();
      if (negativeValue != null) {
        negative(negativeValue);
      }
      @Nullable Double veryNegativeValue = instance.veryNegative();
      if (veryNegativeValue != null) {
        veryNegative(veryNegativeValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityAnalysis#veryPositive() veryPositive} attribute.
     * @param veryPositive The value for veryPositive (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("veryPositive")
    public final Builder veryPositive(@Nullable Double veryPositive) {
      this.veryPositive = veryPositive;
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityAnalysis#positive() positive} attribute.
     * @param positive The value for positive (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("positive")
    public final Builder positive(@Nullable Double positive) {
      this.positive = positive;
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityAnalysis#neutral() neutral} attribute.
     * @param neutral The value for neutral (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("neutral")
    public final Builder neutral(@Nullable Double neutral) {
      this.neutral = neutral;
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityAnalysis#negative() negative} attribute.
     * @param negative The value for negative (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("negative")
    public final Builder negative(@Nullable Double negative) {
      this.negative = negative;
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityAnalysis#veryNegative() veryNegative} attribute.
     * @param veryNegative The value for veryNegative (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("veryNegative")
    public final Builder veryNegative(@Nullable Double veryNegative) {
      this.veryNegative = veryNegative;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDiversityAnalysis ImmutableDiversityAnalysis}.
     * @return An immutable instance of DiversityAnalysis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDiversityAnalysis build() {
      return new ImmutableDiversityAnalysis(veryPositive, positive, neutral, negative, veryNegative);
    }
  }
}
