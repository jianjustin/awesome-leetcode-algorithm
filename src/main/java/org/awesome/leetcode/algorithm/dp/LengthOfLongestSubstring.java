package org.awesome.leetcode.algorithm.dp;

import java.util.*;

/**
 * @author eatMelon-Masses
 * @date 2019-3-19
 * No.3 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * result:
 * 执行用时 : 964 ms, 在Longest Substring Without Repeating Characters的Java提交中击败了1.00% 的用户
 * 内存消耗 : 49.6 MB, 在Longest Substring Without Repeating Characters的Java提交中击败了12.52% 的用户
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()<=1){
            return s.length();
        }
        int length = s.length();
        char[] temp = s.toCharArray();
        int dp[] = new int[temp.length];
        int max = init(temp, dp);

        for (int i = 2; i <= length - 1; i++) {
            for (int j = 0; j + i <= length - 1; j++) {
                //如何子串无重复字母,两边相等
                if (dp[j]==0&& isDiff(j,j+i-1,temp[j+i],temp)){
                    //存储相同长度的子串
                    if (i > max) {
                        max = i;
                    }
                    dp[j] = 0;
                    //如果子串有重复字母
                }else {
                    dp[j] = 1;
                }
            }
        }
        return max+1;
    }

    /**
     *  如果子串中有与 e相同的元素返归false
     * @param start 开始位置
     * @param end 借书位置
     * @param e 需比较的目标元素
     * @param tempArray 比较数组
     * @return
     */
    public static boolean isDiff(int start, int end, char e, char[] tempArray) {
        for (;start<=end;start++) {
            if (tempArray[start] == e) {
                return false;
            }
        }
        return true;
    }

    //初始化dp信息
    public static int init(char[] temp,int[] dp){
        int max = 0;
        for (int i = 0; i <= temp.length - 2; i++) {
            if(temp[i] == temp[i + 1]){
                dp[i] = 1;
            }else{
                dp[i] = 0;
                max=1;
            }
        }
        return max;
    }
}
