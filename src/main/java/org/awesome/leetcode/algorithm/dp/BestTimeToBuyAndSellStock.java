package org.awesome.leetcode.algorithm.dp;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author jian
 * @date 2019-03-28
 * 
 * 121. 买卖股票的最佳时机
 * 参考链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 * 示例 1:
 *   输入: [7,1,5,3,6,4]
 *   输出: 5
 *   解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 */
public class BestTimeToBuyAndSellStock {
	
	public int maxProfit(int[] prices) {
		int resultMoney = 0;
		if(null == prices || prices.length == 0)return resultMoney;
        int[] dp = new int[prices.length], dp1 = new int[prices.length];
        
        dp[0] = prices[0];
        dp1[0] = prices[prices.length-1];
        for (int i = 1; i < prices.length; i++) {
        	dp[i] = Math.min(dp[i-1], prices[i]);//获取最小买入值
        	dp1[i] = Math.max(dp1[i-1], prices[prices.length-i-1]);//获取最大卖出值
        }
        	
        
        for (int i = 1; i < prices.length; i++) {
        	int item = dp1[i-1]-dp[prices.length-i-1];
        	if(item>resultMoney)resultMoney = item;
        }
        return resultMoney;
    }
	
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println((new BestTimeToBuyAndSellStock()).maxProfit(prices));
	}
    
}
