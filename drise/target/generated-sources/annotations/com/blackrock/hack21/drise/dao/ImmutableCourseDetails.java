package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link CourseDetails}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCourseDetails.builder()}.
 */
@Generated(from = "CourseDetails", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableCourseDetails implements CourseDetails {
  private final String category;
  private final String name;
  private final String courseLink;

  private ImmutableCourseDetails(String category, String name, String courseLink) {
    this.category = category;
    this.name = name;
    this.courseLink = courseLink;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public String category() {
    return category;
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
   * @return The value of the {@code courseLink} attribute
   */
  @JsonProperty("courseLink")
  @Override
  public String courseLink() {
    return courseLink;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CourseDetails#category() category} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCourseDetails withCategory(String value) {
    String newValue = Objects.requireNonNull(value, "category");
    if (this.category.equals(newValue)) return this;
    return new ImmutableCourseDetails(newValue, this.name, this.courseLink);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CourseDetails#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCourseDetails withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableCourseDetails(this.category, newValue, this.courseLink);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CourseDetails#courseLink() courseLink} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for courseLink
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCourseDetails withCourseLink(String value) {
    String newValue = Objects.requireNonNull(value, "courseLink");
    if (this.courseLink.equals(newValue)) return this;
    return new ImmutableCourseDetails(this.category, this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCourseDetails} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCourseDetails
        && equalTo((ImmutableCourseDetails) another);
  }

  private boolean equalTo(ImmutableCourseDetails another) {
    return category.equals(another.category)
        && name.equals(another.name)
        && courseLink.equals(another.courseLink);
  }

  /**
   * Computes a hash code from attributes: {@code category}, {@code name}, {@code courseLink}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + category.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + courseLink.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CourseDetails} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CourseDetails{"
        + "category=" + category
        + ", name=" + name
        + ", courseLink=" + courseLink
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link CourseDetails} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CourseDetails instance
   */
  public static ImmutableCourseDetails copyOf(CourseDetails instance) {
    if (instance instanceof ImmutableCourseDetails) {
      return (ImmutableCourseDetails) instance;
    }
    return ImmutableCourseDetails.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCourseDetails ImmutableCourseDetails}.
   * <pre>
   * ImmutableCourseDetails.builder()
   *    .category(String) // required {@link CourseDetails#category() category}
   *    .name(String) // required {@link CourseDetails#name() name}
   *    .courseLink(String) // required {@link CourseDetails#courseLink() courseLink}
   *    .build();
   * </pre>
   * @return A new ImmutableCourseDetails builder
   */
  public static ImmutableCourseDetails.Builder builder() {
    return new ImmutableCourseDetails.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCourseDetails ImmutableCourseDetails}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CourseDetails", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_CATEGORY = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_COURSE_LINK = 0x4L;
    private long initBits = 0x7L;

    private String category;
    private String name;
    private String courseLink;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CourseDetails} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CourseDetails instance) {
      Objects.requireNonNull(instance, "instance");
      category(instance.category());
      name(instance.name());
      courseLink(instance.courseLink());
      return this;
    }

    /**
     * Initializes the value for the {@link CourseDetails#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(String category) {
      this.category = Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the value for the {@link CourseDetails#name() name} attribute.
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
     * Initializes the value for the {@link CourseDetails#courseLink() courseLink} attribute.
     * @param courseLink The value for courseLink 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("courseLink")
    public final Builder courseLink(String courseLink) {
      this.courseLink = Objects.requireNonNull(courseLink, "courseLink");
      initBits &= ~INIT_BIT_COURSE_LINK;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCourseDetails ImmutableCourseDetails}.
     * @return An immutable instance of CourseDetails
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCourseDetails build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCourseDetails(category, name, courseLink);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_CATEGORY) != 0) attributes.add("category");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_COURSE_LINK) != 0) attributes.add("courseLink");
      return "Cannot build CourseDetails, some of required attributes are not set " + attributes;
    }
  }
}
