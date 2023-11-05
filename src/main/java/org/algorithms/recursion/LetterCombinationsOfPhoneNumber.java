package org.algorithms.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber letterCombinationsOfPhoneNumber = new LetterCombinationsOfPhoneNumber();
        System.out.println(letterCombinationsOfPhoneNumber.findLetterCombinations(""));
    }
    static HashMap<Character, String> keyMap = new HashMap<>();
    HashSet<String> outputList = new HashSet<>();

    static {
        keyMap.put('2', "abc");
        keyMap.put('3', "def");
        keyMap.put('4', "ghi");
        keyMap.put('5', "jkl");
        keyMap.put('6', "mno");
        keyMap.put('7', "pqrs");
        keyMap.put('8', "tuv");
        keyMap.put('9', "wxyz");

    }

    public HashSet<String> findLetterCombinations(String digits){
        if(!digits.isEmpty()){
            getCombinations(0 , digits.toCharArray(), new char[digits.length()]);
        }

        return outputList;
    }

    private void getCombinations(int index, char[] numbers, char[] output){
        if(index >= numbers.length){
            outputList.add(new String(output));
            return;
        }

        // Get all the possible values for that index and recurse
        for(char character: keyMap.get(numbers[index]).toCharArray()){
            output[index] = character;
            getCombinations(index+1, numbers, output);
        }
    }
}
