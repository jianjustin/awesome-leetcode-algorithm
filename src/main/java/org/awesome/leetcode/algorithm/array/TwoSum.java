package org.awesome.leetcode.algorithm.array;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target == (nums[i]+nums[j])){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
