package com.examples.junit4;

import org.junit.Test;
import java.util.ArrayList;

/**
 * In JUnit, there are 3 ways to test the expected exceptions :
 * 1. @Test, optional ‘expected’ attribute
 * 2. Try-catch and always fail()
 * 3. @Rule ExpectedException
 *
 * 1. Use this if you only want to test the exception type.
 */
public class Exception1Test {

    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<>().get(0);
    }

}
