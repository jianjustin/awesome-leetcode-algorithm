package org.awesome.leetcode.algorithm.string;

/**
 * 面试题58 - II. 左旋转字符串
 * @author jian
 */
public class ZuoXuanZhuanZiFuChuanLcof {
	
	public String reverseLeftWords(String s, int n) {
		return s.substring(n)+s.substring(0,n);
    }

}
