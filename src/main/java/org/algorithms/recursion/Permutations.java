package org.algorithms.recursion;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        permutations.getPermutations(new int[]{1,2,3});
    }

    public void getPermutations(int[] nums){
        HashSet<Integer> numsSet = new HashSet<>();
        for(int num: nums)
            numsSet.add(num);
        permutationsHelper(numsSet, new ArrayList<>());
    }

    private void permutationsHelper(HashSet<Integer> numsSet, ArrayList<Integer> result){
        if(numsSet.isEmpty()){
            System.out.println(result);
            return;
        }

        for(int number: numsSet){
            result.add(number);
            HashSet<Integer> newSet = new HashSet<>(numsSet);
            newSet.remove(number);
            permutationsHelper(newSet, new ArrayList<>(result));
            result.remove(result.size()-1);
        }
    }
}
