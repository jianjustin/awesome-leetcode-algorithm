package org.awesome.leetcode.algorithm.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author eatMelon-Masses
 * @date 2019年4月18日
 * No.435. 无重叠区间
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 * <p>
 * 注意:
 * <p>
 * 可以认为区间的终点总是大于它的起点。
 * 区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
 * 示例 1:
 * <p>
 * 输入: [ [1,2], [2,3], [3,4], [1,3] ]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 移除 [1,3] 后，剩下的区间没有重叠。
 * 示例 2:
 * <p>
 * 输入: [ [1,2], [1,2], [1,2] ]
 * <p>
 * 输出: 2
 * <p>
 * 解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
 * result:
 * 状态	执行用时	内存消耗	语言
 * 通过	11 ms	41.4 MB	java
 */
public class EraseOverlapIntervals {
    private Interval[] intervals;

    public EraseOverlapIntervals(Interval[] intervals) {
        this.intervals = intervals;
    }

    public EraseOverlapIntervals() {
    }

    public int eraseOverlapIntervals(Interval[] intervals) {
        this.intervals = intervals;
        sort();
        return intervals.length - function();

    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 2) {
            return 0;
        }
        Interval[] result = new Interval[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            result[i] = new Interval(intervals[i][0], intervals[i][1]);
        }
        return eraseOverlapIntervals(result);
    }

    public void sort() {
        ;
        Arrays.sort(intervals, new SortHelper());

    }

    public int function() {
        ArrayList<Interval> arrayList = new ArrayList<Interval>();
        arrayList.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            Interval beforeTemp = arrayList.get(arrayList.size() - 1);
            Interval currTemp = intervals[i];
            if (currTemp.start >= beforeTemp.end) {
                arrayList.add(currTemp);
            }
        }
        return arrayList.size();
    }
}

class SortHelper implements Comparator<Interval> {


    @Override
    public int compare(Interval o1, Interval o2) {

        return o1.end - o2.end;
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }


}

