package org.awesome.leetcode.algorithm.dp;

/**
 * 背包问题
 * @author jian
 *
 */
public class BackPack {
	
	/**
	 * 0-1背包问题
	 * @param C 物品重量（费用）
	 * @param W 物品价值
	 * @param N 物品个数
	 * @param M 背包大小
	 * @return
	 */
	public int zeroOnePack(int[] C, int[] W, int N, int M) {
		int[] dp = new int[M+1];
		for (int i = 0; i < N; i++) {
			for (int j = M; j >= 0; j--) {
				if(j-C[i] < 0)continue;//物品大小超出背包大小
				dp[j] = Math.max(dp[j], dp[j-C[i]]+W[i]);
			}
		}
		return dp[M];	
	}
	
	/**
	 * 完全背包问题
	 * @return
	 */
	public int fullBackPack(int[] C, int[] W, int N, int M) {
		int[] dp = new int[M+1];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= M; j++) {
				if(j-C[i] < 0)continue;//物品大小超出背包大小
				dp[j] = Math.max(dp[j], dp[j-C[i]]+W[i]);
			}
		}
		return dp[M];	
	}
	
	/**
	 * 有N种物品和一个容量为V的背包。第i种物品最多有n[i]件可用，每件费用是c[i]，价值是w[i]。求解将哪些物品装入背包可使这些物品的费用总和不超过背包容量，且价值总和最大。
	 * @param c 物品重量（费用）
	 * @param w 物品价值
	 * @param n 第i件物品的可用数量
	 * @param N 物品个数
	 * @param V 背包大小
	 */
	public int multipleBackPack(int[] c, int[] w, int[] n, int N, int V) {
		int[] dp = new int[V+1];
		
		for (int i = 0; i < N; i++) {
			if(c[i]*n[i] >= V) {//物品费用*物品个数 >= 背包大小,说明能够当作完全背包解决
				for (int j = c[i]; j <= V; j++) {
					dp[j] = Math.max(dp[j], dp[j-c[i]]+w[i]);
				}
			}
			
			int k = 1, amount = n[i];
			while(k < amount) {
				for (int j = V; j >= k*c[i]; j--) 
					dp[j] = Math.max(dp[j], dp[j-k*c[i]]+k*w[i]);
				amount -= k;
				k*=2;
			}
			for (int j = V; j >= amount*c[i]; j--)
				dp[j] = Math.max(dp[j], dp[j-amount*c[i]]+amount*w[i]);
			
		}
		return dp[V];	
	}

}
