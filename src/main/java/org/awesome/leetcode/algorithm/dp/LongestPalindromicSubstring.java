package org.awesome.leetcode.algorithm.dp;

/**
 * 5. 最长回文子串
 * @author jian
 *
 */
public class LongestPalindromicSubstring {
	
	public String longestPalindrome(String s) {
        if(null == s || s.length() == 0 || s.length() == 1)return s;
        
        int len = s.length(), start = 0, maxlen = 1;
        boolean[][] dp = new boolean[len][len];
        
        for (int i = 0; i < len; i++) dp[i][i] = true;// init
        
        for (int i = 1; i < len; i++) {//end index
        	for (int j = 0; j < i; j++) {//start index
				if(s.charAt(i) != s.charAt(j)) continue;
				dp[j][i] = i-j<3?true:dp[j+1][i-1];
				if (dp[j][i]) {
                    if (i - j + 1 > maxlen) {
                        maxlen = i - j + 1;
                        start = j;
                    }
                }
			}
		}
        return s.substring(start, start+maxlen);
    }
	
	public static void main(String[] args) {
		String string = "babad";
		System.out.println((new LongestPalindromicSubstring()).longestPalindrome(string));
	}

}
