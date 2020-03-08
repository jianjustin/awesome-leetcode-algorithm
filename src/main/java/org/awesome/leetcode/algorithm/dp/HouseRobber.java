package org.awesome.leetcode.algorithm.dp;

/**
 * 198. 打家劫舍
 * @author jian
 *
 */
public class HouseRobber {
	
	public int rob(int[] nums) {
		if(null == nums || nums.length == 0)return 0;
		if(1 == nums.length)return nums[0];
		if(2 == nums.length)return Math.max(nums[0], nums[1]);
		
		int m = nums[0], n = Math.max(nums[0], nums[1]);
		for(int i=2; i<nums.length; i++) {
			int k = Math.max(n, m+nums[i]);
			m = n;
			n = k;
		}
		return n;
    }

}
