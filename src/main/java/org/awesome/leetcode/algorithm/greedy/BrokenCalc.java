package org.awesome.leetcode.algorithm.greedy;

/**
 * @author eatMelon-Masses
 * @date 2019年4月15日
 *
 *No.991. 坏了的计算器
 * 在显示着数字的坏计算器上，我们可以执行以下两种操作：
 * <p>
 * 双倍（Double）：将显示屏上的数字乘 2；
 * 递减（Decrement）：将显示屏上的数字减 1 。
 * 最初，计算器显示数字 X。
 * <p>
 * 返回显示数字 Y 所需的最小操作数。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：X = 2, Y = 3
 * 输出：2
 * 解释：先进行双倍运算，然后再进行递减运算 {2 -> 4 -> 3}.
 * result:
 */
public class BrokenCalc {

    public int brokenCalc(int X, int Y) {

        return function(X, Y, 0);
    }

    private int function(int x,int y,int k) {
        int count=0;

        if (x >= y) {
            return count+x - y;
        }
        boolean condation = (y&1)==1;
        count++;
        //奇数
        if (condation) {
            count+=function(x, y + 1, count);
        } else {
            count+=function(x, y / 2, count);
        }
        return count;
    }
}
