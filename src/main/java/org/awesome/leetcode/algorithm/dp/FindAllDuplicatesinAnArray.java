package org.awesome.leetcode.algorithm.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouye
 * @date 2019-03-25
 * 442. 数组中重复的数据
 * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
 *
 * 找到所有出现两次的元素。
 *
 * 你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？
 *
 * 示例：
 *
 * 输入:
 * [4,3,2,7,8,2,3,1]
 *
 * 输出:
 * [2,3]
 */
public class FindAllDuplicatesinAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums.length==1) return new ArrayList<Integer>();
        if(nums.length==2 && nums[0]!=nums[1]) return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==-1||(i+1)==nums[i]) continue;
            while(nums[i]!=-1&&changeNum(nums,i,result));
        }
        return result;
    }
    public boolean changeNum(int[] nums,int index,List<Integer> result){
        int e = nums[index];
        int nextChangeNum = nums[e-1];
        if(nextChangeNum == e){
            result.add(e);
            nums[index]=-1;
            return false;
        }
        nums[index]=nextChangeNum;
        nums[e-1]=e;
        return true;
    }
}
