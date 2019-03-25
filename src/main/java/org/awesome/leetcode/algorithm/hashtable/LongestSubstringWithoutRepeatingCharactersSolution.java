package org.awesome.leetcode.algorithm.hashtable;

/**
 * NO.3 -- 无重复字符的最长子串
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 */
public class LongestSubstringWithoutRepeatingCharactersSolution {

    public int lengthOfLongestSubstring(String s) {
        String s1 = "",smax = "";
        for (int i = 0; i < s.length(); i++) {
             if(s1.equals(s.substring(i,i+1)) || i == s.length()-1){
                 if(i > smax.length())smax = s.substring(0,i);
                 s = s.substring(i);
                 i = 0;
             }else{
                 s1 = s.substring(i,i+1);
             }
        }
        return smax.length();
    }


}
