package org.awesome.leetcode.algorithm.dp;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.awesome.leetcode.algorithm.dp.TargetSumMainClass.stringToIntegerArray;
import static org.junit.Assert.*;

public class TargetSumTest {
    /**
     * 给定测试用例
     */
    @Test
    public void findTargetSumWays() {
        int S =3;
        int[] nums = new int[]{1,1,1,1,1};
        int ret = new TargetSum().findTargetSumWays(nums, S);
        System.out.println(ret);
    }



    /**
     * 命令行自定义测试用例测试
     * 输入格式:
     * 第一行数组
     * 第二行和
     * @param args
     * ---------
     * [1,1]
     * 2
     * ---------
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int S = Integer.parseInt(line);

            int ret = new TargetSum().findTargetSumWays(nums, S);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }


}

class TargetSumMainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
}