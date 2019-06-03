package org.awesome.leetcode.algorithm.string;

/**
 * @author zhouye
 * @date 2019-06-03 No.反转字符串中的单词 III 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *     <p>示例 1:
 *     <p>输入: "Let's take LeetCode contest" 输出: "s'teL ekat edoCteeL tsetnoc"
 *     注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *     <p>result: 执行用时 : 10 ms, 在Reverse Words in a String III的Java提交中击败了87.40% 的用户 内存消耗 : 47.6 MB,
 *     在Reverse Words in a String III的Java提交中击败了70.62% 的用户
 */
public class ReverseWords3 {
  public String reverseWords(String s) {
    if (s.trim().length() == 0) {
      return "";
    }
    char[] chars = s.toCharArray();
    int start = 0;
    int end = 0;
    for (int i = 0; i < chars.length; i++) {

      if (chars[i] == ' ') {
        reverseWord(chars, start, end - 1);
        start = i + 1;
        end = start;
      } else {
        end++;
      }
      // 处理只有一个单词的清空
      if (chars.length - 1 == i) {
        reverseWord(chars, start, end - 1);
      }
    }
    return new String(chars);
  }

  public void reverseWord(char[] result, int start, int end) {
    int sign = ((end - start + 1) & 1) + 1;
    while ((start + sign) <= end) {
      char temp = result[start];
      result[start++] = result[end];
      result[end--] = temp;
    }
  }
}
