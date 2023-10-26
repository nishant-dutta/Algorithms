package org.algorithms.recursion;
/*
Sort an integer Array Using Recursion
* */

public class SortArrayUsingRecursion {
    public int[] sort(int[] nums) {
        if (nums.length < 2)
            return nums;
        return sortHelper(nums, nums.length - 1);
    }

    private int[] sortHelper(int[] nums, int lastIndex) {
        if (lastIndex == 0)
            return nums;
        else {
            for (int i = 0; i < lastIndex; i++) {
                if (nums[i] > nums[lastIndex]) {
                    int temp = nums[lastIndex];
                    nums[lastIndex] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return sortHelper(nums, lastIndex - 1);
    }
}
