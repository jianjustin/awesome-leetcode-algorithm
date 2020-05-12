package org.awesome.leetcode.algorithm.nowcoder.tencent;

import java.util.Scanner;

public class Problem3 {
	
	public int minRestDay(int[] worksDay, int[] gymDay) {
		if(null == worksDay || worksDay.length == 0)return 0;
		if(null == gymDay || gymDay.length == 0)return 0;
		
		int len = worksDay.length;
		int[][] dp = new int[3][worksDay.length+1];
		
		for (int i = 1; i <= len; i++) {
			dp[0][i] = dp[1][i] = dp[2][i] = Math.min(dp[0][i-1], Math.min(dp[1][i-1], dp[2][i-1]))+1;
			if(1 == worksDay[i-1])dp[1][i] = Math.min(dp[0][i-1], dp[2][i-1]);
			if(1 == gymDay[i-1])dp[2][i] = Math.min(dp[0][i-1], dp[1][i-1]);
		}
		
		return Math.min(dp[0][len], Math.min(dp[1][len], dp[2][len]));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] worksDay = new int[n], gymDay = new int[n];
		for (int i = 0; i < n; i++) worksDay[i] = sc.nextInt();
		for (int i = 0; i < n; i++) gymDay[i] = sc.nextInt();
		
		int result = (new Problem3()).minRestDay(worksDay, gymDay);
		System.out.println(result);
		
		sc.close();
	}

}
