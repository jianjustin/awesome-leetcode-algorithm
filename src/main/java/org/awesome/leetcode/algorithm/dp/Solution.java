package org.awesome.leetcode.algorithm.dp;

import java.util.*;

public class Solution {
    public void solution(String str){
        if (str.length()<=1){
            System.out.println("length is "+str.length());
            System.out.println("子串:"+str);
        }
        int length = str.length();
        char[] temp = str.toCharArray();
        int dp[][] = new int[temp.length][temp.length];
        init(temp, dp);
        int max = 0;
        Map<Integer, List<String>> resultMap = new HashMap<Integer, List<String>>();
        for (int i = 2; i <= length - 1; i++) {
            for (int j = 0; j + i <= length - 1; j++) {
                //如何子串无重复字母,两边相等
                if (dp[j][j+i-1]==0&& isDiff(j+1,j+i-1,temp[j+i],temp)&&temp[j] == temp[j + i]){
                    //存储相同长度的子串
                    if (i == max) {
                        putResult(max, Arrays.copyOfRange(temp, j, j + i + 1), resultMap);
                    }
                    if (i > max) {
                        resultMap.remove(max);
                        max = i;
                        putResult(max, Arrays.copyOfRange(temp, j, j + i + 1), resultMap);
                    }
                    dp[j][j + i] = 1;
                //如果子串无重复字母,两边不等
                }else if(dp[j][j+i-1]==0&&isDiff(j+1,j+i-1,temp[j+i],temp)&&temp[j] != temp[j + i]){
                    dp[j][j + i] = 0;
                //如果子串有重复字母
                }else {
                    dp[j][j + i] = 1;
                }


            }
        }
        System.out.println("the mast length is"+max+1);
        List<String> result = resultMap.get(max);
        for (String str1:result) {
            System.out.println(str1);
        }
    }

    public static boolean isDiff(int start, int end, char e, char[] tempArray) {
        for (;start<=end;start++) {
            if (tempArray[start] == e) {
                return false;
            }
        }
        return true;
    }
    public static void putResult(int max, char [] subArray, Map<Integer,List<String>> map) {
        List<String> result;
        if (map.containsKey(max)) {
             result = map.get(max);
        } else {
             result = new ArrayList<String>();
        }
        result.add(String.copyValueOf(subArray));
        map.put(max, result);
    }
    //初始化长度为2的子串dp
    public static int[][] init(char[] temp,int[][] dp){
        for (int i = 0; i <= temp.length - 2; i++) {
            dp[i][i+1]=(temp[i] == temp[i + 1]?1:0);
        }
        return dp;
    }

}
