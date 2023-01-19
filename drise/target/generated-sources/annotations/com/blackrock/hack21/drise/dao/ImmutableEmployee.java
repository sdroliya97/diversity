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
 * Immutable implementation of {@link Employee}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEmployee.builder()}.
 */
@Generated(from = "Employee", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableEmployee implements Employee {
  private final @Nullable Integer id;
  private final String name;
  private final int age;
  private final String gender;
  private final String jobTitle;
  private final int experience;
  private final @Nullable String joinDate;
  private final @Nullable String leaveDate;
  private final @Nullable Integer points;
  private final @Nullable String websterLink;
  private final @Nullable String userid;
  private final @Nullable Integer assessmentScore;
  private final @Nullable Integer courseTakenScore;
  private final Boolean promotedRecently;
  private final Boolean lookingForChange;
  private final String currentRole;
  private final @Nullable String roleOfChange;
  private final @Nullable List<String> skills;
  private final String organisation;

  private ImmutableEmployee(ImmutableEmployee.Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.age = builder.age;
    this.gender = builder.gender;
    this.jobTitle = builder.jobTitle;
    this.experience = builder.experience;
    this.joinDate = builder.joinDate;
    this.leaveDate = builder.leaveDate;
    this.points = builder.points;
    this.websterLink = builder.websterLink;
    this.userid = builder.userid;
    this.assessmentScore = builder.assessmentScore;
    this.courseTakenScore = builder.courseTakenScore;
    this.currentRole = builder.currentRole;
    this.roleOfChange = builder.roleOfChange;
    this.skills = builder.skills == null ? null : createUnmodifiableList(true, builder.skills);
    this.organisation = builder.organisation;
    if (builder.promotedRecently != null) {
      initShim.promotedRecently(builder.promotedRecently);
    }
    if (builder.lookingForChange != null) {
      initShim.lookingForChange(builder.lookingForChange);
    }
    this.promotedRecently = initShim.promotedRecently();
    this.lookingForChange = initShim.lookingForChange();
    this.initShim = null;
  }

  private ImmutableEmployee(
      @Nullable Integer id,
      String name,
      int age,
      String gender,
      String jobTitle,
      int experience,
      @Nullable String joinDate,
      @Nullable String leaveDate,
      @Nullable Integer points,
      @Nullable String websterLink,
      @Nullable String userid,
      @Nullable Integer assessmentScore,
      @Nullable Integer courseTakenScore,
      Boolean promotedRecently,
      Boolean lookingForChange,
      String currentRole,
      @Nullable String roleOfChange,
      @Nullable List<String> skills,
      String organisation) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.jobTitle = jobTitle;
    this.experience = experience;
    this.joinDate = joinDate;
    this.leaveDate = leaveDate;
    this.points = points;
    this.websterLink = websterLink;
    this.userid = userid;
    this.assessmentScore = assessmentScore;
    this.courseTakenScore = courseTakenScore;
    this.promotedRecently = promotedRecently;
    this.lookingForChange = lookingForChange;
    this.currentRole = currentRole;
    this.roleOfChange = roleOfChange;
    this.skills = skills;
    this.organisation = organisation;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "Employee", generator = "Immutables")
  private final class InitShim {
    private byte promotedRecentlyBuildStage = STAGE_UNINITIALIZED;
    private Boolean promotedRecently;

    Boolean promotedRecently() {
      if (promotedRecentlyBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (promotedRecentlyBuildStage == STAGE_UNINITIALIZED) {
        promotedRecentlyBuildStage = STAGE_INITIALIZING;
        this.promotedRecently = Objects.requireNonNull(promotedRecentlyInitialize(), "promotedRecently");
        promotedRecentlyBuildStage = STAGE_INITIALIZED;
      }
      return this.promotedRecently;
    }

    void promotedRecently(Boolean promotedRecently) {
      this.promotedRecently = promotedRecently;
      promotedRecentlyBuildStage = STAGE_INITIALIZED;
    }

    private byte lookingForChangeBuildStage = STAGE_UNINITIALIZED;
    private Boolean lookingForChange;

    Boolean lookingForChange() {
      if (lookingForChangeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lookingForChangeBuildStage == STAGE_UNINITIALIZED) {
        lookingForChangeBuildStage = STAGE_INITIALIZING;
        this.lookingForChange = Objects.requireNonNull(lookingForChangeInitialize(), "lookingForChange");
        lookingForChangeBuildStage = STAGE_INITIALIZED;
      }
      return this.lookingForChange;
    }

    void lookingForChange(Boolean lookingForChange) {
      this.lookingForChange = lookingForChange;
      lookingForChangeBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (promotedRecentlyBuildStage == STAGE_INITIALIZING) attributes.add("promotedRecently");
      if (lookingForChangeBuildStage == STAGE_INITIALIZING) attributes.add("lookingForChange");
      return "Cannot build Employee, attribute initializers form cycle " + attributes;
    }
  }

  private Boolean promotedRecentlyInitialize() {
    return Employee.super.promotedRecently();
  }

  private Boolean lookingForChangeInitialize() {
    return Employee.super.lookingForChange();
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public @Nullable Integer id() {
    return id;
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
   * @return The value of the {@code age} attribute
   */
  @JsonProperty("age")
  @Override
  public int age() {
    return age;
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
   * @return The value of the {@code jobTitle} attribute
   */
  @JsonProperty("jobTitle")
  @Override
  public String jobTitle() {
    return jobTitle;
  }

  /**
   * @return The value of the {@code experience} attribute
   */
  @JsonProperty("experience")
  @Override
  public int experience() {
    return experience;
  }

  /**
   * @return The value of the {@code joinDate} attribute
   */
  @JsonProperty("joinDate")
  @Override
  public @Nullable String joinDate() {
    return joinDate;
  }

  /**
   * @return The value of the {@code leaveDate} attribute
   */
  @JsonProperty("leaveDate")
  @Override
  public @Nullable String leaveDate() {
    return leaveDate;
  }

  /**
   * @return The value of the {@code points} attribute
   */
  @JsonProperty("points")
  @Override
  public @Nullable Integer points() {
    return points;
  }

  /**
   * @return The value of the {@code websterLink} attribute
   */
  @JsonProperty("websterLink")
  @Override
  public @Nullable String websterLink() {
    return websterLink;
  }

  /**
   * @return The value of the {@code userid} attribute
   */
  @JsonProperty("userid")
  @Override
  public @Nullable String userid() {
    return userid;
  }

  /**
   * @return The value of the {@code assessmentScore} attribute
   */
  @JsonProperty("assessmentScore")
  @Override
  public @Nullable Integer assessmentScore() {
    return assessmentScore;
  }

  /**
   * @return The value of the {@code courseTakenScore} attribute
   */
  @JsonProperty("courseTakenScore")
  @Override
  public @Nullable Integer courseTakenScore() {
    return courseTakenScore;
  }

  /**
   * @return The value of the {@code promotedRecently} attribute
   */
  @JsonProperty("promotedRecently")
  @Override
  public Boolean promotedRecently() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.promotedRecently()
        : this.promotedRecently;
  }

  /**
   * @return The value of the {@code lookingForChange} attribute
   */
  @JsonProperty("lookingForChange")
  @Override
  public Boolean lookingForChange() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.lookingForChange()
        : this.lookingForChange;
  }

  /**
   * @return The value of the {@code currentRole} attribute
   */
  @JsonProperty("currentRole")
  @Override
  public String currentRole() {
    return currentRole;
  }

  /**
   * @return The value of the {@code roleOfChange} attribute
   */
  @JsonProperty("roleOfChange")
  @Override
  public @Nullable String roleOfChange() {
    return roleOfChange;
  }

  /**
   * @return The value of the {@code skills} attribute
   */
  @JsonProperty("skills")
  @Override
  public @Nullable List<String> skills() {
    return skills;
  }

  /**
   * @return The value of the {@code organisation} attribute
   */
  @JsonProperty("organisation")
  @Override
  public String organisation() {
    return organisation;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withId(@Nullable Integer value) {
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEmployee(
        value,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableEmployee(
        this.id,
        newValue,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#age() age} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withAge(int value) {
    if (this.age == value) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        value,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#gender() gender} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gender
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withGender(String value) {
    String newValue = Objects.requireNonNull(value, "gender");
    if (this.gender.equals(newValue)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        newValue,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#jobTitle() jobTitle} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for jobTitle
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withJobTitle(String value) {
    String newValue = Objects.requireNonNull(value, "jobTitle");
    if (this.jobTitle.equals(newValue)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        newValue,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#experience() experience} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for experience
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withExperience(int value) {
    if (this.experience == value) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        value,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#joinDate() joinDate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for joinDate (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withJoinDate(@Nullable String value) {
    if (Objects.equals(this.joinDate, value)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        value,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#leaveDate() leaveDate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for leaveDate (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withLeaveDate(@Nullable String value) {
    if (Objects.equals(this.leaveDate, value)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        value,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#points() points} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for points (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withPoints(@Nullable Integer value) {
    if (Objects.equals(this.points, value)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        value,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#websterLink() websterLink} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for websterLink (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withWebsterLink(@Nullable String value) {
    if (Objects.equals(this.websterLink, value)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        value,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#userid() userid} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userid (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withUserid(@Nullable String value) {
    if (Objects.equals(this.userid, value)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        value,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#assessmentScore() assessmentScore} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for assessmentScore (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withAssessmentScore(@Nullable Integer value) {
    if (Objects.equals(this.assessmentScore, value)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        value,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#courseTakenScore() courseTakenScore} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for courseTakenScore (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withCourseTakenScore(@Nullable Integer value) {
    if (Objects.equals(this.courseTakenScore, value)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        value,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#promotedRecently() promotedRecently} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for promotedRecently
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withPromotedRecently(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "promotedRecently");
    if (this.promotedRecently.equals(newValue)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        newValue,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#lookingForChange() lookingForChange} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lookingForChange
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withLookingForChange(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "lookingForChange");
    if (this.lookingForChange.equals(newValue)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        newValue,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#currentRole() currentRole} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currentRole
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withCurrentRole(String value) {
    String newValue = Objects.requireNonNull(value, "currentRole");
    if (this.currentRole.equals(newValue)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        newValue,
        this.roleOfChange,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#roleOfChange() roleOfChange} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for roleOfChange (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withRoleOfChange(@Nullable String value) {
    if (Objects.equals(this.roleOfChange, value)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        value,
        this.skills,
        this.organisation);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Employee#skills() skills}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmployee withSkills(@Nullable String... elements) {
    if (elements == null) {
      return new ImmutableEmployee(
          this.id,
          this.name,
          this.age,
          this.gender,
          this.jobTitle,
          this.experience,
          this.joinDate,
          this.leaveDate,
          this.points,
          this.websterLink,
          this.userid,
          this.assessmentScore,
          this.courseTakenScore,
          this.promotedRecently,
          this.lookingForChange,
          this.currentRole,
          this.roleOfChange,
          null,
          this.organisation);
    }
    @Nullable List<String> newValue = Arrays.asList(elements) == null ? null : createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        newValue,
        this.organisation);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Employee#skills() skills}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of skills elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmployee withSkills(@Nullable Iterable<String> elements) {
    if (this.skills == elements) return this;
    @Nullable List<String> newValue = elements == null ? null : createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        newValue,
        this.organisation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#organisation() organisation} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for organisation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withOrganisation(String value) {
    String newValue = Objects.requireNonNull(value, "organisation");
    if (this.organisation.equals(newValue)) return this;
    return new ImmutableEmployee(
        this.id,
        this.name,
        this.age,
        this.gender,
        this.jobTitle,
        this.experience,
        this.joinDate,
        this.leaveDate,
        this.points,
        this.websterLink,
        this.userid,
        this.assessmentScore,
        this.courseTakenScore,
        this.promotedRecently,
        this.lookingForChange,
        this.currentRole,
        this.roleOfChange,
        this.skills,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEmployee} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEmployee
        && equalTo((ImmutableEmployee) another);
  }

  private boolean equalTo(ImmutableEmployee another) {
    return Objects.equals(id, another.id)
        && name.equals(another.name)
        && age == another.age
        && gender.equals(another.gender)
        && jobTitle.equals(another.jobTitle)
        && experience == another.experience
        && Objects.equals(joinDate, another.joinDate)
        && Objects.equals(leaveDate, another.leaveDate)
        && Objects.equals(points, another.points)
        && Objects.equals(websterLink, another.websterLink)
        && Objects.equals(userid, another.userid)
        && Objects.equals(assessmentScore, another.assessmentScore)
        && Objects.equals(courseTakenScore, another.courseTakenScore)
        && promotedRecently.equals(another.promotedRecently)
        && lookingForChange.equals(another.lookingForChange)
        && currentRole.equals(another.currentRole)
        && Objects.equals(roleOfChange, another.roleOfChange)
        && Objects.equals(skills, another.skills)
        && organisation.equals(another.organisation);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code name}, {@code age}, {@code gender}, {@code jobTitle}, {@code experience}, {@code joinDate}, {@code leaveDate}, {@code points}, {@code websterLink}, {@code userid}, {@code assessmentScore}, {@code courseTakenScore}, {@code promotedRecently}, {@code lookingForChange}, {@code currentRole}, {@code roleOfChange}, {@code skills}, {@code organisation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + age;
    h += (h << 5) + gender.hashCode();
    h += (h << 5) + jobTitle.hashCode();
    h += (h << 5) + experience;
    h += (h << 5) + Objects.hashCode(joinDate);
    h += (h << 5) + Objects.hashCode(leaveDate);
    h += (h << 5) + Objects.hashCode(points);
    h += (h << 5) + Objects.hashCode(websterLink);
    h += (h << 5) + Objects.hashCode(userid);
    h += (h << 5) + Objects.hashCode(assessmentScore);
    h += (h << 5) + Objects.hashCode(courseTakenScore);
    h += (h << 5) + promotedRecently.hashCode();
    h += (h << 5) + lookingForChange.hashCode();
    h += (h << 5) + currentRole.hashCode();
    h += (h << 5) + Objects.hashCode(roleOfChange);
    h += (h << 5) + Objects.hashCode(skills);
    h += (h << 5) + organisation.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Employee} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Employee{"
        + "id=" + id
        + ", name=" + name
        + ", age=" + age
        + ", gender=" + gender
        + ", jobTitle=" + jobTitle
        + ", experience=" + experience
        + ", joinDate=" + joinDate
        + ", leaveDate=" + leaveDate
        + ", points=" + points
        + ", websterLink=" + websterLink
        + ", userid=" + userid
        + ", assessmentScore=" + assessmentScore
        + ", courseTakenScore=" + courseTakenScore
        + ", promotedRecently=" + promotedRecently
        + ", lookingForChange=" + lookingForChange
        + ", currentRole=" + currentRole
        + ", roleOfChange=" + roleOfChange
        + ", skills=" + skills
        + ", organisation=" + organisation
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Employee} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Employee instance
   */
  public static ImmutableEmployee copyOf(Employee instance) {
    if (instance instanceof ImmutableEmployee) {
      return (ImmutableEmployee) instance;
    }
    return ImmutableEmployee.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEmployee ImmutableEmployee}.
   * <pre>
   * ImmutableEmployee.builder()
   *    .id(Integer | null) // nullable {@link Employee#id() id}
   *    .name(String) // required {@link Employee#name() name}
   *    .age(int) // required {@link Employee#age() age}
   *    .gender(String) // required {@link Employee#gender() gender}
   *    .jobTitle(String) // required {@link Employee#jobTitle() jobTitle}
   *    .experience(int) // required {@link Employee#experience() experience}
   *    .joinDate(String | null) // nullable {@link Employee#joinDate() joinDate}
   *    .leaveDate(String | null) // nullable {@link Employee#leaveDate() leaveDate}
   *    .points(Integer | null) // nullable {@link Employee#points() points}
   *    .websterLink(String | null) // nullable {@link Employee#websterLink() websterLink}
   *    .userid(String | null) // nullable {@link Employee#userid() userid}
   *    .assessmentScore(Integer | null) // nullable {@link Employee#assessmentScore() assessmentScore}
   *    .courseTakenScore(Integer | null) // nullable {@link Employee#courseTakenScore() courseTakenScore}
   *    .promotedRecently(Boolean) // optional {@link Employee#promotedRecently() promotedRecently}
   *    .lookingForChange(Boolean) // optional {@link Employee#lookingForChange() lookingForChange}
   *    .currentRole(String) // required {@link Employee#currentRole() currentRole}
   *    .roleOfChange(String | null) // nullable {@link Employee#roleOfChange() roleOfChange}
   *    .skills(List&lt;String&gt; | null) // nullable {@link Employee#skills() skills}
   *    .organisation(String) // required {@link Employee#organisation() organisation}
   *    .build();
   * </pre>
   * @return A new ImmutableEmployee builder
   */
  public static ImmutableEmployee.Builder builder() {
    return new ImmutableEmployee.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEmployee ImmutableEmployee}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Employee", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_AGE = 0x2L;
    private static final long INIT_BIT_GENDER = 0x4L;
    private static final long INIT_BIT_JOB_TITLE = 0x8L;
    private static final long INIT_BIT_EXPERIENCE = 0x10L;
    private static final long INIT_BIT_CURRENT_ROLE = 0x20L;
    private static final long INIT_BIT_ORGANISATION = 0x40L;
    private long initBits = 0x7fL;

    private Integer id;
    private String name;
    private int age;
    private String gender;
    private String jobTitle;
    private int experience;
    private String joinDate;
    private String leaveDate;
    private Integer points;
    private String websterLink;
    private String userid;
    private Integer assessmentScore;
    private Integer courseTakenScore;
    private Boolean promotedRecently;
    private Boolean lookingForChange;
    private String currentRole;
    private String roleOfChange;
    private List<String> skills = null;
    private String organisation;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Employee} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Employee instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable Integer idValue = instance.id();
      if (idValue != null) {
        id(idValue);
      }
      name(instance.name());
      age(instance.age());
      gender(instance.gender());
      jobTitle(instance.jobTitle());
      experience(instance.experience());
      @Nullable String joinDateValue = instance.joinDate();
      if (joinDateValue != null) {
        joinDate(joinDateValue);
      }
      @Nullable String leaveDateValue = instance.leaveDate();
      if (leaveDateValue != null) {
        leaveDate(leaveDateValue);
      }
      @Nullable Integer pointsValue = instance.points();
      if (pointsValue != null) {
        points(pointsValue);
      }
      @Nullable String websterLinkValue = instance.websterLink();
      if (websterLinkValue != null) {
        websterLink(websterLinkValue);
      }
      @Nullable String useridValue = instance.userid();
      if (useridValue != null) {
        userid(useridValue);
      }
      @Nullable Integer assessmentScoreValue = instance.assessmentScore();
      if (assessmentScoreValue != null) {
        assessmentScore(assessmentScoreValue);
      }
      @Nullable Integer courseTakenScoreValue = instance.courseTakenScore();
      if (courseTakenScoreValue != null) {
        courseTakenScore(courseTakenScoreValue);
      }
      promotedRecently(instance.promotedRecently());
      lookingForChange(instance.lookingForChange());
      currentRole(instance.currentRole());
      @Nullable String roleOfChangeValue = instance.roleOfChange();
      if (roleOfChangeValue != null) {
        roleOfChange(roleOfChangeValue);
      }
      @Nullable List<String> skillsValue = instance.skills();
      if (skillsValue != null) {
        addAllSkills(skillsValue);
      }
      organisation(instance.organisation());
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#id() id} attribute.
     * @param id The value for id (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(@Nullable Integer id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#name() name} attribute.
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
     * Initializes the value for the {@link Employee#age() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("age")
    public final Builder age(int age) {
      this.age = age;
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#gender() gender} attribute.
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
     * Initializes the value for the {@link Employee#jobTitle() jobTitle} attribute.
     * @param jobTitle The value for jobTitle 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jobTitle")
    public final Builder jobTitle(String jobTitle) {
      this.jobTitle = Objects.requireNonNull(jobTitle, "jobTitle");
      initBits &= ~INIT_BIT_JOB_TITLE;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#experience() experience} attribute.
     * @param experience The value for experience 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("experience")
    public final Builder experience(int experience) {
      this.experience = experience;
      initBits &= ~INIT_BIT_EXPERIENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#joinDate() joinDate} attribute.
     * @param joinDate The value for joinDate (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("joinDate")
    public final Builder joinDate(@Nullable String joinDate) {
      this.joinDate = joinDate;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#leaveDate() leaveDate} attribute.
     * @param leaveDate The value for leaveDate (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("leaveDate")
    public final Builder leaveDate(@Nullable String leaveDate) {
      this.leaveDate = leaveDate;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#points() points} attribute.
     * @param points The value for points (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("points")
    public final Builder points(@Nullable Integer points) {
      this.points = points;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#websterLink() websterLink} attribute.
     * @param websterLink The value for websterLink (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("websterLink")
    public final Builder websterLink(@Nullable String websterLink) {
      this.websterLink = websterLink;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#userid() userid} attribute.
     * @param userid The value for userid (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userid")
    public final Builder userid(@Nullable String userid) {
      this.userid = userid;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#assessmentScore() assessmentScore} attribute.
     * @param assessmentScore The value for assessmentScore (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assessmentScore")
    public final Builder assessmentScore(@Nullable Integer assessmentScore) {
      this.assessmentScore = assessmentScore;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#courseTakenScore() courseTakenScore} attribute.
     * @param courseTakenScore The value for courseTakenScore (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("courseTakenScore")
    public final Builder courseTakenScore(@Nullable Integer courseTakenScore) {
      this.courseTakenScore = courseTakenScore;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#promotedRecently() promotedRecently} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Employee#promotedRecently() promotedRecently}.</em>
     * @param promotedRecently The value for promotedRecently 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("promotedRecently")
    public final Builder promotedRecently(Boolean promotedRecently) {
      this.promotedRecently = Objects.requireNonNull(promotedRecently, "promotedRecently");
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#lookingForChange() lookingForChange} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Employee#lookingForChange() lookingForChange}.</em>
     * @param lookingForChange The value for lookingForChange 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lookingForChange")
    public final Builder lookingForChange(Boolean lookingForChange) {
      this.lookingForChange = Objects.requireNonNull(lookingForChange, "lookingForChange");
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#currentRole() currentRole} attribute.
     * @param currentRole The value for currentRole 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("currentRole")
    public final Builder currentRole(String currentRole) {
      this.currentRole = Objects.requireNonNull(currentRole, "currentRole");
      initBits &= ~INIT_BIT_CURRENT_ROLE;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#roleOfChange() roleOfChange} attribute.
     * @param roleOfChange The value for roleOfChange (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("roleOfChange")
    public final Builder roleOfChange(@Nullable String roleOfChange) {
      this.roleOfChange = roleOfChange;
      return this;
    }

    /**
     * Adds one element to {@link Employee#skills() skills} list.
     * @param element A skills element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSkills(String element) {
      if (this.skills == null) {
        this.skills = new ArrayList<String>();
      }
      this.skills.add(Objects.requireNonNull(element, "skills element"));
      return this;
    }

    /**
     * Adds elements to {@link Employee#skills() skills} list.
     * @param elements An array of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSkills(String... elements) {
      if (this.skills == null) {
        this.skills = new ArrayList<String>();
      }
      for (String element : elements) {
        this.skills.add(Objects.requireNonNull(element, "skills element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link Employee#skills() skills} list.
     * @param elements An iterable of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("skills")
    public final Builder skills(@Nullable Iterable<String> elements) {
      if (elements == null) {
        this.skills = null;
        return this;
      }
      this.skills = new ArrayList<String>();
      return addAllSkills(elements);
    }

    /**
     * Adds elements to {@link Employee#skills() skills} list.
     * @param elements An iterable of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSkills(Iterable<String> elements) {
      Objects.requireNonNull(elements, "skills element");
      if (this.skills == null) {
        this.skills = new ArrayList<String>();
      }
      for (String element : elements) {
        this.skills.add(Objects.requireNonNull(element, "skills element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#organisation() organisation} attribute.
     * @param organisation The value for organisation 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organisation")
    public final Builder organisation(String organisation) {
      this.organisation = Objects.requireNonNull(organisation, "organisation");
      initBits &= ~INIT_BIT_ORGANISATION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEmployee ImmutableEmployee}.
     * @return An immutable instance of Employee
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEmployee build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEmployee(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
      if ((initBits & INIT_BIT_GENDER) != 0) attributes.add("gender");
      if ((initBits & INIT_BIT_JOB_TITLE) != 0) attributes.add("jobTitle");
      if ((initBits & INIT_BIT_EXPERIENCE) != 0) attributes.add("experience");
      if ((initBits & INIT_BIT_CURRENT_ROLE) != 0) attributes.add("currentRole");
      if ((initBits & INIT_BIT_ORGANISATION) != 0) attributes.add("organisation");
      return "Cannot build Employee, some of required attributes are not set " + attributes;
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
