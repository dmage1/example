package com.examples;

import com.examples.junit4.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * In JUnit, to ignore a test, just add a @Ignore annotation before or after the @Test method.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        BasicAnnotationTest.class,
        Exception1Test.class,
        Exception2Test.class,
        Exception3Test.class,
        IgnoreTest.class,
        TimeoutTest.class,
        Parameterized1Test.class,
        Parameterized2Test.class,
        ListTest.class,
        MapTest.class,
        ExecutionOrderTest.class,
        ClassPropertyTest.class,


        MathUtilsTest.class})

public class JUnit4Tests {
    //normally, this is an empty class
}
