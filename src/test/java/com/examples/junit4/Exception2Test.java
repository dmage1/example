package com.examples.junit4;

import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * In JUnit, there are 3 ways to test the expected exceptions :
 * 1. @Test, optional ‘expected’ attribute
 * 2. Try-catch and always fail()
 * 3. @Rule ExpectedException
 *
 * 2. This is a bit old school, widely used in JUnit 3. Test the exception type and also the exception detail.
 */
public class Exception2Test {

    @Test
    public void testDivisionWithException() {
        try {
            int i = 1 / 0;
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {
            assertThat(e.getMessage(), is("/ by zero"));
            //assert others
        }
    }

    @Test
    public void testEmptyList() {
        try {
            new ArrayList<>().get(0);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), is("Index: 0, Size: 0"));
        }
    }


}
