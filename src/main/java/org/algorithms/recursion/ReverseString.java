package org.algorithms.recursion;

/*
 * Write a function that reverses a string.You must do this by modifying the input array in-place with O(1) extra memory.
 * */
public class ReverseString {

    public String reverseString(String input) {
        return String.valueOf(reverseHelper(input.toCharArray(), 0));
    }

    private char[] reverseHelper(char[] chars, int index) {
        if (index == chars.length / 2) {
            return chars;
        } else {
            char tempChar = chars[index];
            chars[index] = chars[chars.length - 1 - index];
            chars[chars.length - 1 - index] = tempChar;

            return reverseHelper(chars, index + 1);
        }
    }
}
