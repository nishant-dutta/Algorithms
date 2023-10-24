package org.algorithms.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    @DisplayName("Positive Inputs")
    void positiveInputs() {
        assertAll(() -> {
            assertEquals(1, factorial.findFactorial(0));
            assertEquals(1, factorial.findFactorial(1));
            assertEquals(2, factorial.findFactorial(2));
            assertEquals(6, factorial.findFactorial(3));
        });
    }

    @Test
    @DisplayName("Negative Inputs")
    void negativeInputs() {
        assertAll(() -> {
            assertEquals(1, factorial.findFactorial(-0));
            assertEquals(-1, factorial.findFactorial(-1));
            assertEquals(2, factorial.findFactorial(-2));
            assertEquals(-6, factorial.findFactorial(-3));
        });
    }
}