package com.examples.junit4;

import org.junit.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class MathUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        MathUtils.multiply(1000, 5);
    }

    @Test
    public void testMultiply() {
        assertEquals("10 x 5 must be 50", 50, MathUtils.multiply(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide() {
        assertEquals("y must not be 0", 0, MathUtils.divide(1, 0));
    }

}
