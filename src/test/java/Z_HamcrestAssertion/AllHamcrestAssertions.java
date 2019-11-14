package Z_HamcrestAssertion;

import org.hamcrest.Matchers;

import static javafx.beans.binding.Bindings.equalIgnoreCase;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

/**
 * <p>
 *  Hamcrest comes with a library of useful matchers. Here are some of the most important ones.
 *
 * Core:
 * anything - always matches, useful if you don’t care what the object under test is
 * describedAs - decorator to adding custom failure description
 * is - decorator to improve readability - see “Sugar”, below
 *
 * Logical
 * allOf - matches if all matchers match, short circuits (like Java &&)
 * anyOf - matches if any matchers match, short circuits (like Java ||)
 * not - matches if the wrapped matcher doesn’t match and vice versa
 *
 * Object
 * equalTo - test object equality using Object.equals
 * hasToString - test Object.toString
 * instanceOf, isCompatibleType - test type
 * notNullValue, nullValue - test for null
 * sameInstance - test object identity
 *
 * Beans
 * hasProperty - test JavaBeans properties
 *
 * Collections
 * array - test an array’s elements against an array of matchers
 * hasEntry,hasKey, hasValue - test a map contains an entry, key or value
 * hasItem, hasItems - test a collection contains elements
 * hasItemInArray - test an array contains an element
 *
 * Number
 * closeTo - test floating point values are close to a given value
 * greaterThan, greaterThanOrEqualTo, lessThan, lessThanOrEqualTo - test ordering
 *
 * Text
 * equalToIgnoringCase - test string equality ignoring case
 * equalToIgnoringWhiteSpace - test string equality ignoring differences in runs of whitespace
 * containsString, endsWith, startsWith - test string matching
 *
 * Sugar
 * Hamcrest strives to make your tests as readable as possible.
 * For example, the is matcher is a wrapper that doesn’t add any extra behavior to the underlying matcher.
 * The following assertions are all equivalent:
 *
 * assertThat(theBiscuit, equalTo(myBiscuit));
 * assertThat(theBiscuit, is(equalTo(myBiscuit)));
 * assertThat(theBiscuit, is(myBiscuit));
 * The last form is allowed since is(T value) is overloaded to return is(equalTo(value)).
 * </p>
 */
public class AllHamcrestAssertions {

    public static void main(String[] args) {

        /**
         *  Comparing String/Text with Hamcrest Assertion
        */
        // assertThat(" message " String1, equalTo(String2));

        String str1_equalTo="chakra";
        String str2_equalTo="chakra";
        assertThat("please investigate", str1_equalTo, equalTo(str2_equalTo));

        // assertThat("message ", String1, equalToIgnoringCase(String2));

        String str1_igCase="chakra";
        String str2_igCase="CHAKRA";
        assertThat("please investigate",str1_igCase , equalToIgnoringCase(str2_igCase));

        // assertThat(" message " String1, startsWith("String"));

        String str1_start="chakra";
        assertThat("please investigate", str1_start, startsWith("cha"));

        // assertThat(" message " String1, EndsWith("String"));

        String str1_ends="chakra";
        assertThat("please investigate", str1_ends, endsWith("kra"));

        String str="hyderabad";

      //  assertThat("please investigate",str, is(both(startsWith("hyd"), endsWith("bad"))));
    }


}
