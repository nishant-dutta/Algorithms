package org.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        System.out.println(letterCasePermutation.letterCasePermutation("a1a"));

    }

    public List<String> letterCasePermutation(String inputString){
        ArrayList<String> result = new ArrayList<>();
        if(inputString == null || inputString.isEmpty())
            return result;

        return permutationHelper(inputString.toCharArray(), 0, result);
    }

    private List<String> permutationHelper(char[] inputChars, int index, List<String> result){
        if(index >= inputChars.length){
            result.add(new String(inputChars));
        }else if(Character.isDigit(inputChars[index] )){
            permutationHelper(inputChars, index + 1, result);
        }else {
            inputChars[index] = Character.toLowerCase(inputChars[index]);
            permutationHelper(inputChars, index + 1, result);
            inputChars[index] = Character.toUpperCase(inputChars[index]);
            permutationHelper(inputChars, index + 1, result);
        }
        return result;
    }
}
