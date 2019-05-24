package org.awesome.leetcode.algorithm.math;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {
    private HappyNumber happyNumber = new HappyNumber();

    @Test
    public void happyNumber() {
        Assert.assertFalse(happyNumber.isHappy(4));
        Assert.assertFalse(happyNumber.isHappy(0));
        Assert.assertFalse(happyNumber.isHappy(16));
        Assert.assertFalse(happyNumber.isHappy(37));
        Assert.assertFalse(happyNumber.isHappy(145));
        Assert.assertFalse(happyNumber.isHappy(2));
        Assert.assertFalse(happyNumber.isHappy(3));
        Assert.assertTrue(happyNumber.isHappy(1));


    }

    @Test
    public void happNumber1() {
        Assert.assertTrue(happyNumber.isHappy(7));
        Assert.assertTrue(happyNumber.isHappy(82));
        Assert.assertTrue(happyNumber.isHappy(97));


    }


}
