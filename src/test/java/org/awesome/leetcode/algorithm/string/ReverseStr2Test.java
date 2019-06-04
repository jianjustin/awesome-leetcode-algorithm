package org.awesome.leetcode.algorithm.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStr2Test {
  private ReverseStr2 reverseWords2 = new ReverseStr2();

  @Test
  public void reverseWords() {
  }

  @Test
  public void reverseWord_1() {
    char[] chars = "abc".toCharArray();
    reverseWords2.reverseWord(chars, 0, 3);

    Assert.assertEquals("cba", new String(chars));
  }

  @Test
  public void reverseWord_2() {
    char[] chars = "ac".toCharArray();
    reverseWords2.reverseWord(chars, 0, 2);

    Assert.assertEquals("ca", new String(chars));
  }

  @Test
  public void reverseWord_3() {
    char[] chars = "".toCharArray();
    reverseWords2.reverseWord(chars,0,0);
    Assert.assertEquals("", String.valueOf(chars));

  }

  @Test
  public void reverseStr2_1() {
    String result = reverseWords2.reverseStr("ab", 1);
    Assert.assertEquals("ab",result);

  }
  @Test
  public void reverseStr2_2() {
    String result = reverseWords2.reverseStr("aba", 1);
    Assert.assertEquals("aba",result);

  }
  @Test
  public void reverseStr2_3() {
    String result = reverseWords2.reverseStr("abab", 1);
    Assert.assertEquals("abab",result);

  }
  @Test
  public void reverseStr2_4() {
    String result = reverseWords2.reverseStr("a", 1);
    Assert.assertEquals("a",result);

  }

  @Test
  public void reverseStr2_5() {
    String result = reverseWords2.reverseStr("abcde", 2);
    Assert.assertEquals("bacde",result);

  }
  @Test
  public void reverseStr2_6() {
    String result = reverseWords2.reverseStr("abcdefg", 2);
    Assert.assertEquals("bacdfeg",result);

  }
  @Test
  public void reverseStr2_7() {
    String result = reverseWords2.reverseStr("abcdefg", 2);
    Assert.assertEquals("bacdfeg",result);

  }
  @Test
  public void reverseStr2_8() {
    String result = reverseWords2.reverseStr("abcdefg", 3);
    Assert.assertEquals("cbadefg",result);

  }

}