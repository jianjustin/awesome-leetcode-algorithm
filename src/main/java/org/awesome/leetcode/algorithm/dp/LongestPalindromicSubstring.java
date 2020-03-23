package org.awesome.leetcode.algorithm.dp;

/**
 * 5. 最长回文子串
 * @author jian
 *
 */
public class LongestPalindromicSubstring {
	
	public String longestPalindrome(String s) {
		if(null == s || s.length() == 0 || s.length() == 1)return s;

        String str = addBoundaries(s, '#');// 得到预处理字符串
        int sLen = 2 * s.length() + 1;
        int[] p = new int[sLen];

        int maxRight = 0, center = 0, maxLen = 1, start = 0;

        for (int i = 0; i < sLen; i++) {
            if (i < maxRight) {
                int mirror = 2 * center - i;//获取镜像位置，减少查找的次数
                p[i] = Math.min(maxRight - i, p[mirror]);
            }

            int left = i - (1 + p[i]), right = i + (1 + p[i]);

            while (left >= 0 && right < sLen && str.charAt(left) == str.charAt(right)) {
                p[i]++;
                left--;
                right++;

            }
         
            if (i + p[i] > maxRight) {
                maxRight = i + p[i];
                center = i;
            }
            if (p[i] > maxLen) {
                maxLen = p[i];
                start = (i - maxLen) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }


    /**
     * 创建预处理字符串
     */
    private String addBoundaries(String s, char divide) {
        int len = s.length();
        if (len == 0) {
            return "";
        }
        if (s.indexOf(divide) != -1) {
            throw new IllegalArgumentException("参数错误，您传递的分割字符，在输入字符串中存在！");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(divide);
            stringBuilder.append(s.charAt(i));
        }
        stringBuilder.append(divide);
        return stringBuilder.toString();
    }
    
	
	public static void main(String[] args) {
		String string = "babad";
		System.out.println((new LongestPalindromicSubstring()).longestPalindrome(string));
	}

}
