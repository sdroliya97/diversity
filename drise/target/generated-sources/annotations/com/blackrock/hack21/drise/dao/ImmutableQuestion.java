package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Question}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestion.builder()}.
 */
@Generated(from = "Question", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableQuestion implements Question {
  private final Long id;
  private final Date timestamp;
  private final Boolean askedAnon;
  private final String questionTitle;
  private final Employee employee;
  private final List<Answer> answers;

  private ImmutableQuestion(
      Long id,
      Date timestamp,
      Boolean askedAnon,
      String questionTitle,
      Employee employee,
      List<Answer> answers) {
    this.id = id;
    this.timestamp = timestamp;
    this.askedAnon = askedAnon;
    this.questionTitle = questionTitle;
    this.employee = employee;
    this.answers = answers;
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
   * @return The value of the {@code timestamp} attribute
   */
  @JsonProperty("timestamp")
  @Override
  public Date timestamp() {
    return timestamp;
  }

  /**
   * @return The value of the {@code askedAnon} attribute
   */
  @JsonProperty("askedAnon")
  @Override
  public Boolean askedAnon() {
    return askedAnon;
  }

  /**
   * @return The value of the {@code questionTitle} attribute
   */
  @JsonProperty("questionTitle")
  @Override
  public String questionTitle() {
    return questionTitle;
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
   * @return The value of the {@code answers} attribute
   */
  @JsonProperty("answers")
  @Override
  public List<Answer> answers() {
    return answers;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Question#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestion withId(Long value) {
    Long newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableQuestion(newValue, this.timestamp, this.askedAnon, this.questionTitle, this.employee, this.answers);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Question#timestamp() timestamp} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timestamp
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestion withTimestamp(Date value) {
    if (this.timestamp == value) return this;
    Date newValue = Objects.requireNonNull(value, "timestamp");
    return new ImmutableQuestion(this.id, newValue, this.askedAnon, this.questionTitle, this.employee, this.answers);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Question#askedAnon() askedAnon} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for askedAnon
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestion withAskedAnon(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "askedAnon");
    if (this.askedAnon.equals(newValue)) return this;
    return new ImmutableQuestion(this.id, this.timestamp, newValue, this.questionTitle, this.employee, this.answers);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Question#questionTitle() questionTitle} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for questionTitle
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestion withQuestionTitle(String value) {
    String newValue = Objects.requireNonNull(value, "questionTitle");
    if (this.questionTitle.equals(newValue)) return this;
    return new ImmutableQuestion(this.id, this.timestamp, this.askedAnon, newValue, this.employee, this.answers);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Question#employee() employee} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for employee
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestion withEmployee(Employee value) {
    if (this.employee == value) return this;
    Employee newValue = Objects.requireNonNull(value, "employee");
    return new ImmutableQuestion(this.id, this.timestamp, this.askedAnon, this.questionTitle, newValue, this.answers);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Question#answers() answers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestion withAnswers(Answer... elements) {
    List<Answer> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableQuestion(this.id, this.timestamp, this.askedAnon, this.questionTitle, this.employee, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Question#answers() answers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of answers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestion withAnswers(Iterable<? extends Answer> elements) {
    if (this.answers == elements) return this;
    List<Answer> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableQuestion(this.id, this.timestamp, this.askedAnon, this.questionTitle, this.employee, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestion} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestion
        && equalTo((ImmutableQuestion) another);
  }

  private boolean equalTo(ImmutableQuestion another) {
    return id.equals(another.id)
        && timestamp.equals(another.timestamp)
        && askedAnon.equals(another.askedAnon)
        && questionTitle.equals(another.questionTitle)
        && employee.equals(another.employee)
        && answers.equals(another.answers);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code timestamp}, {@code askedAnon}, {@code questionTitle}, {@code employee}, {@code answers}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + timestamp.hashCode();
    h += (h << 5) + askedAnon.hashCode();
    h += (h << 5) + questionTitle.hashCode();
    h += (h << 5) + employee.hashCode();
    h += (h << 5) + answers.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Question} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Question{"
        + "id=" + id
        + ", timestamp=" + timestamp
        + ", askedAnon=" + askedAnon
        + ", questionTitle=" + questionTitle
        + ", employee=" + employee
        + ", answers=" + answers
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Question} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Question instance
   */
  public static ImmutableQuestion copyOf(Question instance) {
    if (instance instanceof ImmutableQuestion) {
      return (ImmutableQuestion) instance;
    }
    return ImmutableQuestion.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableQuestion ImmutableQuestion}.
   * <pre>
   * ImmutableQuestion.builder()
   *    .id(Long) // required {@link Question#id() id}
   *    .timestamp(Date) // required {@link Question#timestamp() timestamp}
   *    .askedAnon(Boolean) // required {@link Question#askedAnon() askedAnon}
   *    .questionTitle(String) // required {@link Question#questionTitle() questionTitle}
   *    .employee(com.blackrock.hack21.drise.dao.Employee) // required {@link Question#employee() employee}
   *    .addAnswers|addAllAnswers(com.blackrock.hack21.drise.dao.Answer) // {@link Question#answers() answers} elements
   *    .build();
   * </pre>
   * @return A new ImmutableQuestion builder
   */
  public static ImmutableQuestion.Builder builder() {
    return new ImmutableQuestion.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableQuestion ImmutableQuestion}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Question", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_TIMESTAMP = 0x2L;
    private static final long INIT_BIT_ASKED_ANON = 0x4L;
    private static final long INIT_BIT_QUESTION_TITLE = 0x8L;
    private static final long INIT_BIT_EMPLOYEE = 0x10L;
    private long initBits = 0x1fL;

    private Long id;
    private Date timestamp;
    private Boolean askedAnon;
    private String questionTitle;
    private Employee employee;
    private List<Answer> answers = new ArrayList<Answer>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Question} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Question instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      timestamp(instance.timestamp());
      askedAnon(instance.askedAnon());
      questionTitle(instance.questionTitle());
      employee(instance.employee());
      addAllAnswers(instance.answers());
      return this;
    }

    /**
     * Initializes the value for the {@link Question#id() id} attribute.
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
     * Initializes the value for the {@link Question#timestamp() timestamp} attribute.
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
     * Initializes the value for the {@link Question#askedAnon() askedAnon} attribute.
     * @param askedAnon The value for askedAnon 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("askedAnon")
    public final Builder askedAnon(Boolean askedAnon) {
      this.askedAnon = Objects.requireNonNull(askedAnon, "askedAnon");
      initBits &= ~INIT_BIT_ASKED_ANON;
      return this;
    }

    /**
     * Initializes the value for the {@link Question#questionTitle() questionTitle} attribute.
     * @param questionTitle The value for questionTitle 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("questionTitle")
    public final Builder questionTitle(String questionTitle) {
      this.questionTitle = Objects.requireNonNull(questionTitle, "questionTitle");
      initBits &= ~INIT_BIT_QUESTION_TITLE;
      return this;
    }

    /**
     * Initializes the value for the {@link Question#employee() employee} attribute.
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
     * Adds one element to {@link Question#answers() answers} list.
     * @param element A answers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnswers(Answer element) {
      this.answers.add(Objects.requireNonNull(element, "answers element"));
      return this;
    }

    /**
     * Adds elements to {@link Question#answers() answers} list.
     * @param elements An array of answers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnswers(Answer... elements) {
      for (Answer element : elements) {
        this.answers.add(Objects.requireNonNull(element, "answers element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link Question#answers() answers} list.
     * @param elements An iterable of answers elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answers")
    public final Builder answers(Iterable<? extends Answer> elements) {
      this.answers.clear();
      return addAllAnswers(elements);
    }

    /**
     * Adds elements to {@link Question#answers() answers} list.
     * @param elements An iterable of answers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAnswers(Iterable<? extends Answer> elements) {
      for (Answer element : elements) {
        this.answers.add(Objects.requireNonNull(element, "answers element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableQuestion ImmutableQuestion}.
     * @return An immutable instance of Question
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableQuestion build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableQuestion(id, timestamp, askedAnon, questionTitle, employee, createUnmodifiableList(true, answers));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_TIMESTAMP) != 0) attributes.add("timestamp");
      if ((initBits & INIT_BIT_ASKED_ANON) != 0) attributes.add("askedAnon");
      if ((initBits & INIT_BIT_QUESTION_TITLE) != 0) attributes.add("questionTitle");
      if ((initBits & INIT_BIT_EMPLOYEE) != 0) attributes.add("employee");
      return "Cannot build Question, some of required attributes are not set " + attributes;
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
