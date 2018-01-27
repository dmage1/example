package com.examples.hamcrest;

import org.junit.Test;

import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;
import static org.hamcrest.text.IsEmptyString.isEmptyString;
import static org.junit.Assert.assertThat;

/**
 * Hamcrest String matchers
 */
public class StringMatcherTest {
    @Test
    public void isStringEmpty() {
        String stringToTest = "";
        assertThat(stringToTest, isEmptyString());
    }

    @Test
    public void isStringEmptyOfNull() {
        String stringToTest = "";
        assertThat(stringToTest, isEmptyOrNullString());
    }

}
