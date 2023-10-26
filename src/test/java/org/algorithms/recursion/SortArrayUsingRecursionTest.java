package org.algorithms.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortArrayUsingRecursionTest {

    SortArrayUsingRecursion sortArrayUsingRecursion = new SortArrayUsingRecursion();

    @Test
    void sort() {
        assertAll(() -> {
            int[] input1 = {};
            int[] output1 = {};
            assertArrayEquals(output1, sortArrayUsingRecursion.sort(input1));

            int[] input2 = {2};
            int[] output2 = {2};
            assertArrayEquals(output2, sortArrayUsingRecursion.sort(input2));

            int[] input3 = {2};
            int[] output3 = {2};
            assertArrayEquals(output3, sortArrayUsingRecursion.sort(input3));

            int[] input4 = {3, 2, 1, 6, 2, 7, 6, 5};
            int[] output4 = {1, 2, 2, 3, 5, 6, 6, 7};
            assertArrayEquals(output4, sortArrayUsingRecursion.sort(input4));
        });
    }
}