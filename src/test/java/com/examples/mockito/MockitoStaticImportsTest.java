package com.examples.mockito;

import org.junit.Test;

import java.util.Iterator;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * By adding the org.mockito.Mockito.*; static import, you can use methods like mock() directly in your tests.
 * <p>
 * Static imports allow you to call static members, i.e., methods and fields of a class directly without specifying
 * the class.  Using static imports greatly improves the readability of your test code, you should use it.
 */
public class MockitoStaticImportsTest {

    @Test
    public void testMyClass() {
        //  create mock
        MyClass test = mock(MyClass.class);

        // define return value for method getUniqueId()
        when(test.getUniqueId()).thenReturn(43);

        // use mock in test....
        assertEquals(test.getUniqueId(), 43);
    }

}
