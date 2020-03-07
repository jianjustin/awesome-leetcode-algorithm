package org.awesome.leetcode.algorithm.arrays;

/**
 * @author zhouye
 * @date 2019/4/2
 * No.287 寻找重复数
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 *
 * 示例 1:
 *
 * 输入: [1,3,4,2,2]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [3,1,3,4,2]
 * 输出: 3
 * 说明：
 *
 * 不能更改原数组（假设数组是只读的）。
 * 只能使用额外的 O(1) 的空间。
 * 时间复杂度小于 O(n2) 。
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。
 * result:
 * 执行用时 : 1 ms, 在Find the Duplicate Number的Java提交中击败了93.40% 的用户
 * 内存消耗 : 38.5 MB, 在Find the Duplicate Number的Java提交中击败了0.64% 的用户
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int count =   circleLength(nums);
        int fast = 0;
        int slow = 0;
        for(int i =1;i<=count;i++){
            fast = nums[fast];
        }
        while(fast!=slow){
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
    public int circleLength(int[] nums){
        int slow =0;
        int fast =0;
        while(true){
            fast = nums[nums[fast]];
            slow = nums[slow];
            if(fast==slow){
                int count = 0;
                while(true){
                    fast = nums[nums[fast]];
                    slow = nums[slow];
                    count++;
                    if(fast==slow){
                        return count;
                    }
                }
            }
        }
    }
}
