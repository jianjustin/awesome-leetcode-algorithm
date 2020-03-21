package org.awesome.leetcode.algorithm.campus.alibaba;

import java.util.Scanner;

/**
 * 2020.03.20 阿里巴巴笔试题 题目一：
 * 	有一叠扑克牌，每张牌介于1和10之间
 *  有四种出牌方法：
 *      单出1张
 *      出2张对子
 *      出五张顺子，如12345
 *      出三连对子，如112233
 *  给10个数，表示1-10每种牌有几张，问最少要多少次能出完
 * @author jian
 *
 */
public class PlayingCards {
	
	public int playing(int[] nums) {
		int i = 0;//获取起始位置，可记忆化
		while(i<nums.length && nums[i]<=0)i++;
		if(i == nums.length)return 0;
		
		nums[i]--;//出单牌
		int min = 1+playing(nums);
		nums[i]++;
		
		if(nums[i]>=2) { //出对子
			nums[i]-=2;
			min = Math.min(min, playing(nums)+1);
			nums[i]+=2;
		}
		
		if(i<6) //出顺子
			if(nums[i]>0 && nums[i+1]>0 && nums[i+2]>0 && nums[i+3]>0 && nums[i+4]>0) {
				for (int j = 0; j < 5; j++) nums[i+j]--;
				min = Math.min(min, playing(nums)+1);
				for (int j = 0; j < 5; j++) nums[i+j]++;//reset
			}
		
		
		if(i<8) //出连对
			if(nums[i]>1 && nums[i+1]>1 && nums[i+2]>1) {
				for (int j = 0; j < 3; j++)nums[i+j]-=2;
				min = Math.min(min, playing(nums)+1);
				for (int j = 0; j < 3; j++)nums[i+j]+=2;
			}
		
		
		return min;
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) 
			arr[i] = scanner.nextInt();
		
		int ans = (new PlayingCards()).playing(arr);
		System.out.println(ans);
		scanner.close();
	}
}
