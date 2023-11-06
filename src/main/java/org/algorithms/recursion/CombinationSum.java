package org.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(new int[]{2,3,5}, 8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        combinationHelper(candidates, target, 0, new ArrayList<>(), output);
        return output;
    }

    private void combinationHelper(int[] candidates, int target, int index, List<Integer> result, List<List<Integer>> output){
        if(index >= candidates.length)
            return;
        if(target == 0){
            output.add(result);
        } else if (target > 0) {
            combinationHelper(candidates, target, index + 1, new ArrayList<>(result), output);
            result.add(candidates[index]);
            combinationHelper(candidates, target - candidates[index], index, new ArrayList<>(result), output);
        }
    }
}
