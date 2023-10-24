package org.algorithms.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    void isPowerOfTwo() {
        assertAll(() -> {
            for (int i = 0; i <= 64; i++) {
                if (i == 1 || i == 2 || i == 4 || i == 8 || i == 16 || i == 32 || i == 64)
                    assertTrue(powerOfTwo.isPowerOfTwo(i));
                else
                    assertFalse(powerOfTwo.isPowerOfTwo(i));
            }
        });
    }
}