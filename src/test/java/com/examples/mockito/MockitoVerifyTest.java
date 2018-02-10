package com.examples.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

/**
 * Mockito keeps track of all the method calls and their parameters to the mock object. You can use the verify() method
 * on the mock object to verify that the specified conditions are met. For example, you can verify that a method has
 * been called with certain parameters. This kind of testing is sometimes called behavior testing. Behavior testing
 * does not check the result of a method call, but it checks that a method is called with the right parameters.
 *
 * In case you do not care about the value, use the anyX, e.g., anyInt, anyString(), or any(YourClass.class) methods.
 */
public class MockitoVerifyTest {

    @Test
    public void testVerify()  {
        // create and configure mock
        MyClass test = Mockito.mock(MyClass.class);
        when(test.getUniqueId()).thenReturn(43);

        // call method testing on the mock with parameter 12
        test.testing(12);
        test.getUniqueId();
        test.getUniqueId();

        // now check if method testing was called with the parameter 12
        verify(test).testing(eq(12));

        // was the method called twice?
        verify(test, times(2)).getUniqueId();

        // other alternatives for verifiying the number of method calls for a method
        verify(test, never()).someMethod("never called");
        //verify(test, atLeastOnce()).someMethod("called at least once");
        //verify(test, atLeast(2)).someMethod("called at least twice");
        //verify(test, times(5)).someMethod("called five times");
        //verify(test, atMost(3)).someMethod("called at most 3 times");
        // This let's you check that no other methods where called on this object.
        // You call it after you have verified the expected method calls.
        verifyNoMoreInteractions(test);
    }

}
