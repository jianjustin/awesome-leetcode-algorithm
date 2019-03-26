package org.awesome.leetcode.algorithm.dp;

/**
 * @author eatMelon-Masses
 * @date ate 2019-03-08
 * 最长重复数组
 * No.718
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 * 题目连接：https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/
 * 解题思路：
 *  设dp(i+1,j+1)为A数组0-i，B数组0-j下最大长度子数组的长度
 *  状态转移方程式为：dp(i+1,j+1) = dp(i,j)+f(A[i],B[j])
 *  result
 *  执行时间:138ms
 *  内存消耗:55.38MB
 */
public class MaximumLengthofRepeatedSubarray {
	
    public int findLength(int[] A, int[] B) {
        int max =0,length = A.length + 1;
        int[][] dp = new int[length][length];
        for (int i = 0; i <= A.length-1 ; i++) {
            for (int j = 0; j <= B.length-1; j++) {
                dp[i + 1][j + 1] = A[i] == B[j] ? dp[i][j]+1 : 0;
                max =Math.max(max,dp[i+1][j+1]);
            }
        }
        return max;
    }
    
    /**
     * 添加方法二：减少dp的存储量，清空无效存储
     * 执行时间：36 ms
     * 内存消耗：39.1 MB
     */
    public int findLengthfn2(int[] A, int[] B) {
        int max =0,length = A.length + 1;
        int[] dp = new int[length];
        for (int i = 0; i < A.length ; i++) {
            for (int j = B.length-1; j >= 0; j--) {
                dp[j + 1] = A[i] == B[j] ? dp[j]+1 : 0;
                max = max > dp[j+1]?max:dp[j+1];
            }
        }
        return max;
    }

}
