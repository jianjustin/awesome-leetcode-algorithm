package org.awesome.leetcode.algorithm.dp;

/**
 * @yiezi
 * @Date 2019-03-08
 * 最长重复数组
 * No.718
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 * 题目连接：https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/
 * 解题思路：
 *  设dp(i+1,j+1)为A数组0-i，B数组0-j下最大长度子数组的长度
 *  状态转移方程式为：dp(i+1,j+1) = dp(i,j)+f(A[i],B[j])
 */
public class MaximumLengthofRepeatedSubarray {
    public int findLength(int[] A, int[] B) {
        int max =0;
        int length = A.length;
        length = length +1;
        int[][] dp = new int[length][length];
        for (int i = 0; i <= A.length - 1; i++) {
            for (int j = 0; j <= B.length - 1; j++) {
                if (1 == function(A,B,i - 1, j - 1)) {
                    dp[i + 1][j + 1] = function(A, B,i,j) + dp[i][j];
                } else {
                    dp[i + 1][j + 1] = function(A, B,i,j);
                }
                max =Math.max(max,dp[i+1][j+1]);
            }
        }


        return max;
    }


    private int   function(int a,int b){
        return (a == b ? Integer.valueOf(1) : Integer.valueOf(0));
    }
    private int   function(int[] a,int[] b,int x,int y){
        if (x <= 0 || y <= 0) {
            return 0;
        }
        return (a == b ? Integer.valueOf(1) : Integer.valueOf(0));
    }
}
