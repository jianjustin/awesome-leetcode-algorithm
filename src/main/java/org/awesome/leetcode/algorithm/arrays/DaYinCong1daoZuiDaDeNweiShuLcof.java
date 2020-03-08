package org.awesome.leetcode.algorithm.arrays;

public class DaYinCong1daoZuiDaDeNweiShuLcof {
	
	public int[] printNumbers(int n) {
		int count = (int)Math.pow(10,n);
		int[] result = new int[count-1];
		
		for (int i = 0; i < count-1; i++) 
			result[i] = i+1;
		return result;
    }

}
