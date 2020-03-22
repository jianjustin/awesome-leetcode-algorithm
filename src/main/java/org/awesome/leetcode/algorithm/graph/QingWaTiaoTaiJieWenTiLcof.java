package org.awesome.leetcode.algorithm.graph;

/**
 * 面试题10- II. 青蛙跳台阶问题
 * @author jian
 *
 */
public class QingWaTiaoTaiJieWenTiLcof {
	
	public int numWays(int n) {
		if(0 == n)return 1;
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) dp[i] = (dp[i-1] + dp[i-2])%1000000007;
		return dp[n];
    }

}
