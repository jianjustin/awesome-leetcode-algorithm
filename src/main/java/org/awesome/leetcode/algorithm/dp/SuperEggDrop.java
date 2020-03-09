package org.awesome.leetcode.algorithm.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * 887. 鸡蛋掉落
 * @author jian
 *
 */
public class SuperEggDrop {
	
	public int superEggDrop(int K, int N) {
		int[][] dp = new int[N+1][K+1];
		superEggDrop1(K, N, dp);
		return dp[N][K];
    }
	
	public int superEggDrop1(int K, int N, int[][] dp) {
		if(K == 1 || N == 0 || N == 1) {
			dp[N][K] = N;
			return N;
		}
		
		int result = N;
		for(int i=1; i<=N; i++) {
			int a = dp[i-1][K-1]>0?dp[i-1][K-1]:superEggDrop1(K-1,i-1,dp);
			int b = dp[N-i][K]>0?dp[N-i][K]:superEggDrop1(K,N-i,dp);
			result = Math.min(result, Math.max(a,b)+1);
			dp[N][K] = result;
		}
		return result;
	}
	
	Map<Integer, Integer> memo = new HashMap<>();
    public int dp(int K, int N) {
        if (!memo.containsKey(N * 100 + K)) {
            int ans;
            if (N == 0)
                ans = 0;
            else if (K == 1)
                ans = N;
            else {
                int lo = 1, hi = N;
                while (lo + 1 < hi) {
                    int x = (lo + hi) / 2;
                    int t1 = dp(K-1, x-1);
                    int t2 = dp(K, N-x);

                    if (t1 < t2)
                        lo = x;
                    else if (t1 > t2)
                        hi = x;
                    else
                        lo = hi = x;
                }

                ans = 1 + Math.min(Math.max(dp(K-1, lo-1), dp(K, N-lo)),
                                   Math.max(dp(K-1, hi-1), dp(K, N-hi)));
            }

            memo.put(N * 100 + K, ans);
        }

        return memo.get(N * 100 + K);
    }
	
	public static void main(String[] args) {
		int k = 2, n = 6;
		int result = (new SuperEggDrop()).dp(k, n);
		System.out.println(result);
	}

}
