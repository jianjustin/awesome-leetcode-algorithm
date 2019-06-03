package org.awesome.leetcode.algorithm.string;

import org.junit.Assert;
import org.junit.Test;


public class ReverseWords3Test {
    private ReverseWords3 reverseWords3 = new ReverseWords3();

    @Test
    public void reverseWords() {
    }

    @Test
    public void reverseWord_1() {
        char[] chars = "abc".toCharArray();
        reverseWords3.reverseWord(chars, 0, 2);

        Assert.assertEquals("cba", new String(chars));
    }

    @Test
    public void reverseWord_2() {
        char[] chars = "ac".toCharArray();
        reverseWords3.reverseWord(chars, 0, 1);

        Assert.assertEquals("ca", new String(chars));
    }

    @Test
    public void reverseWord_3() {
        Assert.assertEquals("", reverseWords3.reverseWords(""));
    }

    @Test
    public void reverseWord_4() {
        Assert.assertEquals("", reverseWords3.reverseWords(" "));
    }

    @Test
    public void reverseWords_1() {
        Assert.assertEquals("abc abc", reverseWords3.reverseWords("cba cba"));
    }

    @Test
    public void reverseWords_2() {
        Assert.assertEquals("abc ab", reverseWords3.reverseWords("cba ba"));
    }

    @Test
    public void reverseWords_3() {
        Assert.assertEquals("Let's take LeetCode contest", reverseWords3.reverseWords("s'teL ekat edoCteeL tsetnoc"));
    }

    @Test
    public void reverseWords_4() {
        Assert.assertEquals("a", reverseWords3.reverseWords("a"));
    }

    @Test
    public void reverseWords_5() {
        Assert.assertEquals("a a aa ab", reverseWords3.reverseWords("a a aa ba"));
    }
}