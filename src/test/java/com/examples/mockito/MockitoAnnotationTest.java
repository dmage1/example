package com.examples.mockito;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * The usage of the @Mock annotation and the MockitoRule rule.
 */
public class MockitoAnnotationTest {

    @Mock
    private MyDatabase databaseMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testQuery()  {
        // Given
        ClassToTest t  = new ClassToTest(databaseMock);
        when(databaseMock.query(anyString())).thenReturn(true);

        // When
        boolean check = t.query("* from t");

        // Then
        assertTrue(check);
        verify(databaseMock).query("* from t");
    }

}
