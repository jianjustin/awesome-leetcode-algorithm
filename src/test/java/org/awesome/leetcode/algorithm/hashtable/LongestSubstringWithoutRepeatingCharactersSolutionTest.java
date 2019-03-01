package org.awesome.leetcode.algorithm.hashtable;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersSolutionTest {

    @Test
    public void lengthOfLongestSubstringTest(){
        LongestSubstringWithoutRepeatingCharactersSolution l = new LongestSubstringWithoutRepeatingCharactersSolution();
        String s = "pwwkew";

        System.out.println(l.lengthOfLongestSubstring(s));
    }
}
