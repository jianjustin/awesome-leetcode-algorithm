package org.awesome.leetcode.algorithm.string;

public class GreatestCommonDivisorOfStrings {
	
	public String gcdOfStrings(String str1, String str2) {
        int a = 0 , b = str2.length(), i = 1;
        while (b > a){
            String str3 = str2.substring(a,b);
            if (str1.length()%str3.length()!=0){
                b = str2.length() / ++i;
                continue;
            }
            if (0 == str1.replaceAll(str3,"").length() &&  str2.replaceAll(str3,"").length() == 0)
                return str3;
            else
            	b = str2.length() / ++i;
        }
        return "";
    }
	
	
	
	public static void main(String[] args) {
		GreatestCommonDivisorOfStrings g = new GreatestCommonDivisorOfStrings();
		String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX", str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
		System.out.println(g.gcdOfStrings(str1, str2));
	}

}
