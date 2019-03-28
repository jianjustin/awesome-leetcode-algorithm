package org.awesome.leetcode.algorithm.array;

import java.util.List;

/**
 * @author eatMelon-Masses
 * @date 2019-03-28
 * 题目：
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 * result
 * 执行用时 : 4 ms, 在Pascal's Triangle II的Java提交中击败了11.77% 的用户
 * 内存消耗 : 32.6 MB, 在Pascal's Triangle II的Java提交中击败了0.37% 的用户
 * 思路：生成杨辉三角列表借鉴 杨辉三角118题，只是取了索引为rowIndex的那行结果
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> resultList =pascalTriangle.generate(rowIndex+1);
        return resultList.get(rowIndex);
    }

}
