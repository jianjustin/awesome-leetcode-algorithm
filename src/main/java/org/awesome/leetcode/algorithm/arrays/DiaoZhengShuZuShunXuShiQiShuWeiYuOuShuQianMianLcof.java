package org.awesome.leetcode.algorithm.arrays;

public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {

	public int[] exchange(int[] nums) {
		if(null == nums || nums.length == 0)return nums;
		int i =0,j = nums.length-1;
		
		while (i<j) {
			if(nums[i]%2 != 0)
				i++;
			else if(nums[j]%2 == 0)
				j--;
			else if(nums[i]%2 == 0 && nums[j]%2 != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		
		return nums;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		(new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof()).exchange(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
	}
}
