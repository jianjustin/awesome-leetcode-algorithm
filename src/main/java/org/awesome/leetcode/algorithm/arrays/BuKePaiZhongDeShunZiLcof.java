package org.awesome.leetcode.algorithm.arrays;

import java.util.Arrays;

public class BuKePaiZhongDeShunZiLcof {
	
	public boolean isStraight(int[] nums) {
		if(null == nums || nums.length != 5)return false;
		
		int m = 0;
		Arrays.parallelSort(nums);
		
		for(int i=0; i<nums.length; i++) {
			if(m < 0)return false;
			if(0 == nums[i])
				m++;
			else if(i>0 && nums[i-1]>0) {
				if(nums[i] == nums[i-1])return false;
				if(nums[i] != nums[i-1]+1) m-=nums[i]-nums[i-1]-1;
			}
		}
		if(m < 0)return false;
		return true;
    }
	
	public static void main(String[] args) {
		int[] a = {0,0,1,2,5};
		System.out.println((new BuKePaiZhongDeShunZiLcof()).isStraight(a));
	}

}
