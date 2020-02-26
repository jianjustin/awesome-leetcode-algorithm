package org.awesome.leetcode.algorithm.nowcoder.bytedancing;

import java.util.*;
import java.lang.*;


/**
 * 
 * 请听题：给定N（可选作为埋伏点的建筑物数）、D（相距最远的两名特工间的距离的最大值）以及可选建筑的坐标，计算在这次行动中，大锤的小队有多少种埋伏选择。
 * 注意：
 *   1. 两个特工不能埋伏在同一地点
 *   2. 三个特工是等价的：即同样的位置组合(A, B, C) 只算一种埋伏方法，不能因“特工之间互换位置”而重复使用
 *   
 * 示例1
 * 输入
 *		4 3
 *		1 2 3 4
 * 输出
 *		4
 * 说明
 *		可选方案 (1, 2, 3), (1, 2, 4), (1, 3, 4), (2, 3, 4)
 *    
 * @author jian
 *
 */
public class Problem2 {
	   public static long solution(int D, int[] nums) {
	        long res = 0;
	        int left = 0, right = 2, n = nums.length;
	              
	        while (left < n-2) {
	                while (right < n && nums[right] - nums[left] <= D)
	                    right += 1;
	                if (right - 1 - left >= 2) 
	                    res += (right - 1 - left) * (right - left - 2)/2;
	                
	                left += 1;
	        }
	              
	        return res % 99997867;
	    }
	     
	     
	     
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt(), D = sc.nextInt();
	        int[] nums = new int[N];
	        for (int i = 0; i < N; i++)
	            nums[i] = sc.nextInt();
	         
	        long result = Problem2.solution(D, nums);
	        System.out.println(result);
	    }
}
