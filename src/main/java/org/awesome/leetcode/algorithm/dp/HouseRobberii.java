package org.awesome.leetcode.algorithm.dp;

/**
 * 213. 打家劫舍 II
 * @author jian
 *
 */
public class HouseRobberii {
	
	public int rob(int[] nums) {
		if(null == nums || nums.length == 0)return 0;
		if(1 == nums.length)return nums[0];
		if(2 == nums.length)return Math.max(nums[0], nums[1]);
		if(3 == nums.length)return Math.max(nums[0], Math.max(nums[1], nums[2]));
		
		int m = nums[0], n = Math.max(nums[0], nums[1]), a = nums[1], b = Math.max(nums[1], nums[2]) ;
		for(int i=2; i<nums.length-1; i++) {
			int k = Math.max(n, m+nums[i]);
			m = n;
			n = k;
		}
		for(int i=3; i<nums.length-1; i++) {
			int c = Math.max(b, a+nums[i]);
			a = b;
			b = c;
		}
		
		return Math.max(n, a+nums[nums.length-1]);
    }
	
	public static void main(String[] args) {
		int[] nums = {2,2,3,2,1};
		System.out.println((new HouseRobberii()).rob(nums));
	}

}
