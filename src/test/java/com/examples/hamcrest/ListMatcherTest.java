package com.examples.hamcrest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

/**
 * Hamcrest List matchers
 */
public class ListMatcherTest {

    @Test
    public void listShouldInitiallyBeEmpty() {
        List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, hasSize(3));

        // ensure the order is correct
        assertThat(list, contains(5, 2, 4));

        assertThat(list, containsInAnyOrder(2, 4, 5));

        assertThat(list, everyItem(greaterThan(1)));
    }

    @Test
    public void hasSizeOf3() {
        List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, hasSize(3));
    }

    @Test
    public void containsNumbersInAnyOrder() {
        List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, containsInAnyOrder(2, 4, 5));
    }

    @Test
    public void containsNumbersInSpecificOrder() {
        List<Integer> list = Arrays.asList(5, 2, 4);

        // ensure the order is correct
        assertThat(list, contains(5, 2, 4));
    }
}
