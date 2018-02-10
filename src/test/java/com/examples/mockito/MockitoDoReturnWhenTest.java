package com.examples.mockito;

import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

/**
 * The doReturn(…​).when(…​).methodCall call chain works similar to when(…​.).thenReturn(…​.). It is useful for mocking
 * methods which give an exception during a call, e.g., if you use use functionality like Wrapping Java objects with
 * Spy.
 *
 * The doThrow variant can be used for methods which return void to throw an exception. This usage is demonstrated by
 * the following code snippet.
 */
public class MockitoDoReturnWhenTest {

    @Test
    public void doReturn_when_doThrow_when_Test() {
        Properties properties = new Properties();

        Properties spyProperties = spy(properties);

        doReturn("42").when(spyProperties).get("shoeSize");

        String value = (String) spyProperties.get("shoeSize");

        assertEquals("42", value);

    }

}
