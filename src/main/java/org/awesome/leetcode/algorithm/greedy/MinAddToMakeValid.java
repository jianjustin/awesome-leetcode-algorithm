package org.awesome.leetcode.algorithm.greedy;


import java.util.Stack;

/**
 * @author eatMelon-Masses
 * @date 2019年4月14日
 * No.921使括号有效的最少添加
 * 给定一个由 '(' 和 ')' 括号组成的字符串 S，我们需要添加最少的括号（ '(' 或是 ')'，可以在任何位置），以使得到的括号字符串有效。
 * <p>
 * 从形式上讲，只有满足下面几点之一，括号字符串才是有效的：
 * <p>
 * 它是一个空字符串，或者
 * 它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
 * 它可以被写作 (A)，其中 A 是有效字符串。
 * 给定一个括号字符串，返回为使结果字符串有效而必须添加的最少括号数。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入："())"
 * 输出：1
 * result:
 * 执行用时 : 6 ms, 在Minimum Add to Make Parentheses Valid的Java提交中击败了90.18% 的用户
 * 内存消耗 : 33.5 MB, 在Minimum Add to Make Parentheses Valid的Java提交中击败了98.92% 的用户
 */
public class MinAddToMakeValid {

    public int minAddToMakeValid(String S) {
        char[] charS = S.toCharArray();
        if (charS.length < 2) {
            return charS.length;
        }
        Stack<Character> stack = new Stack<>();
        for (char e : charS) {
            if (stack.isEmpty()) {
                stack.add(e);
            } else {
                char beforeChar = stack.peek();
                boolean condation1 = beforeChar == '(';
                boolean condation2 = e == ')';
                if (condation1 && condation2) {
                    stack.pop();
                } else {
                    stack.push(e);
                }
            }
        }
        return stack.size();
    }
}
