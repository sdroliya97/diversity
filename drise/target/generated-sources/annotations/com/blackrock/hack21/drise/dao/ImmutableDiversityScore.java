package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link DiversityScore}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDiversityScore.builder()}.
 */
@Generated(from = "DiversityScore", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableDiversityScore implements DiversityScore {
  private final String genderDiversity;
  private final Map<String, String> jobTitleDiversity;
  private final Map<String, String> ageGroupDiversity;
  private final Map<String, String> experienceDiversity;
  private final Map<String, String> diversityScore;
  private final Map<String, String> skillDiversity;
  private final String inclusionScore;
  private final String equityScore;

  private ImmutableDiversityScore(
      String genderDiversity,
      Map<String, String> jobTitleDiversity,
      Map<String, String> ageGroupDiversity,
      Map<String, String> experienceDiversity,
      Map<String, String> diversityScore,
      Map<String, String> skillDiversity,
      String inclusionScore,
      String equityScore) {
    this.genderDiversity = genderDiversity;
    this.jobTitleDiversity = jobTitleDiversity;
    this.ageGroupDiversity = ageGroupDiversity;
    this.experienceDiversity = experienceDiversity;
    this.diversityScore = diversityScore;
    this.skillDiversity = skillDiversity;
    this.inclusionScore = inclusionScore;
    this.equityScore = equityScore;
  }

  /**
   * @return The value of the {@code genderDiversity} attribute
   */
  @JsonProperty("genderDiversity")
  @Override
  public String genderDiversity() {
    return genderDiversity;
  }

  /**
   * @return The value of the {@code jobTitleDiversity} attribute
   */
  @JsonProperty("jobTitleDiversity")
  @Override
  public Map<String, String> jobTitleDiversity() {
    return jobTitleDiversity;
  }

  /**
   * @return The value of the {@code ageGroupDiversity} attribute
   */
  @JsonProperty("ageGroupDiversity")
  @Override
  public Map<String, String> ageGroupDiversity() {
    return ageGroupDiversity;
  }

  /**
   * @return The value of the {@code experienceDiversity} attribute
   */
  @JsonProperty("experienceDiversity")
  @Override
  public Map<String, String> experienceDiversity() {
    return experienceDiversity;
  }

  /**
   * @return The value of the {@code diversityScore} attribute
   */
  @JsonProperty("diversityScore")
  @Override
  public Map<String, String> diversityScore() {
    return diversityScore;
  }

  /**
   * @return The value of the {@code skillDiversity} attribute
   */
  @JsonProperty("skillDiversity")
  @Override
  public Map<String, String> skillDiversity() {
    return skillDiversity;
  }

  /**
   * @return The value of the {@code inclusionScore} attribute
   */
  @JsonProperty("inclusionScore")
  @Override
  public String inclusionScore() {
    return inclusionScore;
  }

  /**
   * @return The value of the {@code equityScore} attribute
   */
  @JsonProperty("equityScore")
  @Override
  public String equityScore() {
    return equityScore;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityScore#genderDiversity() genderDiversity} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for genderDiversity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityScore withGenderDiversity(String value) {
    String newValue = Objects.requireNonNull(value, "genderDiversity");
    if (this.genderDiversity.equals(newValue)) return this;
    return new ImmutableDiversityScore(
        newValue,
        this.jobTitleDiversity,
        this.ageGroupDiversity,
        this.experienceDiversity,
        this.diversityScore,
        this.skillDiversity,
        this.inclusionScore,
        this.equityScore);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityScore#jobTitleDiversity() jobTitleDiversity} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the jobTitleDiversity map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityScore withJobTitleDiversity(Map<String, ? extends String> entries) {
    if (this.jobTitleDiversity == entries) return this;
    Map<String, String> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityScore(
        this.genderDiversity,
        newValue,
        this.ageGroupDiversity,
        this.experienceDiversity,
        this.diversityScore,
        this.skillDiversity,
        this.inclusionScore,
        this.equityScore);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityScore#ageGroupDiversity() ageGroupDiversity} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the ageGroupDiversity map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityScore withAgeGroupDiversity(Map<String, ? extends String> entries) {
    if (this.ageGroupDiversity == entries) return this;
    Map<String, String> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityScore(
        this.genderDiversity,
        this.jobTitleDiversity,
        newValue,
        this.experienceDiversity,
        this.diversityScore,
        this.skillDiversity,
        this.inclusionScore,
        this.equityScore);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityScore#experienceDiversity() experienceDiversity} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the experienceDiversity map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityScore withExperienceDiversity(Map<String, ? extends String> entries) {
    if (this.experienceDiversity == entries) return this;
    Map<String, String> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityScore(
        this.genderDiversity,
        this.jobTitleDiversity,
        this.ageGroupDiversity,
        newValue,
        this.diversityScore,
        this.skillDiversity,
        this.inclusionScore,
        this.equityScore);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityScore#diversityScore() diversityScore} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the diversityScore map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityScore withDiversityScore(Map<String, ? extends String> entries) {
    if (this.diversityScore == entries) return this;
    Map<String, String> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityScore(
        this.genderDiversity,
        this.jobTitleDiversity,
        this.ageGroupDiversity,
        this.experienceDiversity,
        newValue,
        this.skillDiversity,
        this.inclusionScore,
        this.equityScore);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityScore#skillDiversity() skillDiversity} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the skillDiversity map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityScore withSkillDiversity(Map<String, ? extends String> entries) {
    if (this.skillDiversity == entries) return this;
    Map<String, String> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityScore(
        this.genderDiversity,
        this.jobTitleDiversity,
        this.ageGroupDiversity,
        this.experienceDiversity,
        this.diversityScore,
        newValue,
        this.inclusionScore,
        this.equityScore);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityScore#inclusionScore() inclusionScore} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for inclusionScore
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityScore withInclusionScore(String value) {
    String newValue = Objects.requireNonNull(value, "inclusionScore");
    if (this.inclusionScore.equals(newValue)) return this;
    return new ImmutableDiversityScore(
        this.genderDiversity,
        this.jobTitleDiversity,
        this.ageGroupDiversity,
        this.experienceDiversity,
        this.diversityScore,
        this.skillDiversity,
        newValue,
        this.equityScore);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityScore#equityScore() equityScore} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for equityScore
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityScore withEquityScore(String value) {
    String newValue = Objects.requireNonNull(value, "equityScore");
    if (this.equityScore.equals(newValue)) return this;
    return new ImmutableDiversityScore(
        this.genderDiversity,
        this.jobTitleDiversity,
        this.ageGroupDiversity,
        this.experienceDiversity,
        this.diversityScore,
        this.skillDiversity,
        this.inclusionScore,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDiversityScore} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDiversityScore
        && equalTo((ImmutableDiversityScore) another);
  }

  private boolean equalTo(ImmutableDiversityScore another) {
    return genderDiversity.equals(another.genderDiversity)
        && jobTitleDiversity.equals(another.jobTitleDiversity)
        && ageGroupDiversity.equals(another.ageGroupDiversity)
        && experienceDiversity.equals(another.experienceDiversity)
        && diversityScore.equals(another.diversityScore)
        && skillDiversity.equals(another.skillDiversity)
        && inclusionScore.equals(another.inclusionScore)
        && equityScore.equals(another.equityScore);
  }

  /**
   * Computes a hash code from attributes: {@code genderDiversity}, {@code jobTitleDiversity}, {@code ageGroupDiversity}, {@code experienceDiversity}, {@code diversityScore}, {@code skillDiversity}, {@code inclusionScore}, {@code equityScore}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + genderDiversity.hashCode();
    h += (h << 5) + jobTitleDiversity.hashCode();
    h += (h << 5) + ageGroupDiversity.hashCode();
    h += (h << 5) + experienceDiversity.hashCode();
    h += (h << 5) + diversityScore.hashCode();
    h += (h << 5) + skillDiversity.hashCode();
    h += (h << 5) + inclusionScore.hashCode();
    h += (h << 5) + equityScore.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DiversityScore} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "DiversityScore{"
        + "genderDiversity=" + genderDiversity
        + ", jobTitleDiversity=" + jobTitleDiversity
        + ", ageGroupDiversity=" + ageGroupDiversity
        + ", experienceDiversity=" + experienceDiversity
        + ", diversityScore=" + diversityScore
        + ", skillDiversity=" + skillDiversity
        + ", inclusionScore=" + inclusionScore
        + ", equityScore=" + equityScore
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link DiversityScore} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DiversityScore instance
   */
  public static ImmutableDiversityScore copyOf(DiversityScore instance) {
    if (instance instanceof ImmutableDiversityScore) {
      return (ImmutableDiversityScore) instance;
    }
    return ImmutableDiversityScore.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDiversityScore ImmutableDiversityScore}.
   * <pre>
   * ImmutableDiversityScore.builder()
   *    .genderDiversity(String) // required {@link DiversityScore#genderDiversity() genderDiversity}
   *    .putJobTitleDiversity|putAllJobTitleDiversity(String => String) // {@link DiversityScore#jobTitleDiversity() jobTitleDiversity} mappings
   *    .putAgeGroupDiversity|putAllAgeGroupDiversity(String => String) // {@link DiversityScore#ageGroupDiversity() ageGroupDiversity} mappings
   *    .putExperienceDiversity|putAllExperienceDiversity(String => String) // {@link DiversityScore#experienceDiversity() experienceDiversity} mappings
   *    .putDiversityScore|putAllDiversityScore(String => String) // {@link DiversityScore#diversityScore() diversityScore} mappings
   *    .putSkillDiversity|putAllSkillDiversity(String => String) // {@link DiversityScore#skillDiversity() skillDiversity} mappings
   *    .inclusionScore(String) // required {@link DiversityScore#inclusionScore() inclusionScore}
   *    .equityScore(String) // required {@link DiversityScore#equityScore() equityScore}
   *    .build();
   * </pre>
   * @return A new ImmutableDiversityScore builder
   */
  public static ImmutableDiversityScore.Builder builder() {
    return new ImmutableDiversityScore.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDiversityScore ImmutableDiversityScore}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DiversityScore", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_GENDER_DIVERSITY = 0x1L;
    private static final long INIT_BIT_INCLUSION_SCORE = 0x2L;
    private static final long INIT_BIT_EQUITY_SCORE = 0x4L;
    private long initBits = 0x7L;

    private String genderDiversity;
    private Map<String, String> jobTitleDiversity = new LinkedHashMap<String, String>();
    private Map<String, String> ageGroupDiversity = new LinkedHashMap<String, String>();
    private Map<String, String> experienceDiversity = new LinkedHashMap<String, String>();
    private Map<String, String> diversityScore = new LinkedHashMap<String, String>();
    private Map<String, String> skillDiversity = new LinkedHashMap<String, String>();
    private String inclusionScore;
    private String equityScore;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DiversityScore} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DiversityScore instance) {
      Objects.requireNonNull(instance, "instance");
      genderDiversity(instance.genderDiversity());
      putAllJobTitleDiversity(instance.jobTitleDiversity());
      putAllAgeGroupDiversity(instance.ageGroupDiversity());
      putAllExperienceDiversity(instance.experienceDiversity());
      putAllDiversityScore(instance.diversityScore());
      putAllSkillDiversity(instance.skillDiversity());
      inclusionScore(instance.inclusionScore());
      equityScore(instance.equityScore());
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityScore#genderDiversity() genderDiversity} attribute.
     * @param genderDiversity The value for genderDiversity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("genderDiversity")
    public final Builder genderDiversity(String genderDiversity) {
      this.genderDiversity = Objects.requireNonNull(genderDiversity, "genderDiversity");
      initBits &= ~INIT_BIT_GENDER_DIVERSITY;
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#jobTitleDiversity() jobTitleDiversity} map.
     * @param key The key in the jobTitleDiversity map
     * @param value The associated value in the jobTitleDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putJobTitleDiversity(String key, String value) {
      this.jobTitleDiversity.put(
          Objects.requireNonNull(key, "jobTitleDiversity key"),
          Objects.requireNonNull(value, "jobTitleDiversity value"));
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#jobTitleDiversity() jobTitleDiversity} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putJobTitleDiversity(Map.Entry<String, ? extends String> entry) {
      String k = entry.getKey();
      String v = entry.getValue();
      this.jobTitleDiversity.put(
          Objects.requireNonNull(k, "jobTitleDiversity key"),
          Objects.requireNonNull(v, "jobTitleDiversity value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityScore#jobTitleDiversity() jobTitleDiversity} map. Nulls are not permitted
     * @param entries The entries that will be added to the jobTitleDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jobTitleDiversity")
    public final Builder jobTitleDiversity(Map<String, ? extends String> entries) {
      this.jobTitleDiversity.clear();
      return putAllJobTitleDiversity(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityScore#jobTitleDiversity() jobTitleDiversity} map. Nulls are not permitted
     * @param entries The entries that will be added to the jobTitleDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllJobTitleDiversity(Map<String, ? extends String> entries) {
      for (Map.Entry<String, ? extends String> e : entries.entrySet()) {
        String k = e.getKey();
        String v = e.getValue();
        this.jobTitleDiversity.put(
            Objects.requireNonNull(k, "jobTitleDiversity key"),
            Objects.requireNonNull(v, "jobTitleDiversity value"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#ageGroupDiversity() ageGroupDiversity} map.
     * @param key The key in the ageGroupDiversity map
     * @param value The associated value in the ageGroupDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAgeGroupDiversity(String key, String value) {
      this.ageGroupDiversity.put(
          Objects.requireNonNull(key, "ageGroupDiversity key"),
          Objects.requireNonNull(value, "ageGroupDiversity value"));
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#ageGroupDiversity() ageGroupDiversity} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAgeGroupDiversity(Map.Entry<String, ? extends String> entry) {
      String k = entry.getKey();
      String v = entry.getValue();
      this.ageGroupDiversity.put(
          Objects.requireNonNull(k, "ageGroupDiversity key"),
          Objects.requireNonNull(v, "ageGroupDiversity value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityScore#ageGroupDiversity() ageGroupDiversity} map. Nulls are not permitted
     * @param entries The entries that will be added to the ageGroupDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ageGroupDiversity")
    public final Builder ageGroupDiversity(Map<String, ? extends String> entries) {
      this.ageGroupDiversity.clear();
      return putAllAgeGroupDiversity(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityScore#ageGroupDiversity() ageGroupDiversity} map. Nulls are not permitted
     * @param entries The entries that will be added to the ageGroupDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllAgeGroupDiversity(Map<String, ? extends String> entries) {
      for (Map.Entry<String, ? extends String> e : entries.entrySet()) {
        String k = e.getKey();
        String v = e.getValue();
        this.ageGroupDiversity.put(
            Objects.requireNonNull(k, "ageGroupDiversity key"),
            Objects.requireNonNull(v, "ageGroupDiversity value"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#experienceDiversity() experienceDiversity} map.
     * @param key The key in the experienceDiversity map
     * @param value The associated value in the experienceDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putExperienceDiversity(String key, String value) {
      this.experienceDiversity.put(
          Objects.requireNonNull(key, "experienceDiversity key"),
          Objects.requireNonNull(value, "experienceDiversity value"));
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#experienceDiversity() experienceDiversity} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putExperienceDiversity(Map.Entry<String, ? extends String> entry) {
      String k = entry.getKey();
      String v = entry.getValue();
      this.experienceDiversity.put(
          Objects.requireNonNull(k, "experienceDiversity key"),
          Objects.requireNonNull(v, "experienceDiversity value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityScore#experienceDiversity() experienceDiversity} map. Nulls are not permitted
     * @param entries The entries that will be added to the experienceDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("experienceDiversity")
    public final Builder experienceDiversity(Map<String, ? extends String> entries) {
      this.experienceDiversity.clear();
      return putAllExperienceDiversity(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityScore#experienceDiversity() experienceDiversity} map. Nulls are not permitted
     * @param entries The entries that will be added to the experienceDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllExperienceDiversity(Map<String, ? extends String> entries) {
      for (Map.Entry<String, ? extends String> e : entries.entrySet()) {
        String k = e.getKey();
        String v = e.getValue();
        this.experienceDiversity.put(
            Objects.requireNonNull(k, "experienceDiversity key"),
            Objects.requireNonNull(v, "experienceDiversity value"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#diversityScore() diversityScore} map.
     * @param key The key in the diversityScore map
     * @param value The associated value in the diversityScore map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putDiversityScore(String key, String value) {
      this.diversityScore.put(
          Objects.requireNonNull(key, "diversityScore key"),
          Objects.requireNonNull(value, "diversityScore value"));
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#diversityScore() diversityScore} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putDiversityScore(Map.Entry<String, ? extends String> entry) {
      String k = entry.getKey();
      String v = entry.getValue();
      this.diversityScore.put(
          Objects.requireNonNull(k, "diversityScore key"),
          Objects.requireNonNull(v, "diversityScore value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityScore#diversityScore() diversityScore} map. Nulls are not permitted
     * @param entries The entries that will be added to the diversityScore map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diversityScore")
    public final Builder diversityScore(Map<String, ? extends String> entries) {
      this.diversityScore.clear();
      return putAllDiversityScore(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityScore#diversityScore() diversityScore} map. Nulls are not permitted
     * @param entries The entries that will be added to the diversityScore map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllDiversityScore(Map<String, ? extends String> entries) {
      for (Map.Entry<String, ? extends String> e : entries.entrySet()) {
        String k = e.getKey();
        String v = e.getValue();
        this.diversityScore.put(
            Objects.requireNonNull(k, "diversityScore key"),
            Objects.requireNonNull(v, "diversityScore value"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#skillDiversity() skillDiversity} map.
     * @param key The key in the skillDiversity map
     * @param value The associated value in the skillDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putSkillDiversity(String key, String value) {
      this.skillDiversity.put(
          Objects.requireNonNull(key, "skillDiversity key"),
          Objects.requireNonNull(value, "skillDiversity value"));
      return this;
    }

    /**
     * Put one entry to the {@link DiversityScore#skillDiversity() skillDiversity} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putSkillDiversity(Map.Entry<String, ? extends String> entry) {
      String k = entry.getKey();
      String v = entry.getValue();
      this.skillDiversity.put(
          Objects.requireNonNull(k, "skillDiversity key"),
          Objects.requireNonNull(v, "skillDiversity value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityScore#skillDiversity() skillDiversity} map. Nulls are not permitted
     * @param entries The entries that will be added to the skillDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("skillDiversity")
    public final Builder skillDiversity(Map<String, ? extends String> entries) {
      this.skillDiversity.clear();
      return putAllSkillDiversity(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityScore#skillDiversity() skillDiversity} map. Nulls are not permitted
     * @param entries The entries that will be added to the skillDiversity map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllSkillDiversity(Map<String, ? extends String> entries) {
      for (Map.Entry<String, ? extends String> e : entries.entrySet()) {
        String k = e.getKey();
        String v = e.getValue();
        this.skillDiversity.put(
            Objects.requireNonNull(k, "skillDiversity key"),
            Objects.requireNonNull(v, "skillDiversity value"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityScore#inclusionScore() inclusionScore} attribute.
     * @param inclusionScore The value for inclusionScore 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inclusionScore")
    public final Builder inclusionScore(String inclusionScore) {
      this.inclusionScore = Objects.requireNonNull(inclusionScore, "inclusionScore");
      initBits &= ~INIT_BIT_INCLUSION_SCORE;
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityScore#equityScore() equityScore} attribute.
     * @param equityScore The value for equityScore 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("equityScore")
    public final Builder equityScore(String equityScore) {
      this.equityScore = Objects.requireNonNull(equityScore, "equityScore");
      initBits &= ~INIT_BIT_EQUITY_SCORE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDiversityScore ImmutableDiversityScore}.
     * @return An immutable instance of DiversityScore
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDiversityScore build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDiversityScore(
          genderDiversity,
          createUnmodifiableMap(false, false, jobTitleDiversity),
          createUnmodifiableMap(false, false, ageGroupDiversity),
          createUnmodifiableMap(false, false, experienceDiversity),
          createUnmodifiableMap(false, false, diversityScore),
          createUnmodifiableMap(false, false, skillDiversity),
          inclusionScore,
          equityScore);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_GENDER_DIVERSITY) != 0) attributes.add("genderDiversity");
      if ((initBits & INIT_BIT_INCLUSION_SCORE) != 0) attributes.add("inclusionScore");
      if ((initBits & INIT_BIT_EQUITY_SCORE) != 0) attributes.add("equityScore");
      return "Cannot build DiversityScore, some of required attributes are not set " + attributes;
    }
  }

  private static <K, V> Map<K, V> createUnmodifiableMap(boolean checkNulls, boolean skipNulls, Map<? extends K, ? extends V> map) {
    switch (map.size()) {
    case 0: return Collections.emptyMap();
    case 1: {
      Map.Entry<? extends K, ? extends V> e = map.entrySet().iterator().next();
      K k = e.getKey();
      V v = e.getValue();
      if (checkNulls) {
        Objects.requireNonNull(k, "key");
        Objects.requireNonNull(v, "value");
      }
      if (skipNulls && (k == null || v == null)) {
        return Collections.emptyMap();
      }
      return Collections.singletonMap(k, v);
    }
    default: {
      Map<K, V> linkedMap = new LinkedHashMap<>(map.size());
      if (skipNulls || checkNulls) {
        for (Map.Entry<? extends K, ? extends V> e : map.entrySet()) {
          K k = e.getKey();
          V v = e.getValue();
          if (skipNulls) {
            if (k == null || v == null) continue;
          } else if (checkNulls) {
            Objects.requireNonNull(k, "key");
            Objects.requireNonNull(v, "value");
          }
          linkedMap.put(k, v);
        }
      } else {
        linkedMap.putAll(map);
      }
      return Collections.unmodifiableMap(linkedMap);
    }
    }
  }
}
