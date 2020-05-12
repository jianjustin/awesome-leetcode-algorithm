package org.awesome.leetcode.algorithm.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BackPackTest {
	
	public BackPack b;
	
	@Before
	public void Initial() {
		b = new BackPack();
	}

	@Test
	public void testZeroOnePack() {
		int N = 4, M = 6;
		int[] C = {1,2,3,2};
		int[] W = {4,6,12,7};
		
		int ans = b.zeroOnePack(C, W, N, M);
		Assert.assertEquals("计算错误", 23, ans);
	}
	
	@Test
	public void fullBackPackTest() {
		int N = 4, M = 6;
		int[] C = {1,2,3,2};
		int[] W = {4,6,12,7};
		
		int ans = b.fullBackPack(C, W, N, M);
		System.out.println("ans = " + ans);
		Assert.assertEquals("计算错误", 24, ans);
	}
	
	@Test
	public void multipleBackPackTest() {
		int N = 2, V = 8;
		int[] c = {2,4};
		int[] w = {100,100};
		int[] n = {4,2};
		
		int ans = b.multipleBackPack(c, w, n, N, V);
		System.out.println("ans = " + ans);
		Assert.assertEquals("计算错误", 24, ans);
	}
}
