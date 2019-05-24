package org.awesome.leetcode.algorithm.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @author eatMelon-Masses
 * @date 2019-05-24
 * No.202 快乐数
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * <p>
 * 示例:
 * <p>
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * <p>
 * result：
 * 执行用时 : 5 ms, 在Happy Number的Java提交中击败了66.39% 的用户
 * 内存消耗 : 32.8 MB, 在Happy Number的Java提交中击败了65.04% 的用户
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (n == 0) return false;
        if (n == 1) return true;
        char[] temp = String.valueOf(n).toCharArray();
        int sum = 0;
        while (sum != 1) {
            int tempResult = 0;
            for (char e : temp) {
                tempResult += (e - '0') * (e - '0');
            }
            if (map.containsKey(tempResult)) {
                return false;
            } else {
                map.put(tempResult, tempResult);
            }
            sum = tempResult;
            temp = String.valueOf(tempResult).toCharArray();
        }
        return true;
    }

}
