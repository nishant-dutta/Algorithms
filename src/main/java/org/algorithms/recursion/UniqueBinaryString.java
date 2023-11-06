package org.algorithms.recursion;

public class UniqueBinaryString {
    public static void main(String[] args) {
        UniqueBinaryString uniqueBinaryString = new UniqueBinaryString();
        System.out.println(uniqueBinaryString.findDifferentBinaryString(new String[]{"00", "01"}));
    }

    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans= new StringBuilder();
        for(int i=0; i<nums.length; i++)
            ans.append(nums[i].charAt(i) == '0' ? '1' : '0');
        return ans.toString();
    }
}
