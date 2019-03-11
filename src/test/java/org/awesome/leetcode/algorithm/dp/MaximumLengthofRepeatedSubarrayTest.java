package org.awesome.leetcode.algorithm.dp;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class MaximumLengthofRepeatedSubarrayTest {

  @Test
  public void findLength() throws IOException {
      int[] a =new int[]{1,2,3,2,1};
      int[] b =new int[]{3,2,1,4,7};

      int ret = new MaximumLengthofRepeatedSubarray().findLength(a, b);

      String out = String.valueOf(ret);

      System.out.print(out);

  }

}

/**
 * 辅助工具类
 * 用来辅助手动输入测试用例
 */
 class MainClass {
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

  public static void main(String[] args) throws IOException {
/*    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = in.readLine()) != null) {
      int[] A = MainClass.stringToIntegerArray(line);
      line = in.readLine();
      int[] B = MainClass.stringToIntegerArray(line);

      int ret = new MaximumLengthofRepeatedSubarray().findLength(A, B);

      String out = String.valueOf(ret);

      System.out.print(out);
    }*/
      int[] a =new int[]{1,2,3,2,1};
      int[] b =new int[]{3,2,1,4,7};

      int ret = new MaximumLengthofRepeatedSubarray().findLength(a, b);

      String out = String.valueOf(ret);

      System.out.print(out);
  }
}