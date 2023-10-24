package org.algorithms.recursion;

import java.util.Arrays;

/*
 * Generate all strings of length n drawn from 0...,k-1
 *
 * No need for JUnit tests as it writes possibilities on console
 * */
public class KAryStrings {

    public static void main(String[] args) {
        KAryStrings kAryStrings = new KAryStrings();
        kAryStrings.generateKAryStrings(4, 2);
    }

    public void generateKAryStrings(int n, int k) {
        generateStrings(new int[n], 0, k);
    }

    private void generateStrings(int[] chars, int index, int k) {
        if (index == chars.length) {
            System.out.println(Arrays.toString(chars));
        } else {
            for (int i = 0; i < k; i++) {
                chars[index] = i;
                generateStrings(chars, index + 1, k);
            }
        }
    }
}
