package org.awesome.leetcode.algorithm.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class MultiplyTest {
    @Spy
    private Multiply multiply;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * 测试用例:11,11
     */
    @Test
    public void multiply() {
        String result = this.multiply.multiply("11", "1");
        Assert.assertEquals("11", result);
    }

    /**
     * 测试用例:99 999
     */
    @Test
    public void multiply1() {
        String result = this.multiply.multiply("99", "999");
        Assert.assertEquals(String.valueOf(99 * 999), result);
    }

    /**
     * 测试用例:0 999
     */
    @Test
    public void multiply3() {
        String result = this.multiply.multiply("0", "999");
        Assert.assertEquals(String.valueOf(0 * 999), result);
    }

    /**
     * 测试用例:123456789 987654321
     */
    @Test
    public void multiply4() {
        String result = this.multiply.multiply("123456789", "987654321");
        Assert.assertEquals(Double.valueOf(123456789.0 * 987654321), Double.valueOf(result));
    }
}
