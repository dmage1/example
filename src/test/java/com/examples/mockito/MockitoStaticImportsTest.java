package com.examples.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * By adding the org.mockito.Mockito.*; static import, you can use methods like mock() directly in your tests.
 * <p>
 * Static imports allow you to call static members, i.e., methods and fields of a class directly without specifying
 * the class.  Using static imports greatly improves the readability of your test code, you should use it.
 */
public class MockitoStaticImportsTest {

    /**
     * The most used widely used annotation in Mockito is @Mock. We can use @Mock to create and inject mocked instances
     * without having to call Mockito.mock manually.
     *
     * In the following example – we’ll create a mocked ArrayList with the manual way without using @Mock annotation:
     */

    // With Static imports

    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        List mockList = Mockito.mock(ArrayList.class);

        mockList.add("one");
        Mockito.verify(mockList).add("one");
        assertEquals(0, mockList.size());

        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(100, mockList.size());
    }

    @Test
    public void testMyClass() {
        //  create mock
        MyClass test = Mockito.mock(MyClass.class);

        // define return value for method getUniqueId()
        Mockito.when(test.getUniqueId()).thenReturn(43);

        // use mock in test....
        assertEquals(test.getUniqueId(), 43);
    }

}
