package com.examples.mockito;

import org.junit.Test;

import java.util.Iterator;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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
