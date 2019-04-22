package org.awesome.leetcode.algorithm.greedy;

import org.junit.Assert;
import org.junit.Test;

public class BrokenCalcTest {
    private BrokenCalc brokenCalc = new BrokenCalc();

    /**
     * 测试用例 x=2 y=3
     * 期望结果2
     */
    @Test
    public void brokenCalc1() {
        assertResult(2, 3, 2);


    }

    @Test
    public void brokenCalc2() {
        assertResult(5, 8, 2);
    }

    @Test
    public void brokenCalc3() {
        assertResult(3, 10, 3);

    }

    @Test
    public void brokenCalc4() {
        assertResult(1024, 1, 1023);


    }

    @Test
    public void brokenCalc5() {
        assertResult(1,1000000000,39);
    }

    /**
     * 输入参数
     * 断言结果
     *
     * @param x        参数
     * @param y        参数
     * @param expected 期望值
     */
    private void assertResult(int x, int y, int expected) {
        Assert.assertEquals(expected, brokenCalc.brokenCalc(x, y));
    }
}