package org.awesome.leetcode.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eatMelon-Masses
 * @date 2019-3-27
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * result
 *
 *
 *
 * 思路:
 * 设:f(x,i) 为第x个列表里第i个元素的值
 * 设:f(x,i) = f(x-1,i) + f(x-1,i-1);
 *边界条件
 * 1.杨辉三角高度大于2
 * 2.已经构造出一颗符合条件的杨辉三角初始集合
 *       [1],
 *      [1,1],
 *     [1,0,1],
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = init(numRows);
        //边界条件1
        if(numRows<=2){
            return resultList;
        }
        //递推计算出杨慧三角内的值 f(x,i) = f(x-1,i) + f(x-1,i-1);
        for(int i =1;i<=resultList.size()-2;i++){
            List<Integer> currList = resultList.get(i);
            List<Integer> nextList =resultList.get(i+1);
            for(int j =1;j<=currList.size()-1;j++){
                int currNum = calculate(currList,j-1)+calculate(currList,j);
                nextList.set(j,currNum);
            }
        }
        return resultList;
    }
    public int calculate(List<Integer> list,int index){
        return list.get(index);
    }

    /**
     * 构造出一颗基本的杨辉三角集合
     * @param numRows 杨辉三角行数
     * @return 杨辉三角集合
     */
    public List<List<Integer>> init(int numRows){
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        for(int i = 1;i<=numRows;i++){
            List<Integer> tempList =new ArrayList<Integer>();
            tempList.add(1);
            int end =i-1;
            for(int j = 1;j<=end;j++){
                tempList.add(0);
            }
            tempList.set(end,1);
            list.add(tempList);
        }
        return list;
    }
}
