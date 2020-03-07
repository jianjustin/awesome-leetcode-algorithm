package org.awesome.leetcode.algorithm.arrays;

/**
 * @author eatMelon-Masses
 * @date 2019年4月28日
 * No.739. 每日温度
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。如果之后都不会升高，请输入 0 来代替。
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的都是 [30, 100] 范围内的整数。
 * result:
 * 执行用时 : 569 ms, 在Daily Temperatures的Java提交中击败了8.55% 的用户
 * 内存消耗 : 52.7 MB, 在Daily Temperatures的Java提交中击败了53.40% 的用户
 */
public class DailyTemperatures {
    private int[] temperatures;


    public int[] dailyTemperatures(int[] T) {
        this.temperatures = T;
        if (T.length == 1) {
            return new int[]{0};
        }
        int[] diffArray = differenceArray();
        int[] result = new int[T.length];
        for (int i = 0; i < diffArray.length; i++) {
            int count = 1;
            int sum = 0;
            for (int j = i; j < diffArray.length; j++) {
                sum += diffArray[j];
                if (sum > 0) {
                    result[i] = count;
                    break;
                }
                count++;
            }
        }
        return result;
    }

    public int[] differenceArray() {
        int[] result = new int[temperatures.length - 1];
        for (int i = 1; i < temperatures.length; i++) {
            result[i - 1] = temperatures[i] - temperatures[i - 1];
        }
        return result;
    }

    public void setTemperatures(int[] temperatures) {
        this.temperatures = temperatures;
    }
}
