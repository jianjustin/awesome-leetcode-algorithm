package org.awesome.leetcode.algorithm.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GasStationTest {
    @Spy
    private GasStation gasStation;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    /**
     *         int[] gas = {1, 2, 3, 4, 5};
     *         int[] cost = {3, 4, 5, 1, 2};
     *         期望:结果为第三个位置
     */
    @Test
    public void canCompleteCircuit1() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        Assert.assertEquals("canCompleteCircuit test is failure", 3, gasStation.canCompleteCircuit(gas, cost));
    }
    /**
     *         int[] gas = {3,3,4};
     *         int[] cost = {3,4,4};
     *         期望:结果为-1
     */
    @Test
    public void canCompleteCircuit2() {
        int[] gas = {3,3,4};
        int[] cost = {3,4,4};
        Assert.assertEquals("canCompleteCircuit test is failure", -1, gasStation.canCompleteCircuit(gas, cost));
    }
    /**
     *
     *            int[] gas = {1, 2, 3, 4, 5};
     *            int[] cost = {3, 4, 5, 1, 2};
     * 期望运行结果:-2, -2, -2, 3, 3
     */
    @Test
    public void remainingGas() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int[] expected = {-2, -2, -2, 3, 3};
        int[] actual = gasStation.remainingGas(gas, cost);
        Assert.assertEquals("remainingGas test is failure", Arrays.toString(expected), Arrays.toString(actual));
    }
    /**
     *
     *            int[] gas = {3,3,4};
     *            int[] cost = {3,4,4};
     * 期望运行结果:0,-1,0
     */
    @Test
    public void remainingGas2() {
        int[] gas = {3,3,4};
        int[] cost = {3,4,4};
        int[] expected = {0,-1,0};
        int[] actual = gasStation.remainingGas(gas, cost);
        Assert.assertEquals("remainingGas test is failure", Arrays.toString(expected), Arrays.toString(actual));
    }
    /**
     *         int[] gas = {1, 2, 3, 4, 5};
     *         int[] cost = {3, 4, 5, 1, 2};
     *         期望:从第三个位置上开始出发结果正确
     */
    @Test
    public void canRun1() {
        int[] remains = {-2, -2, -2, 3, 3};
        Assert.assertTrue("canRun test is failure",gasStation.canRun(remains,3));
        Assert.assertFalse("canRun test is failure",gasStation.canRun(remains,1));
        Assert.assertFalse("canRun test is failure",gasStation.canRun(remains,0));
        Assert.assertFalse("canRun test is failure",gasStation.canRun(remains,4));
    }

    /**
     *         int[] gas = {3,3,4};
     *         int[] cost = {3,4,4};
     *         期望:结果为第三个位置
     */
    @Test
    public void canRun3() {
        int[] remains = {0,-1,0};
        Assert.assertFalse("canRun test is failure",gasStation.canRun(remains,0));
        Assert.assertFalse("canRun test is failure",gasStation.canRun(remains,1));
        Assert.assertFalse("canRun test is failure",gasStation.canRun(remains,2));
    }
}