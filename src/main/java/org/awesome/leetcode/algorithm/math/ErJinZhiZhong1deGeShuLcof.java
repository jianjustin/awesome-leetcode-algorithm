package org.awesome.leetcode.algorithm.math;

public class ErJinZhiZhong1deGeShuLcof {
	
	public int hammingWeight(int n) {
		int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
	
	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		System.out.println((new ErJinZhiZhong1deGeShuLcof()).hammingWeight(n));
	}

}
