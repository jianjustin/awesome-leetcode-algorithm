package org.awesome.leetcode.algorithm.dp;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class minSubArrayLenTest {
    @Test
    public void minSubArrayLen() {
        int s =5;
        int[] nums =new int[]{2,1,3};
        int ret = new minSubArrayLen().minSubArrayLen(s, nums);
    }
}
class minSubArrayLenMainClass {
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
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int s = Integer.parseInt(line);
            line = in.readLine();
            int[] nums = stringToIntegerArray(line);

            int ret = new minSubArrayLen().minSubArrayLen(s, nums);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}