package com.examples.hamcrest;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class CustomTypeSafeMatcherTest {

    @Test
    public void testRegularExpressionMatcher() throws Exception {
        String s ="aaabbbaaaa";
        assertThat(s, RegexMatcher.matchesRegex("a*b*a*"));
    }

}

/**
 * It is possible to write your custom Hamcrest matcher by extending TypeSafeMatcher. In contrast to BaseMatcher the
 * TypeSafeMatcher class automatically checks for null values, checks the type and casts appropriately before delegating
 * to matchesSafely(). It provides type safety by default.
 */
class RegexMatcher extends TypeSafeMatcher<String> {

    private final String regex;

    private RegexMatcher(final String regex) {
        this.regex = regex;
    }

    @Override
    public void describeTo(final Description description) {
        description.appendText("matches regular expression=`" + regex + "`");
    }

    @Override
    public boolean matchesSafely(final String string) {
        return string.matches(regex);
    }

    // matcher method you can call on this matcher class
    static RegexMatcher matchesRegex(final String regex) {
        return new RegexMatcher(regex);
    }
}