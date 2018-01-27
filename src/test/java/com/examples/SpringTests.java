package com.examples;

import com.examples.junit4.*;
import com.examples.spring.MachineLearningTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * In JUnit, to ignore a test, just add a @Ignore annotation before or after the @Test method.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MachineLearningTest.class})

public class SpringTests {
    //normally, this is an empty class
}
