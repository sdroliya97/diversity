package com.blackrock.hack21.drise.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link QuestionInput}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionInput.builder()}.
 */
@Generated(from = "QuestionInput", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableQuestionInput implements QuestionInput {
  private final String question;
  private final String answer;
  private final String correctAnswer;

  private ImmutableQuestionInput(String question, String answer, String correctAnswer) {
    this.question = question;
    this.answer = answer;
    this.correctAnswer = correctAnswer;
  }

  /**
   * @return The value of the {@code question} attribute
   */
  @JsonProperty("question")
  @Override
  public String question() {
    return question;
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
   * @return The value of the {@code correctAnswer} attribute
   */
  @JsonProperty("correctAnswer")
  @Override
  public String correctAnswer() {
    return correctAnswer;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link QuestionInput#question() question} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for question
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestionInput withQuestion(String value) {
    String newValue = Objects.requireNonNull(value, "question");
    if (this.question.equals(newValue)) return this;
    return new ImmutableQuestionInput(newValue, this.answer, this.correctAnswer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link QuestionInput#answer() answer} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for answer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestionInput withAnswer(String value) {
    String newValue = Objects.requireNonNull(value, "answer");
    if (this.answer.equals(newValue)) return this;
    return new ImmutableQuestionInput(this.question, newValue, this.correctAnswer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link QuestionInput#correctAnswer() correctAnswer} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for correctAnswer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestionInput withCorrectAnswer(String value) {
    String newValue = Objects.requireNonNull(value, "correctAnswer");
    if (this.correctAnswer.equals(newValue)) return this;
    return new ImmutableQuestionInput(this.question, this.answer, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionInput} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionInput
        && equalTo((ImmutableQuestionInput) another);
  }

  private boolean equalTo(ImmutableQuestionInput another) {
    return question.equals(another.question)
        && answer.equals(another.answer)
        && correctAnswer.equals(another.correctAnswer);
  }

  /**
   * Computes a hash code from attributes: {@code question}, {@code answer}, {@code correctAnswer}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + question.hashCode();
    h += (h << 5) + answer.hashCode();
    h += (h << 5) + correctAnswer.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code QuestionInput} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "QuestionInput{"
        + "question=" + question
        + ", answer=" + answer
        + ", correctAnswer=" + correctAnswer
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link QuestionInput} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable QuestionInput instance
   */
  public static ImmutableQuestionInput copyOf(QuestionInput instance) {
    if (instance instanceof ImmutableQuestionInput) {
      return (ImmutableQuestionInput) instance;
    }
    return ImmutableQuestionInput.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableQuestionInput ImmutableQuestionInput}.
   * <pre>
   * ImmutableQuestionInput.builder()
   *    .question(String) // required {@link QuestionInput#question() question}
   *    .answer(String) // required {@link QuestionInput#answer() answer}
   *    .correctAnswer(String) // required {@link QuestionInput#correctAnswer() correctAnswer}
   *    .build();
   * </pre>
   * @return A new ImmutableQuestionInput builder
   */
  public static ImmutableQuestionInput.Builder builder() {
    return new ImmutableQuestionInput.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableQuestionInput ImmutableQuestionInput}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "QuestionInput", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_QUESTION = 0x1L;
    private static final long INIT_BIT_ANSWER = 0x2L;
    private static final long INIT_BIT_CORRECT_ANSWER = 0x4L;
    private long initBits = 0x7L;

    private String question;
    private String answer;
    private String correctAnswer;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code QuestionInput} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(QuestionInput instance) {
      Objects.requireNonNull(instance, "instance");
      question(instance.question());
      answer(instance.answer());
      correctAnswer(instance.correctAnswer());
      return this;
    }

    /**
     * Initializes the value for the {@link QuestionInput#question() question} attribute.
     * @param question The value for question 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("question")
    public final Builder question(String question) {
      this.question = Objects.requireNonNull(question, "question");
      initBits &= ~INIT_BIT_QUESTION;
      return this;
    }

    /**
     * Initializes the value for the {@link QuestionInput#answer() answer} attribute.
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
     * Initializes the value for the {@link QuestionInput#correctAnswer() correctAnswer} attribute.
     * @param correctAnswer The value for correctAnswer 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("correctAnswer")
    public final Builder correctAnswer(String correctAnswer) {
      this.correctAnswer = Objects.requireNonNull(correctAnswer, "correctAnswer");
      initBits &= ~INIT_BIT_CORRECT_ANSWER;
      return this;
    }

    /**
     * Builds a new {@link ImmutableQuestionInput ImmutableQuestionInput}.
     * @return An immutable instance of QuestionInput
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableQuestionInput build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableQuestionInput(question, answer, correctAnswer);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_QUESTION) != 0) attributes.add("question");
      if ((initBits & INIT_BIT_ANSWER) != 0) attributes.add("answer");
      if ((initBits & INIT_BIT_CORRECT_ANSWER) != 0) attributes.add("correctAnswer");
      return "Cannot build QuestionInput, some of required attributes are not set " + attributes;
    }
  }
}
