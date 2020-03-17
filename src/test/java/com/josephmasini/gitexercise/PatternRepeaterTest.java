package com.josephmasini.gitexercise;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class PatternRepeaterTest {

    private PatternRepeater patternRepeater;

    @Before
    public void setUp() {
        patternRepeater = new PatternRepeater();
    }

    /* Implement tests */

    @Test
    public void sortIntegersTest() {
        int[] integers = {10, 8, 2, 3};
        int[] expected = {2, 3, 8, 10};
        int[] result = patternRepeater.sortIntegers(integers);

        assertArrayEquals(expected, result);
    }

    @Test
    public void sortStringTest() {
        String[] integers = {"test", "chris", "abc"};
        String[] expected = {"ab", "chris", "test"};
        String[] result = patternRepeater.sortStrings(integers);

        assertArrayEquals(expected, result);
    }
}
