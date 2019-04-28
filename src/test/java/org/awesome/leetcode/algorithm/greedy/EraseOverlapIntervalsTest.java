package org.awesome.leetcode.algorithm.greedy;

import org.junit.Assert;
import org.junit.Test;

public class EraseOverlapIntervalsTest {
    EraseOverlapIntervals test;

    /**
     * * 输入: [ [1,2], [2,3], [3,4], [1,3] ]
     * * <p>
     * * 输出: 1
     */
    @Test
    public void eraseOverlapIntervals() {
        Interval[] intervals = new Interval[4];
        intervals[0] = new Interval(1, 2);
        intervals[1] = new Interval(2, 2);
        intervals[2] = new Interval(3, 4);
        intervals[3] = new Interval(1, 3);
        test = new EraseOverlapIntervals(intervals);
        Assert.assertEquals(1, test.eraseOverlapIntervals(intervals));
    }

    /**
     * 输入: [ [1,2], [1,2], [1,2] ]
     * <p>
     * 输出: 3
     */
    @Test
    public void eraseOverlapIntervals2() {
        Interval[] intervals = new Interval[4];
        intervals[0] = new Interval(1, 2);
        intervals[1] = new Interval(1, 2);
        intervals[2] = new Interval(1, 2);
        intervals[3] = new Interval(1, 2);
        test = new EraseOverlapIntervals(intervals);
        Assert.assertEquals(3, test.eraseOverlapIntervals(intervals));
    }

    /**
     * 输入: [ [1,2], [1,2], [1,2] ]
     * <p>
     * 输出: 3
     */
    @Test
    public void eraseOverlapIntervals3() {
        Interval[] intervals = new Interval[4];
        intervals[0] = new Interval(1, 2);
        intervals[1] = new Interval(1, 2);
        intervals[2] = new Interval(1, 2);
        intervals[3] = new Interval(1, 2);
        test = new EraseOverlapIntervals(intervals);
        Assert.assertEquals(3, test.eraseOverlapIntervals(intervals));
    }

    /**
     * 输入: [ [1,2], [2,3] ]
     * <p>
     * 输出: 0
     */
    @Test
    public void sort() {
        Interval[] intervals = new Interval[2];
        intervals[0] = new Interval(1, 2);
        intervals[1] = new Interval(2, 3);
        test = new EraseOverlapIntervals(intervals);
        Assert.assertEquals(0, test.eraseOverlapIntervals(intervals));

    }

    /**
     * 输入: [ [1,2], [2,3] ]
     * <p>
     * 输出: 0
     */
    @Test
    public void eraseOverlapIntervals1() {
        int[][] temp = new int[][]{{1, 2}, {2, 3}};
        test = new EraseOverlapIntervals();
        Assert.assertEquals(0, test.eraseOverlapIntervals(temp));
    }
}