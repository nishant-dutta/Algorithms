package org.algorithms.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfFourTest {
    PowerOfFour powerOfFour = new PowerOfFour();

    @Test
    @DisplayName("Positive Cases")
    void positiveCases() {
        assertAll(() -> {
            for (int i = 0; i <= 64; i++) {
                if (i == 1 || i == 4 || i == 16 || i == 64)
                    assertTrue(powerOfFour.isPowerOfFour(i));
                else
                    assertFalse(powerOfFour.isPowerOfFour(i));
            }
        });
    }

    @Test
    @DisplayName("Negative Cases")
    void negativeCases() {
        assertAll(() -> {
            for (int i = 0; i >= -64; i--) {
                if (i == 1 || i == 4 || i == 16 || i == 64)
                    assertTrue(powerOfFour.isPowerOfFour(i));
                else
                    assertFalse(powerOfFour.isPowerOfFour(i));
            }
        });
    }
}