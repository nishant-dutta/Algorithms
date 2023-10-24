package org.algorithms.recursion;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class KthBitInNthBinaryStringTest {
    KthBitInNthBinaryString kthBitInNthBinaryString = new KthBitInNthBinaryString();

    @Test
    void findKthBit() {
        Map<Integer, String> solutionsMap = new HashMap<>();
        solutionsMap.put(1, "0");
        solutionsMap.put(2, "011");
        solutionsMap.put(3, "0111001");
        solutionsMap.put(4, "011100110110001");
        solutionsMap.put(5, "0111001101100011011100100110001");

        for (int n = 1; n <= 5; n++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i < Math.pow(2, n); i++)
                stringBuilder.append(kthBitInNthBinaryString.findKthBit(n, i));

            assertEquals(solutionsMap.get(n), stringBuilder.toString());
        }


    }
}