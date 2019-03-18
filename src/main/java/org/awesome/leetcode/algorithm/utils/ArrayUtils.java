package org.awesome.leetcode.algorithm.utils;

/**
 * @author yiezi
 * @date 2019-3-11
 * 数组工具类
 * 关于数组的工具类
 * 方便debug
 */
public class ArrayUtils {
    /**
     * 矩阵打印二维数组
     * @param array
     */
    public static void printArray(int[][] array){
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array[0].length - 1; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
