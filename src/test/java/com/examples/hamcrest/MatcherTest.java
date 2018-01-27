package com.examples.hamcrest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class MatcherTest {
    private boolean a;
    private boolean b;

    @Test
    public void allTestTheSame() {
        // all statements test the same
        assertThat(a, equalTo(b));
        assertThat(a, is(equalTo(b)));
        assertThat(a, is(b));
    }

    @Test
    public void compareJunit4() {
        String actual = "abc";
        String expected = "abc";

        // JUnit 4 for equals check
        assertEquals(expected, actual);
        // Hamcrest for equals check
        assertThat(actual, is(equalTo(expected)));

        expected = "def";
        // JUnit 4 for not equals check
        assertNotEquals(expected, actual);
        // Hamcrest for not equals check
        assertThat(actual, is(not(equalTo(expected))));
    }

    @Test
    public void chainMatchers() {
        assertThat("test", anyOf(is("testing"), containsString("est")));
    }

}
