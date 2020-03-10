package org.awesome.leetcode.algorithm.arrays;

public class HuaDongChuangKouDeZuiDaZhiLcof {
	
	public int[] maxSlidingWindow(int[] nums, int k) {
		if(null == nums || nums.length == 0)return new int[0];
		
		int size = nums.length-k+1;
		int[] result = new int[size];
		for(int i=0; i<size; i++) {
			result[i] = nums[i];
			for(int j=i+1; j<i+k; j++) {
				result[i] = Math.max(result[i], nums[j]);
			}
		}
		return result;
    }

}
