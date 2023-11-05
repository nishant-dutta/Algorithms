package org.algorithms.recursion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class LetterCasePermutationTest {
    LetterCasePermutation letterCasePermutation = new LetterCasePermutation();

    @Test
    void letterCasePermutation() {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("a1a", "a1A", "A1a", "A1A"));
        assertEquals(hashSet, new HashSet<>(letterCasePermutation.letterCasePermutation("a1a")));
    }
}