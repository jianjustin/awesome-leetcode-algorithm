package org.awesome.leetcode.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;


public class FindTheDuplicateNumberTest {
    private FindTheDuplicateNumber duplicateNumber=spy(FindTheDuplicateNumber.class);

    /**
     * 测试用例3,1,3,4,2
     *期望结果2
     */
    @Test
    public void findDuplicate() {
        int[] nums =new int[]{4,1,2,2,3};
        //mock 环链长度为3
        when(duplicateNumber.circleLength(nums)).thenReturn(3);
        int result = duplicateNumber.findDuplicate(nums);

        Assert.assertTrue(result==2);
    }

    /**
     * 测试用例3,1,3,4,2
     * 期望结果1
     */
    @Test
    public void circleLength() {
        int[] nums =new int[]{4,1,2,2,3};
        int count=duplicateNumber.circleLength(nums);
        Assert.assertTrue(count==1);
    }
}