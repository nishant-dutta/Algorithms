package org.algorithms.recursion;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        subsets.getSubsets(new int[]{});
    }

    public void getSubsets(int[] inputNums){
        getSubsetsHelper(inputNums, 0, new ArrayList<>());
    }

    public void getSubsetsHelper(int[] inputNums, int index, ArrayList<Integer> output){
        if(index >= inputNums.length){
            System.out.println(output);
            return;
        }

        getSubsetsHelper(inputNums, index+1, new ArrayList<>(output));
        output.add(inputNums[index]);
        getSubsetsHelper(inputNums, index+1, new ArrayList<>(output));
    }
}
