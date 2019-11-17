package Z_HamcrestAssertion;

import org.hamcrest.Matchers;

/**
 * Hamcrest comes with a library of useful matchers. Here are some of the most important ones.
 *
 * Text:
 * equalToIgnoringCase - test string equality ignoring case
 * equalToIgnoringWhiteSpace - test string equality ignoring differences in runs of whitespace
 * containsString, endsWith, startsWith - test string matching
 * [eg: assertThat("message", str,is(both(startsWith("ba")).and(endsWith("thy"))));]
 *
 * Number:
 * closeTo - test floating point values are close to a given value (
 * greaterThan, greaterThanOrEqualTo, lessThan, lessThanOrEqualTo - test ordering
 * [eg; assertThat("message",18, is(both(greaterThan(10)).and(lessThan(20))));]
 * [eg: assertThat("message",arr, either(hasItem(11)).or(hasItem(21)));]
 *
 * Collections:
 *
 * array - test an array’s elements against an array of matchers
 * hasItemInArray - test an array contains an element
 * hasItem, hasItems - test a collection contains elements
 * hasEntry, hasKey, hasValue - test a map contains an entry, key or value
 * arrayContaining, arrayContainingInAnyOrder, arrayWithSize, contains, containsInAnyOrder, hasSize, isIn, isOneOf
 *
 * Logical:
 *
 * allOf - matches if all matchers match, short circuits (like Java &&)
 * anyOf - matches if any matchers match, short circuits (like Java ||)
 * not - matches if the wrapped matcher doesn’t match and vice versa
 *
 * Sugar
 *
 * Hamcrest strives to make your tests as readable as possible. For example, the is matcher is a wrapper that doesn’t add any extra behavior to the underlying matcher. The following assertions are all equivalent:
 * assertThat(theBiscuit, equalTo(myBiscuit));
 * assertThat(theBiscuit, is(equalTo(myBiscuit)));
 * assertThat(theBiscuit, is(myBiscuit));
 *
 * describedAs, is used to override the failure output of another matcher.
 *
 * [eg: assertThat(actual, describedAs("input > %0", greaterThan(expected), expected));]
 *
 * The last form is allowed since is(T value) is overloaded to return is(equalTo(value)).
 * Object
 * equalTo - test object equality using Object.equals
 * hasToString - test Object.toString
 * instanceOf, isCompatibleType - test type
 * notNullValue, nullValue - test for null
 * sameInstance - test object identity
 * Beans
 * hasProperty - test JavaBeans properties.
 */
public class AllHamcrestAssertions {

}