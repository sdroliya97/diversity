package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Answer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAnswer.builder()}.
 */
@Generated(from = "Answer", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableAnswer implements Answer {
  private final Long id;
  private final Long questionId;
  private final Boolean answeredAnon;
  private final Date timestamp;
  private final Employee employee;
  private final String answer;
  private final Integer[] upvotes;
  private final Integer[] downvotes;
  private final @Nullable DiversityResult sentiment;

  private ImmutableAnswer(
      Long id,
      Long questionId,
      Boolean answeredAnon,
      Date timestamp,
      Employee employee,
      String answer,
      Integer[] upvotes,
      Integer[] downvotes,
      @Nullable DiversityResult sentiment) {
    this.id = id;
    this.questionId = questionId;
    this.answeredAnon = answeredAnon;
    this.timestamp = timestamp;
    this.employee = employee;
    this.answer = answer;
    this.upvotes = upvotes;
    this.downvotes = downvotes;
    this.sentiment = sentiment;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Long id() {
    return id;
  }

  /**
   * @return The value of the {@code questionId} attribute
   */
  @JsonProperty("questionId")
  @Override
  public Long questionId() {
    return questionId;
  }

  /**
   * @return The value of the {@code answeredAnon} attribute
   */
  @JsonProperty("answeredAnon")
  @Override
  public Boolean answeredAnon() {
    return answeredAnon;
  }

  /**
   * @return The value of the {@code timestamp} attribute
   */
  @JsonProperty("timestamp")
  @Override
  public Date timestamp() {
    return timestamp;
  }

  /**
   * @return The value of the {@code employee} attribute
   */
  @JsonProperty("employee")
  @Override
  public Employee employee() {
    return employee;
  }

  /**
   * @return The value of the {@code answer} attribute
   */
  @JsonProperty("answer")
  @Override
  public String answer() {
    return answer;
  }

  /**
   * @return A cloned {@code upvotes} array
   */
  @JsonProperty("upvotes")
  @Override
  public Integer[] upvotes() {
    return upvotes.clone();
  }

  /**
   * @return A cloned {@code downvotes} array
   */
  @JsonProperty("downvotes")
  @Override
  public Integer[] downvotes() {
    return downvotes.clone();
  }

  /**
   * @return The value of the {@code sentiment} attribute
   */
  @JsonProperty("sentiment")
  @Override
  public @Nullable DiversityResult sentiment() {
    return sentiment;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Answer#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnswer withId(Long value) {
    Long newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableAnswer(
        newValue,
        this.questionId,
        this.answeredAnon,
        this.timestamp,
        this.employee,
        this.answer,
        this.upvotes,
        this.downvotes,
        this.sentiment);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Answer#questionId() questionId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for questionId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnswer withQuestionId(Long value) {
    Long newValue = Objects.requireNonNull(value, "questionId");
    if (this.questionId.equals(newValue)) return this;
    return new ImmutableAnswer(
        this.id,
        newValue,
        this.answeredAnon,
        this.timestamp,
        this.employee,
        this.answer,
        this.upvotes,
        this.downvotes,
        this.sentiment);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Answer#answeredAnon() answeredAnon} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for answeredAnon
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnswer withAnsweredAnon(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "answeredAnon");
    if (this.answeredAnon.equals(newValue)) return this;
    return new ImmutableAnswer(
        this.id,
        this.questionId,
        newValue,
        this.timestamp,
        this.employee,
        this.answer,
        this.upvotes,
        this.downvotes,
        this.sentiment);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Answer#timestamp() timestamp} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timestamp
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnswer withTimestamp(Date value) {
    if (this.timestamp == value) return this;
    Date newValue = Objects.requireNonNull(value, "timestamp");
    return new ImmutableAnswer(
        this.id,
        this.questionId,
        this.answeredAnon,
        newValue,
        this.employee,
        this.answer,
        this.upvotes,
        this.downvotes,
        this.sentiment);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Answer#employee() employee} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for employee
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnswer withEmployee(Employee value) {
    if (this.employee == value) return this;
    Employee newValue = Objects.requireNonNull(value, "employee");
    return new ImmutableAnswer(
        this.id,
        this.questionId,
        this.answeredAnon,
        this.timestamp,
        newValue,
        this.answer,
        this.upvotes,
        this.downvotes,
        this.sentiment);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Answer#answer() answer} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for answer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnswer withAnswer(String value) {
    String newValue = Objects.requireNonNull(value, "answer");
    if (this.answer.equals(newValue)) return this;
    return new ImmutableAnswer(
        this.id,
        this.questionId,
        this.answeredAnon,
        this.timestamp,
        this.employee,
        newValue,
        this.upvotes,
        this.downvotes,
        this.sentiment);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Answer#upvotes() upvotes}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for upvotes
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnswer withUpvotes(Integer... elements) {
    Integer[] newValue = elements.clone();
    return new ImmutableAnswer(
        this.id,
        this.questionId,
        this.answeredAnon,
        this.timestamp,
        this.employee,
        this.answer,
        newValue,
        this.downvotes,
        this.sentiment);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Answer#downvotes() downvotes}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for downvotes
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnswer withDownvotes(Integer... elements) {
    Integer[] newValue = elements.clone();
    return new ImmutableAnswer(
        this.id,
        this.questionId,
        this.answeredAnon,
        this.timestamp,
        this.employee,
        this.answer,
        this.upvotes,
        newValue,
        this.sentiment);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Answer#sentiment() sentiment} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sentiment (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnswer withSentiment(@Nullable DiversityResult value) {
    if (this.sentiment == value) return this;
    return new ImmutableAnswer(
        this.id,
        this.questionId,
        this.answeredAnon,
        this.timestamp,
        this.employee,
        this.answer,
        this.upvotes,
        this.downvotes,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAnswer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAnswer
        && equalTo((ImmutableAnswer) another);
  }

  private boolean equalTo(ImmutableAnswer another) {
    return id.equals(another.id)
        && questionId.equals(another.questionId)
        && answeredAnon.equals(another.answeredAnon)
        && timestamp.equals(another.timestamp)
        && employee.equals(another.employee)
        && answer.equals(another.answer)
        && Arrays.equals(upvotes, another.upvotes)
        && Arrays.equals(downvotes, another.downvotes)
        && Objects.equals(sentiment, another.sentiment);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code questionId}, {@code answeredAnon}, {@code timestamp}, {@code employee}, {@code answer}, {@code upvotes}, {@code downvotes}, {@code sentiment}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + questionId.hashCode();
    h += (h << 5) + answeredAnon.hashCode();
    h += (h << 5) + timestamp.hashCode();
    h += (h << 5) + employee.hashCode();
    h += (h << 5) + answer.hashCode();
    h += (h << 5) + Arrays.hashCode(upvotes);
    h += (h << 5) + Arrays.hashCode(downvotes);
    h += (h << 5) + Objects.hashCode(sentiment);
    return h;
  }

  /**
   * Prints the immutable value {@code Answer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Answer{"
        + "id=" + id
        + ", questionId=" + questionId
        + ", answeredAnon=" + answeredAnon
        + ", timestamp=" + timestamp
        + ", employee=" + employee
        + ", answer=" + answer
        + ", upvotes=" + Arrays.toString(upvotes)
        + ", downvotes=" + Arrays.toString(downvotes)
        + ", sentiment=" + sentiment
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Answer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Answer instance
   */
  public static ImmutableAnswer copyOf(Answer instance) {
    if (instance instanceof ImmutableAnswer) {
      return (ImmutableAnswer) instance;
    }
    return ImmutableAnswer.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAnswer ImmutableAnswer}.
   * <pre>
   * ImmutableAnswer.builder()
   *    .id(Long) // required {@link Answer#id() id}
   *    .questionId(Long) // required {@link Answer#questionId() questionId}
   *    .answeredAnon(Boolean) // required {@link Answer#answeredAnon() answeredAnon}
   *    .timestamp(Date) // required {@link Answer#timestamp() timestamp}
   *    .employee(com.blackrock.hack21.drise.dao.Employee) // required {@link Answer#employee() employee}
   *    .answer(String) // required {@link Answer#answer() answer}
   *    .upvotes(Integer) // required {@link Answer#upvotes() upvotes}
   *    .downvotes(Integer) // required {@link Answer#downvotes() downvotes}
   *    .sentiment(com.blackrock.hack21.drise.dao.DiversityResult | null) // nullable {@link Answer#sentiment() sentiment}
   *    .build();
   * </pre>
   * @return A new ImmutableAnswer builder
   */
  public static ImmutableAnswer.Builder builder() {
    return new ImmutableAnswer.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAnswer ImmutableAnswer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Answer", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_QUESTION_ID = 0x2L;
    private static final long INIT_BIT_ANSWERED_ANON = 0x4L;
    private static final long INIT_BIT_TIMESTAMP = 0x8L;
    private static final long INIT_BIT_EMPLOYEE = 0x10L;
    private static final long INIT_BIT_ANSWER = 0x20L;
    private static final long INIT_BIT_UPVOTES = 0x40L;
    private static final long INIT_BIT_DOWNVOTES = 0x80L;
    private long initBits = 0xffL;

    private Long id;
    private Long questionId;
    private Boolean answeredAnon;
    private Date timestamp;
    private Employee employee;
    private String answer;
    private Integer[] upvotes;
    private Integer[] downvotes;
    private DiversityResult sentiment;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Answer} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Answer instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      questionId(instance.questionId());
      answeredAnon(instance.answeredAnon());
      timestamp(instance.timestamp());
      employee(instance.employee());
      answer(instance.answer());
      upvotes(instance.upvotes());
      downvotes(instance.downvotes());
      @Nullable DiversityResult sentimentValue = instance.sentiment();
      if (sentimentValue != null) {
        sentiment(sentimentValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Answer#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Long id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Answer#questionId() questionId} attribute.
     * @param questionId The value for questionId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("questionId")
    public final Builder questionId(Long questionId) {
      this.questionId = Objects.requireNonNull(questionId, "questionId");
      initBits &= ~INIT_BIT_QUESTION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Answer#answeredAnon() answeredAnon} attribute.
     * @param answeredAnon The value for answeredAnon 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answeredAnon")
    public final Builder answeredAnon(Boolean answeredAnon) {
      this.answeredAnon = Objects.requireNonNull(answeredAnon, "answeredAnon");
      initBits &= ~INIT_BIT_ANSWERED_ANON;
      return this;
    }

    /**
     * Initializes the value for the {@link Answer#timestamp() timestamp} attribute.
     * @param timestamp The value for timestamp 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timestamp")
    public final Builder timestamp(Date timestamp) {
      this.timestamp = Objects.requireNonNull(timestamp, "timestamp");
      initBits &= ~INIT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the value for the {@link Answer#employee() employee} attribute.
     * @param employee The value for employee 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("employee")
    public final Builder employee(Employee employee) {
      this.employee = Objects.requireNonNull(employee, "employee");
      initBits &= ~INIT_BIT_EMPLOYEE;
      return this;
    }

    /**
     * Initializes the value for the {@link Answer#answer() answer} attribute.
     * @param answer The value for answer 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answer")
    public final Builder answer(String answer) {
      this.answer = Objects.requireNonNull(answer, "answer");
      initBits &= ~INIT_BIT_ANSWER;
      return this;
    }

    /**
     * Initializes the value for the {@link Answer#upvotes() upvotes} attribute.
     * @param upvotes The elements for upvotes
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("upvotes")
    public final Builder upvotes(Integer... upvotes) {
      this.upvotes = upvotes.clone();
      initBits &= ~INIT_BIT_UPVOTES;
      return this;
    }

    /**
     * Initializes the value for the {@link Answer#downvotes() downvotes} attribute.
     * @param downvotes The elements for downvotes
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("downvotes")
    public final Builder downvotes(Integer... downvotes) {
      this.downvotes = downvotes.clone();
      initBits &= ~INIT_BIT_DOWNVOTES;
      return this;
    }

    /**
     * Initializes the value for the {@link Answer#sentiment() sentiment} attribute.
     * @param sentiment The value for sentiment (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sentiment")
    public final Builder sentiment(@Nullable DiversityResult sentiment) {
      this.sentiment = sentiment;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAnswer ImmutableAnswer}.
     * @return An immutable instance of Answer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAnswer build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAnswer(id, questionId, answeredAnon, timestamp, employee, answer, upvotes, downvotes, sentiment);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_QUESTION_ID) != 0) attributes.add("questionId");
      if ((initBits & INIT_BIT_ANSWERED_ANON) != 0) attributes.add("answeredAnon");
      if ((initBits & INIT_BIT_TIMESTAMP) != 0) attributes.add("timestamp");
      if ((initBits & INIT_BIT_EMPLOYEE) != 0) attributes.add("employee");
      if ((initBits & INIT_BIT_ANSWER) != 0) attributes.add("answer");
      if ((initBits & INIT_BIT_UPVOTES) != 0) attributes.add("upvotes");
      if ((initBits & INIT_BIT_DOWNVOTES) != 0) attributes.add("downvotes");
      return "Cannot build Answer, some of required attributes are not set " + attributes;
    }
  }
}
