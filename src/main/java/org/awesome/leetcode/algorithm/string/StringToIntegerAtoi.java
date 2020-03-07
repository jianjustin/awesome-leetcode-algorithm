package org.awesome.leetcode.algorithm.string;

public class StringToIntegerAtoi {
	
	public int myAtoi(String str) {
		int result = 0, s = 1, i = 0;
		if(null == str || str.length()==0)return 0;
		if(str.trim().length()==0)return 0;
		str = str.trim();//去除首尾空格
		
		if('-'==str.charAt(0)||str.charAt(0)=='+') {
			s = '-'==str.charAt(0)?-1:1;//获取正负值
			str = str.substring(1);
		}
		
		while(i<str.length() && str.charAt(i)>=48 && str.charAt(i)<=57) 
			if(str.charAt(i)==48 && i == 0)
				str = str.substring(1);
			else
				i++;
		if(0 == i)return 0;
		str = str.substring(0, i);
		if(str.length()>=10) {
			if(s>0 && (str.compareTo(Integer.toString(Integer.MAX_VALUE))>=0 || str.length()>10))return Integer.MAX_VALUE;
			if(s<0 && (str.compareTo(Integer.toString(Integer.MIN_VALUE).substring(1))>=0||str.length()>10))return Integer.MIN_VALUE;
		}
		result = s*Integer.valueOf(str);
		return result;
    }
	
	public static void main(String[] args) {
		String str = "-2147483648";
		int result = (new StringToIntegerAtoi()).myAtoi(str);
		System.out.println(result);
	}
}
