package com.examples;

import com.examples.hamcrest.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * amcrest matcher framework.
 *
 * Hamcrest is a framework for software tests. Hamcrest allows checking for conditions in your code via existing
 * matchers classes. It also allows you to define your custom matcher implementations.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MatcherTest.class,
        ListMatcherTest.class,
        ArrayMatcherTest.class,
        BeanMatcherTest.class,
        StringMatcherTest.class,
        CustomMatcherTest.class,
        CustomTypeSafeMatcherTest.class,
        CombinerMatcherTest.class
        })

public class HamcrestTests {
    //normally, this is an empty class
}
