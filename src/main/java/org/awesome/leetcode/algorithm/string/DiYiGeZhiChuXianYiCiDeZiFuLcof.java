package org.awesome.leetcode.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题50. 第一个只出现一次的字符
 * @author jian
 *
 */
public class DiYiGeZhiChuXianYiCiDeZiFuLcof {
	
	public char firstUniqChar(String s) {
		if(null == s || s.length()==0)return ' ';
		
		int i = 0;
		Map<Character, Integer> map = new HashMap<>();
		while(i<s.length()) {
			if(null != map.get(s.charAt(i))) {
				i++;
				continue;
			}
			int j = i+1;
			while(j<s.length() && s.charAt(i)!=s.charAt(j))j++;
			if(j == s.length())
				return s.charAt(i);
			else {
				map.put(s.charAt(i), 1);
				i++;
			}		
		}
		return ' ';
    }
	
	public static void main(String[] args) {
		System.out.println((new DiYiGeZhiChuXianYiCiDeZiFuLcof()).firstUniqChar("cc"));
	}

}
