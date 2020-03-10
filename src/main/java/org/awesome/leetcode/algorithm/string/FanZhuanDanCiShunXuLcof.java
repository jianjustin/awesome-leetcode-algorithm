package org.awesome.leetcode.algorithm.string;

public class FanZhuanDanCiShunXuLcof {
	
	public String reverseWords(String s) {
		if(null == s || s.length() == 0)return s;
		
		String[] strings = s.trim().split(" ");
		String s1 = "";
		
		for(int i=strings.length-1; i>=0; i--) {
			if("".equals(strings[i]))continue;
			s1 += strings[i]+" ";
		}
		return s1.trim();
    }

}
