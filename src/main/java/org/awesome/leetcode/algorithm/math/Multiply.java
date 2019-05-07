package org.awesome.leetcode.algorithm.math;

/**
 * @author eatMelon-Masses
 * @date 2019年5月6日
 * No.43. 字符串相乘
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * <p>
 * 示例 1:
 * <p>
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例 2:
 * <p>
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * result:
 * 执行用时 : 14 ms, 在Multiply Strings的Java提交中击败了76.39% 的用户
 * 内存消耗 : 35.1 MB, 在Multiply Strings的Java提交中击败了96.15% 的用户
 */
public class Multiply {
    public String multiply(String num1, String num2) {
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        int[] dp = new int[n1 + n2 + 2];
        for (int i = n1; i >= 0; i--) {
            for (int j = n2; j >= 0; j--) {
                int bitmul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                bitmul += dp[i + j + 1];
                dp[i + j] += bitmul / 10;
                dp[i + j + 1] = bitmul % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int k = 0;
        while (k < dp.length - 1 && dp[k] == 0) {
            k++;
        }
        for (; k < dp.length; k++) {
            sb.append(dp[k]);
        }
        return sb.toString();
    }


}
