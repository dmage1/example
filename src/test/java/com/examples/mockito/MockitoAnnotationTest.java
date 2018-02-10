package com.examples.mockito;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;

/**
 * The usage of the @Mock annotation and the MockitoRule rule.
 */
public class MockitoAnnotationTest {

    @Mock
    private MyDatabase databaseMock;
    @Mock
    List<String> mockedList;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    // And with annotations

    @Test
    public void testQuery()  {
        // Given
        ClassToTest t  = new ClassToTest(databaseMock);
        Mockito.when(databaseMock.query(anyString())).thenReturn(true);

        // When
        boolean check = t.query("* from t");

        // Then
        assertTrue(check);
        Mockito.verify(databaseMock).query("* from t");
    }

    @Test
    public void whenUseMockAnnotation_thenMockIsInjected() {
        mockedList.add("one");
        Mockito.verify(mockedList).add("one");
        assertEquals(0, mockedList.size());

        Mockito.when(mockedList.size()).thenReturn(100);
        assertEquals(100, mockedList.size());
    }

}
