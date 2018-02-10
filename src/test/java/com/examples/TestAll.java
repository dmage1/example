package com.examples;

import com.examples.spring.MachineLearningTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mockito.Mockito;

/**
 * In JUnit, to ignore a test, just add a @Ignore annotation before or after the @Test method.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        JUnit4Tests.class,
        //IncludePerformanceTestSuite.class,
        //IncludeRegressionTestSuite.class,
        SpringTests.class,
        HamcrestTests.class,
        Mockito.class
})

public class TestAll {
    //normally, this is an empty class
}