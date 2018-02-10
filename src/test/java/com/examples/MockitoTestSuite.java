package com.examples;

import com.examples.mockito.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * In JUnit, to ignore a test, just add a @Ignore annotation before or after the @Test method.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MockitoAnnotationTest.class,
        MockitoStaticImportsTest.class,
        MockitoWhenThenReturnTest.class,
        MockitoDoReturnWhenTest.class,
        MockitoSpyTest.class})

public class MockitoTestSuite {
    //normally, this is an empty class
}
