package org.awesome.leetcode.algorithm.nowcoder.tencent;

import java.util.Scanner;
import java.util.Stack;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/35fac8d69f314e958a150c141894ef6a
 *
 * 小Q在周末的时候和他的小伙伴来到大城市逛街，一条步行街上有很多高楼，共有n座高楼排成一行。
 * 小Q从第一栋一直走到了最后一栋，小Q从来都没有见到这么多的楼，所以他想知道他在每栋楼的位置处能看到多少栋楼呢？（当前面的楼的高度大于等于后面的楼时，后面的楼将被挡住） 
 * @author jian
 *
 */
public class Problem2 {
	
	public int[] countLookNum(int[] buildings) {
		if(null == buildings || buildings.length == 0)return new int[0];
		int[] result = new int[buildings.length];
		
		Stack<Integer> leftStack = new Stack<>(), rightStack = new Stack<>();
		
		for (int i = 0; i < buildings.length; i++) {
			result[i] = leftStack.size()+1;
			while(!leftStack.isEmpty() && leftStack.peek() <= buildings[i])
				leftStack.pop();
			leftStack.push(buildings[i]);
		}
		
		for (int i = buildings.length - 1; i >= 0; i--) {
			result[i] += rightStack.size();
			while(!rightStack.isEmpty() && rightStack.peek() <= buildings[i])
				rightStack.pop();
			rightStack.push(buildings[i]);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) 
			nums[i] = sc.nextInt();
		
		int[] result = (new Problem2()).countLookNum(nums);
		for (int i = 0; i < result.length; i++) 
			System.out.print(result[i]+",");
		
		sc.close();
	}

}
