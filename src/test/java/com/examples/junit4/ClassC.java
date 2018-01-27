package com.examples.junit4;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClassC {

    @Category({PerformanceTests.class, RegressionTests.class})
    @Test
    public void test_c_1() {
        assertThat(1 == 1, is(true));
    }

    @Category(RegressionTests.class)
    @Test
    public void test_c_2() {
        assertThat(1 == 1, is(true));
    }

}
