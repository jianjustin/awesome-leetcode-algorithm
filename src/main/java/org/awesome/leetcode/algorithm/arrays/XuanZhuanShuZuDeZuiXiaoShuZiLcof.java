package org.awesome.leetcode.algorithm.arrays;

public class XuanZhuanShuZuDeZuiXiaoShuZiLcof {
	
	public int minArray(int[] numbers) {
		if(null == numbers || numbers.length == 0)return -1;
        for (int i = 1; i < numbers.length; i++) 
            if (numbers[i] < numbers[i-1]) return numbers[i];
        return numbers[0];
    }

}
