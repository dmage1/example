package com.examples.hamcrest;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Hamcrest Bean matchers
 */
public class BeanMatcherTest {

    @Test
    public void objectHasSummaryProperty () {

        Todo todo = new Todo(1, "Learn Hamcrest", "Important");

        assertThat(todo, hasProperty("summary"));
    }

    @Test
    public void objectHasCorrectSummaryValue () {

        Todo todo = new Todo(1, "Learn Hamcrest", "Important");

        assertThat(todo, hasProperty("summary"));

        assertThat(todo, hasProperty("summary", equalTo("Learn Hamcrest")));
    }

    @Test
    public void objectHasSameProperties () {

        Todo todo1 = new Todo(1, "Learn Hamcrest", "Important");
        Todo todo2 = new Todo(1, "Learn Hamcrest", "Important");

        assertThat(todo1, samePropertyValuesAs(todo2));
    }
}
