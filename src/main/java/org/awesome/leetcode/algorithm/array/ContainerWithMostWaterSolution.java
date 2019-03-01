package org.awesome.leetcode.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * NO.11
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * 
 * 题目链接：https://leetcode-cn.com/problems/container-with-most-water/
 * 
 * result: 
 * 执行用时: 1161 ms, 在Container With Most Water的Java提交中击败了0.99% 的用户
 * 内存消耗: 40.7 MB, 在Container With Most Water的Java提交中击败了0.96% 的用户
 * @author chenjianrui
 *
 */
public class ContainerWithMostWaterSolution {
	
    public int maxArea(int[] height) {
    	List<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < height.length; i++) {
			list.add(height[i]);
		}
    	
    	int max = 0;
    	for (int i = 0; i < height.length; i++) {
    		for (int j = 0; j < height.length; j++) {
    			if(i==j)continue;
    			int h = Math.abs(i-j);
    			int w = height[i];
    			if(height[j]<w)w = height[j];
    			if(w*h>max)max = w*h;
    		}
		}
    	return max;
    }

}
