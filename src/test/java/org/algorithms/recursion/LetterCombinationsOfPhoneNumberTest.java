package org.algorithms.recursion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfPhoneNumberTest {
    LetterCombinationsOfPhoneNumber letterCombinationsOfPhoneNumber = new LetterCombinationsOfPhoneNumber();
    @Test
    void findLetterCombinations() {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
        assertEquals(letterCombinationsOfPhoneNumber.findLetterCombinations("23"), hashSet);
    }

    @Test
    void findLetterCombinations2() {
        assertEquals(letterCombinationsOfPhoneNumber.findLetterCombinations(""), new HashSet<>());
    }
}