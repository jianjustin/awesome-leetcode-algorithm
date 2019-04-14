package org.awesome.leetcode.algorithm.greedy;

import org.junit.Assert;
import org.junit.Test;

public class minAddToMakeValidTest {
    private MinAddToMakeValid makeValid = new MinAddToMakeValid();

    /**
     * 测试用例 期望结果
     * 1.( 期望1
     * 2.() 期望0
     * 3.) 期望1
     * 4.(( 期望2
     * 5.()( 期望1
     * 6.)( 期望2
     */
    @Test
    public void minAddToMakeValid() {
        Assert.assertEquals(1, makeValid.minAddToMakeValid("("));
        Assert.assertEquals(0, makeValid.minAddToMakeValid("()"));
        Assert.assertEquals(1, makeValid.minAddToMakeValid(")"));
        Assert.assertEquals(2, makeValid.minAddToMakeValid("(("));
        Assert.assertEquals(1, makeValid.minAddToMakeValid("()("));
        Assert.assertEquals(2, makeValid.minAddToMakeValid(")("));
    }
}