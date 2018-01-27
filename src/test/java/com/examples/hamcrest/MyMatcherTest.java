package com.examples.hamcrest;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MyMatcherTest {

    @Test
    public void testRegularExpressionMatcher() throws Exception {
        String s ="aaabbbaaaa";
        assertThat(s, MyMatchers.matchesRegex("a*b*a*"));
    }

    @Test
    public void testInstanceOfMatcher() throws Exception {
        Todo todo = new Todo(1, "Learn Hamcrest", "Important");
        assertThat(todo, MyMatchers.instanceOf(Todo.class));
    }

}

/**
 * If you define many custom matchers it might become tedious to import them one by one into your test files. By
 * grouping them into a single class you can import them with one statement. You can also group them together with
 * Hamcrest matchers.
 */
class MyMatchers
{
    static <T> Matcher<T> instanceOf(Class<T> target) {
        return Matchers.instanceOf(target);
    }

    static Matcher<String> matchesRegex(String target) {
        return RegexMatcher.matchesRegex(target);
    }
}
