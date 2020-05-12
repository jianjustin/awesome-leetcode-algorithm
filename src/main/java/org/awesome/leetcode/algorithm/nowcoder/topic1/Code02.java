package org.awesome.leetcode.algorithm.nowcoder.topic1;

import java.util.Scanner;

/**
 * 02：牛妹的蛋糕
 * @author jian
 *
 */
public class Code02 {
	
	public int cakeNumber (int n) {
       int count = 1;
       for (int i = n-1; i > 0; i--) 
		count = (count+1)*3/2;
       return count;
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int result = (new Code02()).cakeNumber(n);
		System.out.println(result);
		scanner.close();
	}

}
