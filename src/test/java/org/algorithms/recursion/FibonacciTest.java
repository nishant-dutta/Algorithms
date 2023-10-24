package org.algorithms.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    void getFibonacci() {
        assertAll(() -> {
            assertEquals(0, fibonacci.getFibonacci(0));
            assertEquals(1, fibonacci.getFibonacci(1));
            assertEquals(1, fibonacci.getFibonacci(2));
            assertEquals(2, fibonacci.getFibonacci(3));
            assertEquals(3, fibonacci.getFibonacci(4));
            assertEquals(5, fibonacci.getFibonacci(5));
            assertEquals(8, fibonacci.getFibonacci(6));
            assertEquals(13, fibonacci.getFibonacci(7));
            assertEquals(21, fibonacci.getFibonacci(8));
            assertEquals(34, fibonacci.getFibonacci(9));
        });
    }
}