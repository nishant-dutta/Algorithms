package org.algorithms.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBinaryStringTest {
    UniqueBinaryString uniqueBinaryString = new UniqueBinaryString();
    @Test
    void findDifferentBinaryString() {
        assertEquals("10", uniqueBinaryString.findDifferentBinaryString(new String[]{"00", "01"}));
    }
}