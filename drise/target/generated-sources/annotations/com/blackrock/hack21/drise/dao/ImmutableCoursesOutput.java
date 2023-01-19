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
 * Immutable implementation of {@link CoursesOutput}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoursesOutput.builder()}.
 */
@Generated(from = "CoursesOutput", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableCoursesOutput implements CoursesOutput {
  private final Integer answerScore;
  private final List<CourseDetails> courseDetails;

  private ImmutableCoursesOutput(
      Integer answerScore,
      List<CourseDetails> courseDetails) {
    this.answerScore = answerScore;
    this.courseDetails = courseDetails;
  }

  /**
   * @return The value of the {@code answerScore} attribute
   */
  @JsonProperty("answerScore")
  @Override
  public Integer answerScore() {
    return answerScore;
  }

  /**
   * @return The value of the {@code courseDetails} attribute
   */
  @JsonProperty("courseDetails")
  @Override
  public List<CourseDetails> courseDetails() {
    return courseDetails;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoursesOutput#answerScore() answerScore} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for answerScore
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoursesOutput withAnswerScore(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "answerScore");
    if (this.answerScore.equals(newValue)) return this;
    return new ImmutableCoursesOutput(newValue, this.courseDetails);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CoursesOutput#courseDetails() courseDetails}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoursesOutput withCourseDetails(CourseDetails... elements) {
    List<CourseDetails> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableCoursesOutput(this.answerScore, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CoursesOutput#courseDetails() courseDetails}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of courseDetails elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoursesOutput withCourseDetails(Iterable<? extends CourseDetails> elements) {
    if (this.courseDetails == elements) return this;
    List<CourseDetails> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableCoursesOutput(this.answerScore, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoursesOutput} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoursesOutput
        && equalTo((ImmutableCoursesOutput) another);
  }

  private boolean equalTo(ImmutableCoursesOutput another) {
    return answerScore.equals(another.answerScore)
        && courseDetails.equals(another.courseDetails);
  }

  /**
   * Computes a hash code from attributes: {@code answerScore}, {@code courseDetails}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + answerScore.hashCode();
    h += (h << 5) + courseDetails.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CoursesOutput} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CoursesOutput{"
        + "answerScore=" + answerScore
        + ", courseDetails=" + courseDetails
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link CoursesOutput} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoursesOutput instance
   */
  public static ImmutableCoursesOutput copyOf(CoursesOutput instance) {
    if (instance instanceof ImmutableCoursesOutput) {
      return (ImmutableCoursesOutput) instance;
    }
    return ImmutableCoursesOutput.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCoursesOutput ImmutableCoursesOutput}.
   * <pre>
   * ImmutableCoursesOutput.builder()
   *    .answerScore(Integer) // required {@link CoursesOutput#answerScore() answerScore}
   *    .addCourseDetails|addAllCourseDetails(com.blackrock.hack21.drise.dao.CourseDetails) // {@link CoursesOutput#courseDetails() courseDetails} elements
   *    .build();
   * </pre>
   * @return A new ImmutableCoursesOutput builder
   */
  public static ImmutableCoursesOutput.Builder builder() {
    return new ImmutableCoursesOutput.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCoursesOutput ImmutableCoursesOutput}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CoursesOutput", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ANSWER_SCORE = 0x1L;
    private long initBits = 0x1L;

    private Integer answerScore;
    private List<CourseDetails> courseDetails = new ArrayList<CourseDetails>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CoursesOutput} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CoursesOutput instance) {
      Objects.requireNonNull(instance, "instance");
      answerScore(instance.answerScore());
      addAllCourseDetails(instance.courseDetails());
      return this;
    }

    /**
     * Initializes the value for the {@link CoursesOutput#answerScore() answerScore} attribute.
     * @param answerScore The value for answerScore 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerScore")
    public final Builder answerScore(Integer answerScore) {
      this.answerScore = Objects.requireNonNull(answerScore, "answerScore");
      initBits &= ~INIT_BIT_ANSWER_SCORE;
      return this;
    }

    /**
     * Adds one element to {@link CoursesOutput#courseDetails() courseDetails} list.
     * @param element A courseDetails element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCourseDetails(CourseDetails element) {
      this.courseDetails.add(Objects.requireNonNull(element, "courseDetails element"));
      return this;
    }

    /**
     * Adds elements to {@link CoursesOutput#courseDetails() courseDetails} list.
     * @param elements An array of courseDetails elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCourseDetails(CourseDetails... elements) {
      for (CourseDetails element : elements) {
        this.courseDetails.add(Objects.requireNonNull(element, "courseDetails element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link CoursesOutput#courseDetails() courseDetails} list.
     * @param elements An iterable of courseDetails elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("courseDetails")
    public final Builder courseDetails(Iterable<? extends CourseDetails> elements) {
      this.courseDetails.clear();
      return addAllCourseDetails(elements);
    }

    /**
     * Adds elements to {@link CoursesOutput#courseDetails() courseDetails} list.
     * @param elements An iterable of courseDetails elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllCourseDetails(Iterable<? extends CourseDetails> elements) {
      for (CourseDetails element : elements) {
        this.courseDetails.add(Objects.requireNonNull(element, "courseDetails element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableCoursesOutput ImmutableCoursesOutput}.
     * @return An immutable instance of CoursesOutput
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCoursesOutput build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCoursesOutput(answerScore, createUnmodifiableList(true, courseDetails));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ANSWER_SCORE) != 0) attributes.add("answerScore");
      return "Cannot build CoursesOutput, some of required attributes are not set " + attributes;
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
