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
 * Immutable implementation of {@link TeamComposition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTeamComposition.builder()}.
 */
@Generated(from = "TeamComposition", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableTeamComposition implements TeamComposition {
  private final String name;
  private final String team;
  private final String region;
  private final Boolean isManager;
  private final String identifier;
  private final List<Employee> organization;

  private ImmutableTeamComposition(ImmutableTeamComposition.Builder builder) {
    this.name = builder.name;
    this.team = builder.team;
    this.region = builder.region;
    this.identifier = builder.identifier;
    this.organization = createUnmodifiableList(true, builder.organization);
    this.isManager = builder.isManager != null
        ? builder.isManager
        : Objects.requireNonNull(TeamComposition.super.isManager(), "isManager");
  }

  private ImmutableTeamComposition(
      String name,
      String team,
      String region,
      Boolean isManager,
      String identifier,
      List<Employee> organization) {
    this.name = name;
    this.team = team;
    this.region = region;
    this.isManager = isManager;
    this.identifier = identifier;
    this.organization = organization;
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
   * @return The value of the {@code region} attribute
   */
  @JsonProperty("region")
  @Override
  public String region() {
    return region;
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public String identifier() {
    return identifier;
  }

  /**
   * @return The value of the {@code organization} attribute
   */
  @JsonProperty("organization")
  @Override
  public List<Employee> organization() {
    return organization;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TeamComposition#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTeamComposition withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableTeamComposition(newValue, this.team, this.region, this.isManager, this.identifier, this.organization);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TeamComposition#team() team} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for team
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTeamComposition withTeam(String value) {
    String newValue = Objects.requireNonNull(value, "team");
    if (this.team.equals(newValue)) return this;
    return new ImmutableTeamComposition(this.name, newValue, this.region, this.isManager, this.identifier, this.organization);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TeamComposition#region() region} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for region
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTeamComposition withRegion(String value) {
    String newValue = Objects.requireNonNull(value, "region");
    if (this.region.equals(newValue)) return this;
    return new ImmutableTeamComposition(this.name, this.team, newValue, this.isManager, this.identifier, this.organization);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TeamComposition#isManager() isManager} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isManager
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTeamComposition withIsManager(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "isManager");
    if (this.isManager.equals(newValue)) return this;
    return new ImmutableTeamComposition(this.name, this.team, this.region, newValue, this.identifier, this.organization);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TeamComposition#identifier() identifier} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for identifier
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTeamComposition withIdentifier(String value) {
    String newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier.equals(newValue)) return this;
    return new ImmutableTeamComposition(this.name, this.team, this.region, this.isManager, newValue, this.organization);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TeamComposition#organization() organization}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTeamComposition withOrganization(Employee... elements) {
    List<Employee> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableTeamComposition(this.name, this.team, this.region, this.isManager, this.identifier, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TeamComposition#organization() organization}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of organization elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTeamComposition withOrganization(Iterable<? extends Employee> elements) {
    if (this.organization == elements) return this;
    List<Employee> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableTeamComposition(this.name, this.team, this.region, this.isManager, this.identifier, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTeamComposition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTeamComposition
        && equalTo((ImmutableTeamComposition) another);
  }

  private boolean equalTo(ImmutableTeamComposition another) {
    return name.equals(another.name)
        && team.equals(another.team)
        && region.equals(another.region)
        && isManager.equals(another.isManager)
        && identifier.equals(another.identifier)
        && organization.equals(another.organization);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code team}, {@code region}, {@code isManager}, {@code identifier}, {@code organization}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + team.hashCode();
    h += (h << 5) + region.hashCode();
    h += (h << 5) + isManager.hashCode();
    h += (h << 5) + identifier.hashCode();
    h += (h << 5) + organization.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TeamComposition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "TeamComposition{"
        + "name=" + name
        + ", team=" + team
        + ", region=" + region
        + ", isManager=" + isManager
        + ", identifier=" + identifier
        + ", organization=" + organization
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link TeamComposition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TeamComposition instance
   */
  public static ImmutableTeamComposition copyOf(TeamComposition instance) {
    if (instance instanceof ImmutableTeamComposition) {
      return (ImmutableTeamComposition) instance;
    }
    return ImmutableTeamComposition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTeamComposition ImmutableTeamComposition}.
   * <pre>
   * ImmutableTeamComposition.builder()
   *    .name(String) // required {@link TeamComposition#name() name}
   *    .team(String) // required {@link TeamComposition#team() team}
   *    .region(String) // required {@link TeamComposition#region() region}
   *    .isManager(Boolean) // optional {@link TeamComposition#isManager() isManager}
   *    .identifier(String) // required {@link TeamComposition#identifier() identifier}
   *    .addOrganization|addAllOrganization(com.blackrock.hack21.drise.dao.Employee) // {@link TeamComposition#organization() organization} elements
   *    .build();
   * </pre>
   * @return A new ImmutableTeamComposition builder
   */
  public static ImmutableTeamComposition.Builder builder() {
    return new ImmutableTeamComposition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTeamComposition ImmutableTeamComposition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TeamComposition", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_TEAM = 0x2L;
    private static final long INIT_BIT_REGION = 0x4L;
    private static final long INIT_BIT_IDENTIFIER = 0x8L;
    private long initBits = 0xfL;

    private String name;
    private String team;
    private String region;
    private Boolean isManager;
    private String identifier;
    private List<Employee> organization = new ArrayList<Employee>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TeamComposition} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TeamComposition instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      team(instance.team());
      region(instance.region());
      isManager(instance.isManager());
      identifier(instance.identifier());
      addAllOrganization(instance.organization());
      return this;
    }

    /**
     * Initializes the value for the {@link TeamComposition#name() name} attribute.
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
     * Initializes the value for the {@link TeamComposition#team() team} attribute.
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
     * Initializes the value for the {@link TeamComposition#region() region} attribute.
     * @param region The value for region 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("region")
    public final Builder region(String region) {
      this.region = Objects.requireNonNull(region, "region");
      initBits &= ~INIT_BIT_REGION;
      return this;
    }

    /**
     * Initializes the value for the {@link TeamComposition#isManager() isManager} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TeamComposition#isManager() isManager}.</em>
     * @param isManager The value for isManager 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isManager")
    public final Builder isManager(Boolean isManager) {
      this.isManager = Objects.requireNonNull(isManager, "isManager");
      return this;
    }

    /**
     * Initializes the value for the {@link TeamComposition#identifier() identifier} attribute.
     * @param identifier The value for identifier 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(String identifier) {
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      initBits &= ~INIT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Adds one element to {@link TeamComposition#organization() organization} list.
     * @param element A organization element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOrganization(Employee element) {
      this.organization.add(Objects.requireNonNull(element, "organization element"));
      return this;
    }

    /**
     * Adds elements to {@link TeamComposition#organization() organization} list.
     * @param elements An array of organization elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOrganization(Employee... elements) {
      for (Employee element : elements) {
        this.organization.add(Objects.requireNonNull(element, "organization element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link TeamComposition#organization() organization} list.
     * @param elements An iterable of organization elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organization")
    public final Builder organization(Iterable<? extends Employee> elements) {
      this.organization.clear();
      return addAllOrganization(elements);
    }

    /**
     * Adds elements to {@link TeamComposition#organization() organization} list.
     * @param elements An iterable of organization elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllOrganization(Iterable<? extends Employee> elements) {
      for (Employee element : elements) {
        this.organization.add(Objects.requireNonNull(element, "organization element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableTeamComposition ImmutableTeamComposition}.
     * @return An immutable instance of TeamComposition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTeamComposition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTeamComposition(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_TEAM) != 0) attributes.add("team");
      if ((initBits & INIT_BIT_REGION) != 0) attributes.add("region");
      if ((initBits & INIT_BIT_IDENTIFIER) != 0) attributes.add("identifier");
      return "Cannot build TeamComposition, some of required attributes are not set " + attributes;
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
