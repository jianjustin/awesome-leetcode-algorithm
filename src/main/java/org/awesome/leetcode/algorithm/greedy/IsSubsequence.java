package org.awesome.leetcode.algorithm.greedy;

/**
 * @author eatMelon-Masses
 * @date 2019年4月11日
 * No.392判断子序列
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * <p>
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 * <p>
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * <p>
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 * <p>
 * 返回 true.
 * result:
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        char[] src = s.toCharArray();
        char[] target = t.toCharArray();
        int p = 0;
        int q = 0;
        while (p < s.length() && q < t.length()) {
            if (src[p] == target[q]) {
                p++;
            }
            q++;
        }
        return p == s.length();
    }
}
