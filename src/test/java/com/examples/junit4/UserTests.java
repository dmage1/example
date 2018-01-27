package com.examples.junit4;

import org.junit.Test;

public class UserTests {

    @Test(expected = IllegalArgumentException.class)
    public void exceptionTesting() {
        // set up user
        User user = new User("firstName", "lastName", 24);
    }

}
