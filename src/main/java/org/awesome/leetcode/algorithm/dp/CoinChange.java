package org.awesome.leetcode.algorithm.dp;

import java.util.Arrays;

/**
 * leetcode 322. 零钱兑换
 * @author jian
 *
 */
public class CoinChange {
	
	public int coinChange(int[] coins, int amount) {
		if(null == coins || coins.length == 0)return -1;
		if(amount < 0)return -1;
		
		int[] dp = new int[amount+1];
		Arrays.sort(coins);//对金额进行排序
		
		for (int i = 1; i <= amount; i++) {//遍历得到所有金额的最小方案
			dp[i] = amount+1;
			for (int j : coins) {
				if(i < j)break;
				dp[i] = Math.min(dp[i], dp[i-j]+1);
			}
		}
		if(dp[amount] > amount)return -1;
		return dp[amount];
    }
	
	public static void main(String[] args) {
		int[] coins = {2};
		int amount = 3;
		int result = (new CoinChange()).coinChange(coins, amount);
		System.out.println(result);
	}

}
