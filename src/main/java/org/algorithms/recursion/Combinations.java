package org.algorithms.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        System.out.println(combinations.combine(4, 2));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        combinationHelper(1, n, new Integer[k], 0, output );
        return output;
    }

    private void combinationHelper(int minNum, int maxNum, Integer[] nums, int index, List<List<Integer>> output){
        if(index == nums.length){
            List<Integer> result = new ArrayList<>(Arrays.asList(nums));
            output.add(result);
        }else{
            for(int i = minNum; i <= maxNum; i++){
                nums[index] = i;
                combinationHelper(i+1, maxNum, nums, index+1, output);
            }
        }
    }
}
