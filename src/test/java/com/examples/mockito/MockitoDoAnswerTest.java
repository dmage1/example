package com.examples.mockito;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import javax.naming.ldap.LdapName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Simply put, the API is Mockito.spy() – to spy on a real object.
 *
 * This will allow us to call all the normal methods of the object while still tracking every interaction, just as
 * you would with a mock.
 */
public class MockitoDoAnswerTest {

    // Simple Spy Example

    @Test
    public void whenSpyingOnList_thenCorrect() {
        List<String> list = new ArrayList<String>();
        List<String> spyList = Mockito.spy(list);

        // Note how the real method add() is actually called and how the size of spyList becomes 2.
        spyList.add("one");
        spyList.add("two");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("two");

        assertEquals(2, spyList.size());
    }

    // Stubbing a Spy.

    /**
     * We can configure/override the behavior of a method using the same syntax we would use with a mock.
     */
    @Test
    public void whenStubASpy_thenStubbed() {
        List<String> list = new ArrayList<String>();
        List<String> spyList = Mockito.spy(list);

        assertEquals(0, spyList.size());

        Mockito.doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }

    // Mock vs. Spy in Mockito

    /**
     * When Mockito creates a mock – it does so from the Class of an Type, not from an actual instance. The mock simply
     * creates a bare-bones shell instance of the Class, entirely instrumented to track interactions with it.
     *
     * On the other hand, the spy will wrap an existing instance. It will still behave in the same way as the normal
     * instance – the only difference is that it will also be instrumented to track all the interactions with it.
     */
    @Test
    public void whenCreateMock_thenCreated() {
        List mockedList = Mockito.mock(ArrayList.class);

        mockedList.add("one");
        Mockito.verify(mockedList).add("one");

        assertEquals(0, mockedList.size());
    }

    /**
     * As you can see – adding an element into the mocked list doesn’t actually add anything – it just calls the method
     * with no other side-effect.
     *
     * A spy on the other hand will behave differently – it will actually call the real implementation of the add method
     * and add the element to the underlying list:
     */


}
