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
 * Immutable implementation of {@link PdfViewer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePdfViewer.builder()}.
 */
@Generated(from = "PdfViewer", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePdfViewer implements PdfViewer {
  private final String name;
  private final String team;
  private final String operation;
  private final Map<String, Integer> genderDivision;
  private final Map<String, Integer> jobTitleDivision;
  private final Map<String, Integer> ageGroupDivision;
  private final Map<String, Integer> experienceDivision;

  private ImmutablePdfViewer(
      String name,
      String team,
      String operation,
      Map<String, Integer> genderDivision,
      Map<String, Integer> jobTitleDivision,
      Map<String, Integer> ageGroupDivision,
      Map<String, Integer> experienceDivision) {
    this.name = name;
    this.team = team;
    this.operation = operation;
    this.genderDivision = genderDivision;
    this.jobTitleDivision = jobTitleDivision;
    this.ageGroupDivision = ageGroupDivision;
    this.experienceDivision = experienceDivision;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code team} attribute
   */
  @JsonProperty("team")
  @Override
  public String team() {
    return team;
  }

  /**
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public String operation() {
    return operation;
  }

  /**
   * @return The value of the {@code genderDivision} attribute
   */
  @JsonProperty("genderDivision")
  @Override
  public Map<String, Integer> genderDivision() {
    return genderDivision;
  }

  /**
   * @return The value of the {@code jobTitleDivision} attribute
   */
  @JsonProperty("jobTitleDivision")
  @Override
  public Map<String, Integer> jobTitleDivision() {
    return jobTitleDivision;
  }

  /**
   * @return The value of the {@code ageGroupDivision} attribute
   */
  @JsonProperty("ageGroupDivision")
  @Override
  public Map<String, Integer> ageGroupDivision() {
    return ageGroupDivision;
  }

  /**
   * @return The value of the {@code experienceDivision} attribute
   */
  @JsonProperty("experienceDivision")
  @Override
  public Map<String, Integer> experienceDivision() {
    return experienceDivision;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PdfViewer#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePdfViewer withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePdfViewer(
        newValue,
        this.team,
        this.operation,
        this.genderDivision,
        this.jobTitleDivision,
        this.ageGroupDivision,
        this.experienceDivision);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PdfViewer#team() team} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for team
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePdfViewer withTeam(String value) {
    String newValue = Objects.requireNonNull(value, "team");
    if (this.team.equals(newValue)) return this;
    return new ImmutablePdfViewer(
        this.name,
        newValue,
        this.operation,
        this.genderDivision,
        this.jobTitleDivision,
        this.ageGroupDivision,
        this.experienceDivision);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PdfViewer#operation() operation} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePdfViewer withOperation(String value) {
    String newValue = Objects.requireNonNull(value, "operation");
    if (this.operation.equals(newValue)) return this;
    return new ImmutablePdfViewer(
        this.name,
        this.team,
        newValue,
        this.genderDivision,
        this.jobTitleDivision,
        this.ageGroupDivision,
        this.experienceDivision);
  }

  /**
   * Copy the current immutable object by replacing the {@link PdfViewer#genderDivision() genderDivision} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the genderDivision map
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePdfViewer withGenderDivision(Map<String, ? extends Integer> entries) {
    if (this.genderDivision == entries) return this;
    Map<String, Integer> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutablePdfViewer(
        this.name,
        this.team,
        this.operation,
        newValue,
        this.jobTitleDivision,
        this.ageGroupDivision,
        this.experienceDivision);
  }

  /**
   * Copy the current immutable object by replacing the {@link PdfViewer#jobTitleDivision() jobTitleDivision} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the jobTitleDivision map
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePdfViewer withJobTitleDivision(Map<String, ? extends Integer> entries) {
    if (this.jobTitleDivision == entries) return this;
    Map<String, Integer> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutablePdfViewer(
        this.name,
        this.team,
        this.operation,
        this.genderDivision,
        newValue,
        this.ageGroupDivision,
        this.experienceDivision);
  }

  /**
   * Copy the current immutable object by replacing the {@link PdfViewer#ageGroupDivision() ageGroupDivision} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the ageGroupDivision map
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePdfViewer withAgeGroupDivision(Map<String, ? extends Integer> entries) {
    if (this.ageGroupDivision == entries) return this;
    Map<String, Integer> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutablePdfViewer(
        this.name,
        this.team,
        this.operation,
        this.genderDivision,
        this.jobTitleDivision,
        newValue,
        this.experienceDivision);
  }

  /**
   * Copy the current immutable object by replacing the {@link PdfViewer#experienceDivision() experienceDivision} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the experienceDivision map
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePdfViewer withExperienceDivision(Map<String, ? extends Integer> entries) {
    if (this.experienceDivision == entries) return this;
    Map<String, Integer> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutablePdfViewer(
        this.name,
        this.team,
        this.operation,
        this.genderDivision,
        this.jobTitleDivision,
        this.ageGroupDivision,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePdfViewer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePdfViewer
        && equalTo((ImmutablePdfViewer) another);
  }

  private boolean equalTo(ImmutablePdfViewer another) {
    return name.equals(another.name)
        && team.equals(another.team)
        && operation.equals(another.operation)
        && genderDivision.equals(another.genderDivision)
        && jobTitleDivision.equals(another.jobTitleDivision)
        && ageGroupDivision.equals(another.ageGroupDivision)
        && experienceDivision.equals(another.experienceDivision);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code team}, {@code operation}, {@code genderDivision}, {@code jobTitleDivision}, {@code ageGroupDivision}, {@code experienceDivision}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + team.hashCode();
    h += (h << 5) + operation.hashCode();
    h += (h << 5) + genderDivision.hashCode();
    h += (h << 5) + jobTitleDivision.hashCode();
    h += (h << 5) + ageGroupDivision.hashCode();
    h += (h << 5) + experienceDivision.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PdfViewer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PdfViewer{"
        + "name=" + name
        + ", team=" + team
        + ", operation=" + operation
        + ", genderDivision=" + genderDivision
        + ", jobTitleDivision=" + jobTitleDivision
        + ", ageGroupDivision=" + ageGroupDivision
        + ", experienceDivision=" + experienceDivision
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link PdfViewer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PdfViewer instance
   */
  public static ImmutablePdfViewer copyOf(PdfViewer instance) {
    if (instance instanceof ImmutablePdfViewer) {
      return (ImmutablePdfViewer) instance;
    }
    return ImmutablePdfViewer.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePdfViewer ImmutablePdfViewer}.
   * <pre>
   * ImmutablePdfViewer.builder()
   *    .name(String) // required {@link PdfViewer#name() name}
   *    .team(String) // required {@link PdfViewer#team() team}
   *    .operation(String) // required {@link PdfViewer#operation() operation}
   *    .putGenderDivision|putAllGenderDivision(String => int) // {@link PdfViewer#genderDivision() genderDivision} mappings
   *    .putJobTitleDivision|putAllJobTitleDivision(String => int) // {@link PdfViewer#jobTitleDivision() jobTitleDivision} mappings
   *    .putAgeGroupDivision|putAllAgeGroupDivision(String => int) // {@link PdfViewer#ageGroupDivision() ageGroupDivision} mappings
   *    .putExperienceDivision|putAllExperienceDivision(String => int) // {@link PdfViewer#experienceDivision() experienceDivision} mappings
   *    .build();
   * </pre>
   * @return A new ImmutablePdfViewer builder
   */
  public static ImmutablePdfViewer.Builder builder() {
    return new ImmutablePdfViewer.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePdfViewer ImmutablePdfViewer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PdfViewer", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_TEAM = 0x2L;
    private static final long INIT_BIT_OPERATION = 0x4L;
    private long initBits = 0x7L;

    private String name;
    private String team;
    private String operation;
    private Map<String, Integer> genderDivision = new LinkedHashMap<String, Integer>();
    private Map<String, Integer> jobTitleDivision = new LinkedHashMap<String, Integer>();
    private Map<String, Integer> ageGroupDivision = new LinkedHashMap<String, Integer>();
    private Map<String, Integer> experienceDivision = new LinkedHashMap<String, Integer>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PdfViewer} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PdfViewer instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      team(instance.team());
      operation(instance.operation());
      putAllGenderDivision(instance.genderDivision());
      putAllJobTitleDivision(instance.jobTitleDivision());
      putAllAgeGroupDivision(instance.ageGroupDivision());
      putAllExperienceDivision(instance.experienceDivision());
      return this;
    }

    /**
     * Initializes the value for the {@link PdfViewer#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link PdfViewer#team() team} attribute.
     * @param team The value for team 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("team")
    public final Builder team(String team) {
      this.team = Objects.requireNonNull(team, "team");
      initBits &= ~INIT_BIT_TEAM;
      return this;
    }

    /**
     * Initializes the value for the {@link PdfViewer#operation() operation} attribute.
     * @param operation The value for operation 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(String operation) {
      this.operation = Objects.requireNonNull(operation, "operation");
      initBits &= ~INIT_BIT_OPERATION;
      return this;
    }

    /**
     * Put one entry to the {@link PdfViewer#genderDivision() genderDivision} map.
     * @param key The key in the genderDivision map
     * @param value The associated value in the genderDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putGenderDivision(String key, int value) {
      this.genderDivision.put(
          Objects.requireNonNull(key, "genderDivision key"),
          Objects.requireNonNull(value, "genderDivision value"));
      return this;
    }

    /**
     * Put one entry to the {@link PdfViewer#genderDivision() genderDivision} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putGenderDivision(Map.Entry<String, ? extends Integer> entry) {
      String k = entry.getKey();
      Integer v = entry.getValue();
      this.genderDivision.put(
          Objects.requireNonNull(k, "genderDivision key"),
          Objects.requireNonNull(v, "genderDivision value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link PdfViewer#genderDivision() genderDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the genderDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("genderDivision")
    public final Builder genderDivision(Map<String, ? extends Integer> entries) {
      this.genderDivision.clear();
      return putAllGenderDivision(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link PdfViewer#genderDivision() genderDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the genderDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllGenderDivision(Map<String, ? extends Integer> entries) {
      for (Map.Entry<String, ? extends Integer> e : entries.entrySet()) {
        String k = e.getKey();
        Integer v = e.getValue();
        this.genderDivision.put(
            Objects.requireNonNull(k, "genderDivision key"),
            Objects.requireNonNull(v, "genderDivision value"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link PdfViewer#jobTitleDivision() jobTitleDivision} map.
     * @param key The key in the jobTitleDivision map
     * @param value The associated value in the jobTitleDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putJobTitleDivision(String key, int value) {
      this.jobTitleDivision.put(
          Objects.requireNonNull(key, "jobTitleDivision key"),
          Objects.requireNonNull(value, "jobTitleDivision value"));
      return this;
    }

    /**
     * Put one entry to the {@link PdfViewer#jobTitleDivision() jobTitleDivision} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putJobTitleDivision(Map.Entry<String, ? extends Integer> entry) {
      String k = entry.getKey();
      Integer v = entry.getValue();
      this.jobTitleDivision.put(
          Objects.requireNonNull(k, "jobTitleDivision key"),
          Objects.requireNonNull(v, "jobTitleDivision value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link PdfViewer#jobTitleDivision() jobTitleDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the jobTitleDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jobTitleDivision")
    public final Builder jobTitleDivision(Map<String, ? extends Integer> entries) {
      this.jobTitleDivision.clear();
      return putAllJobTitleDivision(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link PdfViewer#jobTitleDivision() jobTitleDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the jobTitleDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllJobTitleDivision(Map<String, ? extends Integer> entries) {
      for (Map.Entry<String, ? extends Integer> e : entries.entrySet()) {
        String k = e.getKey();
        Integer v = e.getValue();
        this.jobTitleDivision.put(
            Objects.requireNonNull(k, "jobTitleDivision key"),
            Objects.requireNonNull(v, "jobTitleDivision value"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link PdfViewer#ageGroupDivision() ageGroupDivision} map.
     * @param key The key in the ageGroupDivision map
     * @param value The associated value in the ageGroupDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAgeGroupDivision(String key, int value) {
      this.ageGroupDivision.put(
          Objects.requireNonNull(key, "ageGroupDivision key"),
          Objects.requireNonNull(value, "ageGroupDivision value"));
      return this;
    }

    /**
     * Put one entry to the {@link PdfViewer#ageGroupDivision() ageGroupDivision} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAgeGroupDivision(Map.Entry<String, ? extends Integer> entry) {
      String k = entry.getKey();
      Integer v = entry.getValue();
      this.ageGroupDivision.put(
          Objects.requireNonNull(k, "ageGroupDivision key"),
          Objects.requireNonNull(v, "ageGroupDivision value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link PdfViewer#ageGroupDivision() ageGroupDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the ageGroupDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ageGroupDivision")
    public final Builder ageGroupDivision(Map<String, ? extends Integer> entries) {
      this.ageGroupDivision.clear();
      return putAllAgeGroupDivision(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link PdfViewer#ageGroupDivision() ageGroupDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the ageGroupDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllAgeGroupDivision(Map<String, ? extends Integer> entries) {
      for (Map.Entry<String, ? extends Integer> e : entries.entrySet()) {
        String k = e.getKey();
        Integer v = e.getValue();
        this.ageGroupDivision.put(
            Objects.requireNonNull(k, "ageGroupDivision key"),
            Objects.requireNonNull(v, "ageGroupDivision value"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link PdfViewer#experienceDivision() experienceDivision} map.
     * @param key The key in the experienceDivision map
     * @param value The associated value in the experienceDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putExperienceDivision(String key, int value) {
      this.experienceDivision.put(
          Objects.requireNonNull(key, "experienceDivision key"),
          Objects.requireNonNull(value, "experienceDivision value"));
      return this;
    }

    /**
     * Put one entry to the {@link PdfViewer#experienceDivision() experienceDivision} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putExperienceDivision(Map.Entry<String, ? extends Integer> entry) {
      String k = entry.getKey();
      Integer v = entry.getValue();
      this.experienceDivision.put(
          Objects.requireNonNull(k, "experienceDivision key"),
          Objects.requireNonNull(v, "experienceDivision value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link PdfViewer#experienceDivision() experienceDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the experienceDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("experienceDivision")
    public final Builder experienceDivision(Map<String, ? extends Integer> entries) {
      this.experienceDivision.clear();
      return putAllExperienceDivision(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link PdfViewer#experienceDivision() experienceDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the experienceDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllExperienceDivision(Map<String, ? extends Integer> entries) {
      for (Map.Entry<String, ? extends Integer> e : entries.entrySet()) {
        String k = e.getKey();
        Integer v = e.getValue();
        this.experienceDivision.put(
            Objects.requireNonNull(k, "experienceDivision key"),
            Objects.requireNonNull(v, "experienceDivision value"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutablePdfViewer ImmutablePdfViewer}.
     * @return An immutable instance of PdfViewer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePdfViewer build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePdfViewer(
          name,
          team,
          operation,
          createUnmodifiableMap(false, false, genderDivision),
          createUnmodifiableMap(false, false, jobTitleDivision),
          createUnmodifiableMap(false, false, ageGroupDivision),
          createUnmodifiableMap(false, false, experienceDivision));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_TEAM) != 0) attributes.add("team");
      if ((initBits & INIT_BIT_OPERATION) != 0) attributes.add("operation");
      return "Cannot build PdfViewer, some of required attributes are not set " + attributes;
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
