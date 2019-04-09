package org.awesome.leetcode.algorithm.greedy;


/**
 * @author eatMelon-Masses
 * @date 2019年4月9日
 * No.134加油站
 * 在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 *
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 *
 * 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
 *
 * 说明:
 *
 * 如果题目有解，该答案即为唯一答案。
 * 输入数组均为非空数组，且长度相同。
 * 输入数组中的元素均为非负数。
 * 示例 1:
 *
 * 输入:
 * gas  = [1,2,3,4,5]
 * cost = [3,4,5,1,2]
 * result:
 * 执行用时 : 522 ms, 在Gas Station的Java提交中击败了5.08% 的用户
 * 内存消耗 : 37.2 MB, 在Gas Station的Java提交中击败了0.66% 的用户
 *
 */
public class GasStation {
    /**
     *
     * @param gas 每个站可加油量
     * @param cost 到下一站消耗的油量
     * @return 如果能跑完全程返回数组下标,否则返回-1
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] remains = remainingGas(gas, cost);
        int result = -1;
        for (int i = 0; i <remains.length ; i++) {
            if (canRun(remains, i)) {
                result = i;
            }
        }
        return result;
    }

    /**
     * 根据gas数组与cost数组的差值计算出每站剩余油量
     * @param gas 每个站可加油量
     * @param cost 到下一站消耗的油量
     * @return 每站剩余油量
     */
    public int[] remainingGas(int[] gas, int[] cost) {
        int[] remains = new int[gas.length];
        for (int i = 0; i < gas.length; i++) {
            remains[i]=(gas[i] - cost[i]);
        }
        return remains;
    }

    /**
     * 是否能够跑完全程
     * @param remains 每站剩余油量
     * @param startIndex 从下标为几的站台出发
     * @return 是-true 否-false
     */
    public boolean canRun(int[] remains,int startIndex) {
        int currGas = 0;
        for (int i = 1; i <= remains.length; i++) {
            int needCost=remains[startIndex];
                currGas = currGas + needCost;
            if (currGas < 0) {
                return false;
            }
            startIndex=(startIndex+1)%(remains.length);
        }
        return true;
    }
}
