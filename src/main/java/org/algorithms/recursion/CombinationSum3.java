package org.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;
//todo: optimize
public class CombinationSum3 {
    public static void main(String[] args) {
        CombinationSum3 combinationSum3 = new CombinationSum3();
        System.out.println(combinationSum3.combinationSum3(9, 45));
    }

    public List<List<Integer>> combinationSum3(int count, int sum) {
        List<List<Integer>> output = new ArrayList<>();
        combinationHelper(count,sum, 1, new ArrayList<>(), output);
        return output;
    }

    private void combinationHelper(int count, int sum, int index, List<Integer> result, List<List<Integer>> output){
        if (sum == 0 && count == 0) {
            output.add(result);
        }
        else if(sum < 0 || count < 0 || index > 9)
            return;
        else{
            combinationHelper(count, sum, index+1, new ArrayList<>(result), output);
            result.add(index);
            combinationHelper(count-1, sum-index, index+1, new ArrayList<>(result), output);
        }
    }
}
