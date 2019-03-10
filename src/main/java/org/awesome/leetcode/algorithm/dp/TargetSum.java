package org.awesome.leetcode.algorithm.dp;

/**
 * @author yiezi
 * 目标和
 * No.494
 * 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
 * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
 * 示例 1:
 * 输入: nums: [1, 1, 1, 1, 1], S: 3
 * 输出: 5
 * 解释:
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * 一共有5种方法让最终目标和为3。
 */
public class TargetSum {
    public int  findTargetSumWays(int[] nums, int S) {
        int result = function(nums,nums.length-1,S);
        return result;
    }
    public int function(int[]nums,int index,int target){
        if(index == -1){
            return target==0?1:0;
        }else{
            return function(nums,index-1,target-nums[index])+function(nums,index-1,target+nums[index]);
        }
    }
}
