package com.examples.hamcrest;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Custom Hamcrest matcher using FeatureMatcher
 *
 * The only method we have to overwrite is featureValueOf(T actual) which returns the value which will get passed into
 * the wrapped matches()/matchesSafely() method.
 *
 */
public class CustomMatcherTest {

    private static Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

    @Test
    public void fellowShipOfTheRingShouldContainer7() {
        //assertThat("Gandalf", length(is(8)));
        assertThat("Gandalf", length(is(7)));
    }

}
