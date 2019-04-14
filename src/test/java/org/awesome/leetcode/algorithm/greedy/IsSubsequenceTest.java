package org.awesome.leetcode.algorithm.greedy;

import org.junit.Assert;
import org.junit.Test;

public class IsSubsequenceTest {
    private IsSubsequence isSubsequence = new IsSubsequence();


    /**
     * s 为 abc
     * t 为 ahbgdc
     * 断言结果true
     */
    @Test
    public void IsSubsequence() {
        String s = "abc";
        String t = "ahbgdc";
        boolean actual = isSubsequence.isSubsequence(s, t);
        Assert.assertTrue(actual);

    }

    /**
     * s 为 abc
     * t 为 ab
     * 断言结果false
     */
    @Test
    public void IsSubsequence2() {
        String s = "abc";
        String t = "ab";
        boolean actual = isSubsequence.isSubsequence(s, t);
        Assert.assertFalse(actual);
    }
}
