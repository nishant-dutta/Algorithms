package org.algorithms.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    @Test
    void reverseString() {
        assertAll(() -> {
            assertEquals("", reverseString.reverseString(""));
            assertEquals("a", reverseString.reverseString("a"));
            assertEquals("ba", reverseString.reverseString("ab"));
            assertEquals("dad", reverseString.reverseString("dad"));
        });
    }
}