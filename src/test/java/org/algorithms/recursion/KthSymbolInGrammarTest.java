package org.algorithms.recursion;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class KthSymbolInGrammarTest {
    KthSymbolInGrammar kthSymbolInGrammar = new KthSymbolInGrammar();

    @Test
    void getKthSymbol() {
        Map<Integer, String> solutions = new HashMap<>();
        solutions.put(1, "0");
        solutions.put(2, "01");
        solutions.put(3, "0110");
        solutions.put(4, "01101001");
        solutions.put(5, "0110100110010110");

        for(int n=1; n <= 5; n++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int k = 1; k <= Math.pow(2, n-1); k++){
                stringBuilder.append(kthSymbolInGrammar.getKthSymbol(n,k));
            }
            assertEquals(solutions.get(n), stringBuilder.toString());
        }
    }
}