package org.algorithms.recursion;

import java.util.Arrays;

/*
 * Generate all strings of n bits. Assume A[0...,n-1] is an array of size n.
 *
 * No need for JUnit tests as it writes possibilities on console
 * */
public class NBitStrings {

    public static void main(String[] args) {
        NBitStrings nBitStrings = new NBitStrings();
        nBitStrings.generateNBitStrings(3);
    }

    public void generateNBitStrings(int n) {
        generateStrings(new char[n], 0);
    }

    private void generateStrings(char[] chars, int index) {
        if (index == chars.length) {
            System.out.println(Arrays.toString(chars));
        } else {
            chars[index] = '0';
            generateStrings(chars, index + 1);

            chars[index] = '1';
            generateStrings(chars, index + 1);
        }
    }
}
