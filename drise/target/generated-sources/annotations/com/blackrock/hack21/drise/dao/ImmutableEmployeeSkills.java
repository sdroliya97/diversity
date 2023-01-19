package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link EmployeeSkills}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEmployeeSkills.builder()}.
 */
@Generated(from = "EmployeeSkills", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableEmployeeSkills implements EmployeeSkills {
  private final String name;
  private final String department;
  private final String primarySkill;
  private final String gender;
  private final List<String> skills;

  private ImmutableEmployeeSkills(
      String name,
      String department,
      String primarySkill,
      String gender,
      List<String> skills) {
    this.name = name;
    this.department = department;
    this.primarySkill = primarySkill;
    this.gender = gender;
    this.skills = skills;
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
   * @return The value of the {@code department} attribute
   */
  @JsonProperty("department")
  @Override
  public String department() {
    return department;
  }

  /**
   * @return The value of the {@code primarySkill} attribute
   */
  @JsonProperty("primarySkill")
  @Override
  public String primarySkill() {
    return primarySkill;
  }

  /**
   * @return The value of the {@code gender} attribute
   */
  @JsonProperty("gender")
  @Override
  public String gender() {
    return gender;
  }

  /**
   * @return The value of the {@code skills} attribute
   */
  @JsonProperty("skills")
  @Override
  public List<String> skills() {
    return skills;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmployeeSkills#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployeeSkills withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableEmployeeSkills(newValue, this.department, this.primarySkill, this.gender, this.skills);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmployeeSkills#department() department} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for department
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployeeSkills withDepartment(String value) {
    String newValue = Objects.requireNonNull(value, "department");
    if (this.department.equals(newValue)) return this;
    return new ImmutableEmployeeSkills(this.name, newValue, this.primarySkill, this.gender, this.skills);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmployeeSkills#primarySkill() primarySkill} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for primarySkill
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployeeSkills withPrimarySkill(String value) {
    String newValue = Objects.requireNonNull(value, "primarySkill");
    if (this.primarySkill.equals(newValue)) return this;
    return new ImmutableEmployeeSkills(this.name, this.department, newValue, this.gender, this.skills);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmployeeSkills#gender() gender} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gender
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployeeSkills withGender(String value) {
    String newValue = Objects.requireNonNull(value, "gender");
    if (this.gender.equals(newValue)) return this;
    return new ImmutableEmployeeSkills(this.name, this.department, this.primarySkill, newValue, this.skills);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EmployeeSkills#skills() skills}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmployeeSkills withSkills(String... elements) {
    List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableEmployeeSkills(this.name, this.department, this.primarySkill, this.gender, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EmployeeSkills#skills() skills}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of skills elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmployeeSkills withSkills(Iterable<String> elements) {
    if (this.skills == elements) return this;
    List<String> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableEmployeeSkills(this.name, this.department, this.primarySkill, this.gender, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEmployeeSkills} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEmployeeSkills
        && equalTo((ImmutableEmployeeSkills) another);
  }

  private boolean equalTo(ImmutableEmployeeSkills another) {
    return name.equals(another.name)
        && department.equals(another.department)
        && primarySkill.equals(another.primarySkill)
        && gender.equals(another.gender)
        && skills.equals(another.skills);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code department}, {@code primarySkill}, {@code gender}, {@code skills}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + department.hashCode();
    h += (h << 5) + primarySkill.hashCode();
    h += (h << 5) + gender.hashCode();
    h += (h << 5) + skills.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EmployeeSkills} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EmployeeSkills{"
        + "name=" + name
        + ", department=" + department
        + ", primarySkill=" + primarySkill
        + ", gender=" + gender
        + ", skills=" + skills
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link EmployeeSkills} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EmployeeSkills instance
   */
  public static ImmutableEmployeeSkills copyOf(EmployeeSkills instance) {
    if (instance instanceof ImmutableEmployeeSkills) {
      return (ImmutableEmployeeSkills) instance;
    }
    return ImmutableEmployeeSkills.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEmployeeSkills ImmutableEmployeeSkills}.
   * <pre>
   * ImmutableEmployeeSkills.builder()
   *    .name(String) // required {@link EmployeeSkills#name() name}
   *    .department(String) // required {@link EmployeeSkills#department() department}
   *    .primarySkill(String) // required {@link EmployeeSkills#primarySkill() primarySkill}
   *    .gender(String) // required {@link EmployeeSkills#gender() gender}
   *    .addSkills|addAllSkills(String) // {@link EmployeeSkills#skills() skills} elements
   *    .build();
   * </pre>
   * @return A new ImmutableEmployeeSkills builder
   */
  public static ImmutableEmployeeSkills.Builder builder() {
    return new ImmutableEmployeeSkills.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEmployeeSkills ImmutableEmployeeSkills}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EmployeeSkills", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_DEPARTMENT = 0x2L;
    private static final long INIT_BIT_PRIMARY_SKILL = 0x4L;
    private static final long INIT_BIT_GENDER = 0x8L;
    private long initBits = 0xfL;

    private String name;
    private String department;
    private String primarySkill;
    private String gender;
    private List<String> skills = new ArrayList<String>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EmployeeSkills} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EmployeeSkills instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      department(instance.department());
      primarySkill(instance.primarySkill());
      gender(instance.gender());
      addAllSkills(instance.skills());
      return this;
    }

    /**
     * Initializes the value for the {@link EmployeeSkills#name() name} attribute.
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
     * Initializes the value for the {@link EmployeeSkills#department() department} attribute.
     * @param department The value for department 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("department")
    public final Builder department(String department) {
      this.department = Objects.requireNonNull(department, "department");
      initBits &= ~INIT_BIT_DEPARTMENT;
      return this;
    }

    /**
     * Initializes the value for the {@link EmployeeSkills#primarySkill() primarySkill} attribute.
     * @param primarySkill The value for primarySkill 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("primarySkill")
    public final Builder primarySkill(String primarySkill) {
      this.primarySkill = Objects.requireNonNull(primarySkill, "primarySkill");
      initBits &= ~INIT_BIT_PRIMARY_SKILL;
      return this;
    }

    /**
     * Initializes the value for the {@link EmployeeSkills#gender() gender} attribute.
     * @param gender The value for gender 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gender")
    public final Builder gender(String gender) {
      this.gender = Objects.requireNonNull(gender, "gender");
      initBits &= ~INIT_BIT_GENDER;
      return this;
    }

    /**
     * Adds one element to {@link EmployeeSkills#skills() skills} list.
     * @param element A skills element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSkills(String element) {
      this.skills.add(Objects.requireNonNull(element, "skills element"));
      return this;
    }

    /**
     * Adds elements to {@link EmployeeSkills#skills() skills} list.
     * @param elements An array of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSkills(String... elements) {
      for (String element : elements) {
        this.skills.add(Objects.requireNonNull(element, "skills element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link EmployeeSkills#skills() skills} list.
     * @param elements An iterable of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("skills")
    public final Builder skills(Iterable<String> elements) {
      this.skills.clear();
      return addAllSkills(elements);
    }

    /**
     * Adds elements to {@link EmployeeSkills#skills() skills} list.
     * @param elements An iterable of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSkills(Iterable<String> elements) {
      for (String element : elements) {
        this.skills.add(Objects.requireNonNull(element, "skills element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableEmployeeSkills ImmutableEmployeeSkills}.
     * @return An immutable instance of EmployeeSkills
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEmployeeSkills build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEmployeeSkills(name, department, primarySkill, gender, createUnmodifiableList(true, skills));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_DEPARTMENT) != 0) attributes.add("department");
      if ((initBits & INIT_BIT_PRIMARY_SKILL) != 0) attributes.add("primarySkill");
      if ((initBits & INIT_BIT_GENDER) != 0) attributes.add("gender");
      return "Cannot build EmployeeSkills, some of required attributes are not set " + attributes;
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
}
