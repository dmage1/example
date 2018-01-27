package com.examples.hamcrest;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.examples.hamcrest.MatcherCombinator.matches;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;


public class CombinerMatcherTest {

    /**
     * Combining matchers is supported by Hamcrest out of the box but it has the limitation that the error is hard to
     * read.
     */
    @Ignore
    public void combiningMatcherTest () {
        List<Integer> list = new ArrayList<>();
        assertThat(list, both(hasSize(1)).and(contains(42)));
    }

    /**
     * We want to write our own MatcherCombiner that provides us with a readable error message, even when multiple
     * matchers fail.
     */
    @Ignore
    public void combinerMatcherTest() {
        List<Integer> list = new ArrayList<>();
        assertThat(list, matches(hasSize(1)).and(contains(42)));
    }

    @Test
    public void defaultTest() {

    }

}
