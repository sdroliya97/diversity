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
 * Immutable implementation of {@link DiversityDescription}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDiversityDescription.builder()}.
 */
@Generated(from = "DiversityDescription", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableDiversityDescription
    implements DiversityDescription {
  private final String name;
  private final String team;
  private final Boolean isManager;
  private final Map<String, DiversityScore> diversityMap;
  private final Map<String, Double> diversityDifference;

  private ImmutableDiversityDescription(ImmutableDiversityDescription.Builder builder) {
    this.name = builder.name;
    this.team = builder.team;
    this.diversityMap = createUnmodifiableMap(false, false, builder.diversityMap);
    this.diversityDifference = createUnmodifiableMap(false, false, builder.diversityDifference);
    this.isManager = builder.isManager != null
        ? builder.isManager
        : Objects.requireNonNull(DiversityDescription.super.isManager(), "isManager");
  }

  private ImmutableDiversityDescription(
      String name,
      String team,
      Boolean isManager,
      Map<String, DiversityScore> diversityMap,
      Map<String, Double> diversityDifference) {
    this.name = name;
    this.team = team;
    this.isManager = isManager;
    this.diversityMap = diversityMap;
    this.diversityDifference = diversityDifference;
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
   * @return The value of the {@code isManager} attribute
   */
  @JsonProperty("isManager")
  @Override
  public Boolean isManager() {
    return isManager;
  }

  /**
   * @return The value of the {@code diversityMap} attribute
   */
  @JsonProperty("diversityMap")
  @Override
  public Map<String, DiversityScore> diversityMap() {
    return diversityMap;
  }

  /**
   * @return The value of the {@code diversityDifference} attribute
   */
  @JsonProperty("diversityDifference")
  @Override
  public Map<String, Double> diversityDifference() {
    return diversityDifference;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityDescription#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityDescription withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableDiversityDescription(newValue, this.team, this.isManager, this.diversityMap, this.diversityDifference);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityDescription#team() team} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for team
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityDescription withTeam(String value) {
    String newValue = Objects.requireNonNull(value, "team");
    if (this.team.equals(newValue)) return this;
    return new ImmutableDiversityDescription(this.name, newValue, this.isManager, this.diversityMap, this.diversityDifference);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityDescription#isManager() isManager} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isManager
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityDescription withIsManager(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "isManager");
    if (this.isManager.equals(newValue)) return this;
    return new ImmutableDiversityDescription(this.name, this.team, newValue, this.diversityMap, this.diversityDifference);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityDescription#diversityMap() diversityMap} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the diversityMap map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityDescription withDiversityMap(Map<String, ? extends DiversityScore> entries) {
    if (this.diversityMap == entries) return this;
    Map<String, DiversityScore> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityDescription(this.name, this.team, this.isManager, newValue, this.diversityDifference);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityDescription#diversityDifference() diversityDifference} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the diversityDifference map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityDescription withDiversityDifference(Map<String, ? extends Double> entries) {
    if (this.diversityDifference == entries) return this;
    Map<String, Double> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityDescription(this.name, this.team, this.isManager, this.diversityMap, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDiversityDescription} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDiversityDescription
        && equalTo((ImmutableDiversityDescription) another);
  }

  private boolean equalTo(ImmutableDiversityDescription another) {
    return name.equals(another.name)
        && team.equals(another.team)
        && isManager.equals(another.isManager)
        && diversityMap.equals(another.diversityMap)
        && diversityDifference.equals(another.diversityDifference);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code team}, {@code isManager}, {@code diversityMap}, {@code diversityDifference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + team.hashCode();
    h += (h << 5) + isManager.hashCode();
    h += (h << 5) + diversityMap.hashCode();
    h += (h << 5) + diversityDifference.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DiversityDescription} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "DiversityDescription{"
        + "name=" + name
        + ", team=" + team
        + ", isManager=" + isManager
        + ", diversityMap=" + diversityMap
        + ", diversityDifference=" + diversityDifference
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link DiversityDescription} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DiversityDescription instance
   */
  public static ImmutableDiversityDescription copyOf(DiversityDescription instance) {
    if (instance instanceof ImmutableDiversityDescription) {
      return (ImmutableDiversityDescription) instance;
    }
    return ImmutableDiversityDescription.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDiversityDescription ImmutableDiversityDescription}.
   * <pre>
   * ImmutableDiversityDescription.builder()
   *    .name(String) // required {@link DiversityDescription#name() name}
   *    .team(String) // required {@link DiversityDescription#team() team}
   *    .isManager(Boolean) // optional {@link DiversityDescription#isManager() isManager}
   *    .putDiversityMap|putAllDiversityMap(String => com.blackrock.hack21.drise.dao.DiversityScore) // {@link DiversityDescription#diversityMap() diversityMap} mappings
   *    .putDiversityDifference|putAllDiversityDifference(String => double) // {@link DiversityDescription#diversityDifference() diversityDifference} mappings
   *    .build();
   * </pre>
   * @return A new ImmutableDiversityDescription builder
   */
  public static ImmutableDiversityDescription.Builder builder() {
    return new ImmutableDiversityDescription.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDiversityDescription ImmutableDiversityDescription}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DiversityDescription", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_TEAM = 0x2L;
    private long initBits = 0x3L;

    private String name;
    private String team;
    private Boolean isManager;
    private Map<String, DiversityScore> diversityMap = new LinkedHashMap<String, DiversityScore>();
    private Map<String, Double> diversityDifference = new LinkedHashMap<String, Double>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DiversityDescription} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DiversityDescription instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      team(instance.team());
      isManager(instance.isManager());
      putAllDiversityMap(instance.diversityMap());
      putAllDiversityDifference(instance.diversityDifference());
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityDescription#name() name} attribute.
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
     * Initializes the value for the {@link DiversityDescription#team() team} attribute.
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
     * Initializes the value for the {@link DiversityDescription#isManager() isManager} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DiversityDescription#isManager() isManager}.</em>
     * @param isManager The value for isManager 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isManager")
    public final Builder isManager(Boolean isManager) {
      this.isManager = Objects.requireNonNull(isManager, "isManager");
      return this;
    }

    /**
     * Put one entry to the {@link DiversityDescription#diversityMap() diversityMap} map.
     * @param key The key in the diversityMap map
     * @param value The associated value in the diversityMap map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putDiversityMap(String key, DiversityScore value) {
      this.diversityMap.put(
          Objects.requireNonNull(key, "diversityMap key"),
          Objects.requireNonNull(value, "diversityMap value"));
      return this;
    }

    /**
     * Put one entry to the {@link DiversityDescription#diversityMap() diversityMap} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putDiversityMap(Map.Entry<String, ? extends DiversityScore> entry) {
      String k = entry.getKey();
      DiversityScore v = entry.getValue();
      this.diversityMap.put(
          Objects.requireNonNull(k, "diversityMap key"),
          Objects.requireNonNull(v, "diversityMap value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityDescription#diversityMap() diversityMap} map. Nulls are not permitted
     * @param entries The entries that will be added to the diversityMap map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diversityMap")
    public final Builder diversityMap(Map<String, ? extends DiversityScore> entries) {
      this.diversityMap.clear();
      return putAllDiversityMap(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityDescription#diversityMap() diversityMap} map. Nulls are not permitted
     * @param entries The entries that will be added to the diversityMap map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllDiversityMap(Map<String, ? extends DiversityScore> entries) {
      for (Map.Entry<String, ? extends DiversityScore> e : entries.entrySet()) {
        String k = e.getKey();
        DiversityScore v = e.getValue();
        this.diversityMap.put(
            Objects.requireNonNull(k, "diversityMap key"),
            Objects.requireNonNull(v, "diversityMap value"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link DiversityDescription#diversityDifference() diversityDifference} map.
     * @param key The key in the diversityDifference map
     * @param value The associated value in the diversityDifference map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putDiversityDifference(String key, double value) {
      this.diversityDifference.put(
          Objects.requireNonNull(key, "diversityDifference key"),
          Objects.requireNonNull(value, "diversityDifference value"));
      return this;
    }

    /**
     * Put one entry to the {@link DiversityDescription#diversityDifference() diversityDifference} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putDiversityDifference(Map.Entry<String, ? extends Double> entry) {
      String k = entry.getKey();
      Double v = entry.getValue();
      this.diversityDifference.put(
          Objects.requireNonNull(k, "diversityDifference key"),
          Objects.requireNonNull(v, "diversityDifference value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityDescription#diversityDifference() diversityDifference} map. Nulls are not permitted
     * @param entries The entries that will be added to the diversityDifference map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diversityDifference")
    public final Builder diversityDifference(Map<String, ? extends Double> entries) {
      this.diversityDifference.clear();
      return putAllDiversityDifference(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityDescription#diversityDifference() diversityDifference} map. Nulls are not permitted
     * @param entries The entries that will be added to the diversityDifference map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllDiversityDifference(Map<String, ? extends Double> entries) {
      for (Map.Entry<String, ? extends Double> e : entries.entrySet()) {
        String k = e.getKey();
        Double v = e.getValue();
        this.diversityDifference.put(
            Objects.requireNonNull(k, "diversityDifference key"),
            Objects.requireNonNull(v, "diversityDifference value"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableDiversityDescription ImmutableDiversityDescription}.
     * @return An immutable instance of DiversityDescription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDiversityDescription build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDiversityDescription(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_TEAM) != 0) attributes.add("team");
      return "Cannot build DiversityDescription, some of required attributes are not set " + attributes;
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
