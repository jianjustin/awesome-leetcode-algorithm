package org.awesome.leetcode.algorithm.dp;

/**
 * @author yiezi
 * @date 2019/3/12
 * No.209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例:
 *
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * result:
 * 执行用时 : 2040 ms, 在Minimum Size Subarray Sum的Java提交中击败了0.93% 的用户
 * 内存消耗 : 40.4 MB, 在Minimum Size Subarray Sum的Java提交中击败了0.99% 的用户
 * 题解:
 * 状态转移方程
 * 设:
 */
public class minSubArrayLen {
    public int minSubArrayLenFunction(int s, int[] nums) {
        int length = nums.length;
        if(length<1) return 0;
        if(length ==1) return nums[0] >= s ? 1:0;

        int result = 0;
        int[] dp  = new int[length];
        for(int i =0;i<=nums.length-1;i++){
            if(nums[i]>=s)
                result =1;

            dp[i]=nums[i];
        }
        //控制步长
        for(int j = 1; j<=length-1;j++){
            for(int k =0 ; k<=length-1-j;k++){
                int end = k+j;
                dp[k] = dp[k]+nums[end];
                //判断是否符合条件
                if(result!=0 && function(dp[k],s)){
                    result = Math.min(result,j+1);
                }
                if(result == 0 && function(dp[k],s)){
                    result = j+1;
                }
            }
        }

        return result;
    }
    /**
     *是否大于s
     */
    public boolean function(int currentSum ,int s){
        if(currentSum>=s){
            return true;
        }
        return false;
    }
}
