package org.awesome.leetcode.algorithm.dp;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumLengthofRepeatedSubarrayTest {
    /**
     * 测试用例为固定变量
      * @throws IOException
     */
  @Test
  public void findLength() throws IOException {
      int[] a =new int[]{1,2,3,2,1};
      int[] b =new int[]{3,2,1,4,7};

      int ret = new MaximumLengthofRepeatedSubarray().findLength(a, b);

      String out = String.valueOf(ret);

      System.out.print(out);

  }
    /**
     * 自定义输入测试用例
     * 第一行为数组A
     * 第二行为数组B
     * @param args
     * @throws IOException 输入格式有误
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] A = MaximumLengthofRepeatedSubarrayClass.stringToIntegerArray(line);
            line = in.readLine();
            int[] B = MaximumLengthofRepeatedSubarrayClass.stringToIntegerArray(line);

            int ret = new MaximumLengthofRepeatedSubarray().findLength(A, B);

            String out = String.valueOf(ret);

            System.out.print(out);
        }

    }
}

/**
 * 辅助工具类
 * 用来辅助手动输入测试用例
 */
 class MaximumLengthofRepeatedSubarrayClass {
  public static int[] stringToIntegerArray(String input) {
    input = input.trim();
    input = input.substring(1, input.length() - 1);
    if (input.length() == 0) {
      return new int[0];
    }

    String[] parts = input.split(",");
    int[] output = new int[parts.length];
    for(int index = 0; index < parts.length; index++) {
      String part = parts[index].trim();
      output[index] = Integer.parseInt(part);
    }
    return output;
  }


}