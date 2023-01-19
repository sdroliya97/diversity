package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link DiversityModelTeam}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDiversityModelTeam.builder()}.
 */
@Generated(from = "DiversityModelTeam", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableDiversityModelTeam implements DiversityModelTeam {
  private final Integer teamSize;
  private final Map<String, Integer> genderDivision;
  private final Map<String, Integer> jobTitleDivision;
  private final Map<String, Integer> ageGroupDivision;
  private final Map<String, Integer> experienceDivision;
  private final List<EmployeeSkills> employees;

  private ImmutableDiversityModelTeam(
      Integer teamSize,
      Map<String, Integer> genderDivision,
      Map<String, Integer> jobTitleDivision,
      Map<String, Integer> ageGroupDivision,
      Map<String, Integer> experienceDivision,
      List<EmployeeSkills> employees) {
    this.teamSize = teamSize;
    this.genderDivision = genderDivision;
    this.jobTitleDivision = jobTitleDivision;
    this.ageGroupDivision = ageGroupDivision;
    this.experienceDivision = experienceDivision;
    this.employees = employees;
  }

  /**
   * @return The value of the {@code teamSize} attribute
   */
  @JsonProperty("teamSize")
  @Override
  public Integer teamSize() {
    return teamSize;
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
   * @return The value of the {@code employees} attribute
   */
  @JsonProperty("employees")
  @Override
  public List<EmployeeSkills> employees() {
    return employees;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiversityModelTeam#teamSize() teamSize} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for teamSize
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiversityModelTeam withTeamSize(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "teamSize");
    if (this.teamSize.equals(newValue)) return this;
    return new ImmutableDiversityModelTeam(
        newValue,
        this.genderDivision,
        this.jobTitleDivision,
        this.ageGroupDivision,
        this.experienceDivision,
        this.employees);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityModelTeam#genderDivision() genderDivision} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the genderDivision map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityModelTeam withGenderDivision(Map<String, ? extends Integer> entries) {
    if (this.genderDivision == entries) return this;
    Map<String, Integer> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityModelTeam(
        this.teamSize,
        newValue,
        this.jobTitleDivision,
        this.ageGroupDivision,
        this.experienceDivision,
        this.employees);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityModelTeam#jobTitleDivision() jobTitleDivision} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the jobTitleDivision map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityModelTeam withJobTitleDivision(Map<String, ? extends Integer> entries) {
    if (this.jobTitleDivision == entries) return this;
    Map<String, Integer> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityModelTeam(
        this.teamSize,
        this.genderDivision,
        newValue,
        this.ageGroupDivision,
        this.experienceDivision,
        this.employees);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityModelTeam#ageGroupDivision() ageGroupDivision} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the ageGroupDivision map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityModelTeam withAgeGroupDivision(Map<String, ? extends Integer> entries) {
    if (this.ageGroupDivision == entries) return this;
    Map<String, Integer> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityModelTeam(
        this.teamSize,
        this.genderDivision,
        this.jobTitleDivision,
        newValue,
        this.experienceDivision,
        this.employees);
  }

  /**
   * Copy the current immutable object by replacing the {@link DiversityModelTeam#experienceDivision() experienceDivision} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the experienceDivision map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityModelTeam withExperienceDivision(Map<String, ? extends Integer> entries) {
    if (this.experienceDivision == entries) return this;
    Map<String, Integer> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableDiversityModelTeam(
        this.teamSize,
        this.genderDivision,
        this.jobTitleDivision,
        this.ageGroupDivision,
        newValue,
        this.employees);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DiversityModelTeam#employees() employees}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityModelTeam withEmployees(EmployeeSkills... elements) {
    List<EmployeeSkills> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableDiversityModelTeam(
        this.teamSize,
        this.genderDivision,
        this.jobTitleDivision,
        this.ageGroupDivision,
        this.experienceDivision,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DiversityModelTeam#employees() employees}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of employees elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiversityModelTeam withEmployees(Iterable<? extends EmployeeSkills> elements) {
    if (this.employees == elements) return this;
    List<EmployeeSkills> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableDiversityModelTeam(
        this.teamSize,
        this.genderDivision,
        this.jobTitleDivision,
        this.ageGroupDivision,
        this.experienceDivision,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDiversityModelTeam} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDiversityModelTeam
        && equalTo((ImmutableDiversityModelTeam) another);
  }

  private boolean equalTo(ImmutableDiversityModelTeam another) {
    return teamSize.equals(another.teamSize)
        && genderDivision.equals(another.genderDivision)
        && jobTitleDivision.equals(another.jobTitleDivision)
        && ageGroupDivision.equals(another.ageGroupDivision)
        && experienceDivision.equals(another.experienceDivision)
        && employees.equals(another.employees);
  }

  /**
   * Computes a hash code from attributes: {@code teamSize}, {@code genderDivision}, {@code jobTitleDivision}, {@code ageGroupDivision}, {@code experienceDivision}, {@code employees}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + teamSize.hashCode();
    h += (h << 5) + genderDivision.hashCode();
    h += (h << 5) + jobTitleDivision.hashCode();
    h += (h << 5) + ageGroupDivision.hashCode();
    h += (h << 5) + experienceDivision.hashCode();
    h += (h << 5) + employees.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DiversityModelTeam} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "DiversityModelTeam{"
        + "teamSize=" + teamSize
        + ", genderDivision=" + genderDivision
        + ", jobTitleDivision=" + jobTitleDivision
        + ", ageGroupDivision=" + ageGroupDivision
        + ", experienceDivision=" + experienceDivision
        + ", employees=" + employees
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link DiversityModelTeam} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DiversityModelTeam instance
   */
  public static ImmutableDiversityModelTeam copyOf(DiversityModelTeam instance) {
    if (instance instanceof ImmutableDiversityModelTeam) {
      return (ImmutableDiversityModelTeam) instance;
    }
    return ImmutableDiversityModelTeam.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDiversityModelTeam ImmutableDiversityModelTeam}.
   * <pre>
   * ImmutableDiversityModelTeam.builder()
   *    .teamSize(Integer) // required {@link DiversityModelTeam#teamSize() teamSize}
   *    .putGenderDivision|putAllGenderDivision(String => int) // {@link DiversityModelTeam#genderDivision() genderDivision} mappings
   *    .putJobTitleDivision|putAllJobTitleDivision(String => int) // {@link DiversityModelTeam#jobTitleDivision() jobTitleDivision} mappings
   *    .putAgeGroupDivision|putAllAgeGroupDivision(String => int) // {@link DiversityModelTeam#ageGroupDivision() ageGroupDivision} mappings
   *    .putExperienceDivision|putAllExperienceDivision(String => int) // {@link DiversityModelTeam#experienceDivision() experienceDivision} mappings
   *    .addEmployees|addAllEmployees(com.blackrock.hack21.drise.dao.EmployeeSkills) // {@link DiversityModelTeam#employees() employees} elements
   *    .build();
   * </pre>
   * @return A new ImmutableDiversityModelTeam builder
   */
  public static ImmutableDiversityModelTeam.Builder builder() {
    return new ImmutableDiversityModelTeam.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDiversityModelTeam ImmutableDiversityModelTeam}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DiversityModelTeam", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_TEAM_SIZE = 0x1L;
    private long initBits = 0x1L;

    private Integer teamSize;
    private Map<String, Integer> genderDivision = new LinkedHashMap<String, Integer>();
    private Map<String, Integer> jobTitleDivision = new LinkedHashMap<String, Integer>();
    private Map<String, Integer> ageGroupDivision = new LinkedHashMap<String, Integer>();
    private Map<String, Integer> experienceDivision = new LinkedHashMap<String, Integer>();
    private List<EmployeeSkills> employees = new ArrayList<EmployeeSkills>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DiversityModelTeam} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DiversityModelTeam instance) {
      Objects.requireNonNull(instance, "instance");
      teamSize(instance.teamSize());
      putAllGenderDivision(instance.genderDivision());
      putAllJobTitleDivision(instance.jobTitleDivision());
      putAllAgeGroupDivision(instance.ageGroupDivision());
      putAllExperienceDivision(instance.experienceDivision());
      addAllEmployees(instance.employees());
      return this;
    }

    /**
     * Initializes the value for the {@link DiversityModelTeam#teamSize() teamSize} attribute.
     * @param teamSize The value for teamSize 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("teamSize")
    public final Builder teamSize(Integer teamSize) {
      this.teamSize = Objects.requireNonNull(teamSize, "teamSize");
      initBits &= ~INIT_BIT_TEAM_SIZE;
      return this;
    }

    /**
     * Put one entry to the {@link DiversityModelTeam#genderDivision() genderDivision} map.
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
     * Put one entry to the {@link DiversityModelTeam#genderDivision() genderDivision} map. Nulls are not permitted
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
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityModelTeam#genderDivision() genderDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the genderDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("genderDivision")
    public final Builder genderDivision(Map<String, ? extends Integer> entries) {
      this.genderDivision.clear();
      return putAllGenderDivision(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityModelTeam#genderDivision() genderDivision} map. Nulls are not permitted
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
     * Put one entry to the {@link DiversityModelTeam#jobTitleDivision() jobTitleDivision} map.
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
     * Put one entry to the {@link DiversityModelTeam#jobTitleDivision() jobTitleDivision} map. Nulls are not permitted
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
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityModelTeam#jobTitleDivision() jobTitleDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the jobTitleDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jobTitleDivision")
    public final Builder jobTitleDivision(Map<String, ? extends Integer> entries) {
      this.jobTitleDivision.clear();
      return putAllJobTitleDivision(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityModelTeam#jobTitleDivision() jobTitleDivision} map. Nulls are not permitted
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
     * Put one entry to the {@link DiversityModelTeam#ageGroupDivision() ageGroupDivision} map.
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
     * Put one entry to the {@link DiversityModelTeam#ageGroupDivision() ageGroupDivision} map. Nulls are not permitted
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
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityModelTeam#ageGroupDivision() ageGroupDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the ageGroupDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ageGroupDivision")
    public final Builder ageGroupDivision(Map<String, ? extends Integer> entries) {
      this.ageGroupDivision.clear();
      return putAllAgeGroupDivision(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityModelTeam#ageGroupDivision() ageGroupDivision} map. Nulls are not permitted
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
     * Put one entry to the {@link DiversityModelTeam#experienceDivision() experienceDivision} map.
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
     * Put one entry to the {@link DiversityModelTeam#experienceDivision() experienceDivision} map. Nulls are not permitted
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
     * Sets or replaces all mappings from the specified map as entries for the {@link DiversityModelTeam#experienceDivision() experienceDivision} map. Nulls are not permitted
     * @param entries The entries that will be added to the experienceDivision map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("experienceDivision")
    public final Builder experienceDivision(Map<String, ? extends Integer> entries) {
      this.experienceDivision.clear();
      return putAllExperienceDivision(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link DiversityModelTeam#experienceDivision() experienceDivision} map. Nulls are not permitted
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
     * Adds one element to {@link DiversityModelTeam#employees() employees} list.
     * @param element A employees element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmployees(EmployeeSkills element) {
      this.employees.add(Objects.requireNonNull(element, "employees element"));
      return this;
    }

    /**
     * Adds elements to {@link DiversityModelTeam#employees() employees} list.
     * @param elements An array of employees elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmployees(EmployeeSkills... elements) {
      for (EmployeeSkills element : elements) {
        this.employees.add(Objects.requireNonNull(element, "employees element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link DiversityModelTeam#employees() employees} list.
     * @param elements An iterable of employees elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("employees")
    public final Builder employees(Iterable<? extends EmployeeSkills> elements) {
      this.employees.clear();
      return addAllEmployees(elements);
    }

    /**
     * Adds elements to {@link DiversityModelTeam#employees() employees} list.
     * @param elements An iterable of employees elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEmployees(Iterable<? extends EmployeeSkills> elements) {
      for (EmployeeSkills element : elements) {
        this.employees.add(Objects.requireNonNull(element, "employees element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableDiversityModelTeam ImmutableDiversityModelTeam}.
     * @return An immutable instance of DiversityModelTeam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDiversityModelTeam build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDiversityModelTeam(
          teamSize,
          createUnmodifiableMap(false, false, genderDivision),
          createUnmodifiableMap(false, false, jobTitleDivision),
          createUnmodifiableMap(false, false, ageGroupDivision),
          createUnmodifiableMap(false, false, experienceDivision),
          createUnmodifiableList(true, employees));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_TEAM_SIZE) != 0) attributes.add("teamSize");
      return "Cannot build DiversityModelTeam, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
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
