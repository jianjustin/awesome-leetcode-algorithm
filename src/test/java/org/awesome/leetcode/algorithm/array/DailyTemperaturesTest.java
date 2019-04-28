package org.awesome.leetcode.algorithm.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DailyTemperaturesTest {
    private DailyTemperatures dailyTemperatures = new DailyTemperatures();

    /**
     * 测试样例:73, 74, 75, 71, 69, 72, 76, 73
     * 期望结果:1, 1, 4, 2, 1, 1, 0, 0
     */
    @Test
    public void dailyTemperatures1() {
        String expected = Arrays.toString(new int[]{1, 1, 4, 2, 1, 1, 0, 0});
        Assert.assertEquals(expected, Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));

    }

    /**
     * 测试样例:32
     * 期望结果:0
     */
    @Test
    public void dailyTemperatures2() {
        String expected = Arrays.toString(new int[]{0});
        Assert.assertEquals(expected, Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{32})));

    }

    /**
     * 测试样例:32 32
     * 期望结果:0 0
     */
    @Test
    public void dailyTemperatures3() {
        String expected = Arrays.toString(new int[]{0, 0});
        Assert.assertEquals(expected, Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{32, 32})));

    }

    /**
     * 测试样例:32 31
     * 期望结果:0 0
     */
    @Test
    public void dailyTemperatures4() {
        String expected = Arrays.toString(new int[]{0, 0});
        Assert.assertEquals(expected, Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{32, 1})));

    }

    @Test
    public void differenceArray1() {
        String expected = Arrays.toString(new int[]{-1, -1});
        dailyTemperatures.setTemperatures(new int[]{3, 2, 1});
        Assert.assertEquals(expected, Arrays.toString(dailyTemperatures.differenceArray()));
    }

}