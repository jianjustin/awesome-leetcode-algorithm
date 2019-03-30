package org.awesome.leetcode.algorithm.dp;

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
        
        for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				int money = prices[j] - prices[i];
				if(resultMoney < money)resultMoney = money;
			}
		}
        
        return resultMoney;
    }
    public int maxProfit2(int[] prices) {
        int buymin=Integer.MAX_VALUE;
        int sum=0;
        if(prices.length<2) 
            return 0;
        else
            buymin=prices[0];
        for(int i=1;i<=prices.length-1;i++){           
            sum=(prices[i]-buymin)>sum?(prices[i]-buymin):sum;
            if(prices[i]<buymin) buymin=prices[i]; 
        }
        
        return sum;
    }
}
