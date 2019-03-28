package org.awesome.leetcode.algorithm.dp;

import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {
	
	@Test
	public void maxProfit() {
		BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
		int[] prices = {7,1,5,3,6,4};
		System.out.println(b.maxProfit(prices));
	}

}
