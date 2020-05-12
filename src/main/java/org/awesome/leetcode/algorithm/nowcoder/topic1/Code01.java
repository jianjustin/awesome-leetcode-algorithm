package org.awesome.leetcode.algorithm.nowcoder.topic1;

import java.util.Scanner;

/**
 * 系列01：牛牛的导弹系统
 * @author jian
 *
 */
public class Code01 {
	
	/**
	 * 
	 * @param A 系统连续使用天数
	 * @param B 系统冷却天数
	 * @param M 每天最小发射导弹数
	 * @return
	 */
	public int solve (int A, int B, int M) {
		return M + (A != B ? (B-1)/A*M+M: M+1);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		
		int result = (new Code01()).solve(A, B, M);
		System.out.println(result);
		sc.close();
 	}

}
