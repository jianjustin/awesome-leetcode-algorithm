package org.awesome.leetcode.algorithm.dp;

/**
 * @author yiezi
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
        int max =0;
        int length = A.length;
        length = length +1;
        int[][] dp = new int[length][length];
        for (int i = 0; i <= A.length-1 ; i++) {
            for (int j = 0; j <= B.length-1; j++) {
                //上一对元素也相等的情况下才进行累加
                int tempResult=function(A, B,i,j);
                if ( dp[i][j]>0 && tempResult>0) {
                    dp[i + 1][j + 1] =tempResult+ dp[i][j];
                } else {
                    dp[i + 1][j + 1]=tempResult;
                }
                max =Math.max(max,dp[i+1][j+1]);

            }
        }
        return max;
    }

    /**
     *  判断x,y 坐标对应元素是否相等
     * @param a 数组A
     * @param b 数组B
     * @param x 坐标X
     * @param y 坐标Y
     * @return 相等1，不相等0
     */
    private int   function(int[] a,int[] b,int x,int y){
        if (x < 0 || y < 0) {
            return 0;
        }
        return (a[x] == b[y] ? 1 : 0);
    }

}
