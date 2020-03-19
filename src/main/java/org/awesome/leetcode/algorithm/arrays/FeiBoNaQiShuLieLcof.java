package org.awesome.leetcode.algorithm.arrays;

import java.util.HashMap;
import java.util.Map;

public class FeiBoNaQiShuLieLcof {
	Map<Integer, Integer> map = new HashMap<>();
	
	public int fib(int n) {
		if(0 == n || 1 == n)return n;
		if(null != map.get(n))return map.get(n);
		int result = (fib(n-2)+fib(n-1))%1000000007;
		map.put(n, result);
		return result%1000000007;
    }

}
