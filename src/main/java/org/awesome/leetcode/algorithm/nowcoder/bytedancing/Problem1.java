package org.awesome.leetcode.algorithm.nowcoder.bytedancing;

import java.util.*;
/**
 * 字节跳动 2019春招 题目一:万万没想到之聪明的编辑
 * 
 * 1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
 * 2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
 * 3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC
 * 
 * 输入描述:
 * 		第一行包括一个数字N，表示本次用例包括多少个待校验的字符串。
 *		后面跟随N行，每行为一个待校验的字符串。
 * 输出描述:
 * 		N行，每行包括一个被修复后的字符串。
 * 
 * 输入例子1:
 *		2
 *		helloo
 *		wooooooow
 * 输出例子1:
 *		hello
 *		woow
 * 
 * 
 * @author jian
 */
public class Problem1 {
	
	public static String[] solution(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < strs[i].length(); j++) {
				sb.append(strs[i].charAt(j));
                int len = sb.length() - 1;
                if (len >= 2 && sb.charAt(len-2) == sb.charAt(len) && sb.charAt(len-2) == sb.charAt(len-1)) 
                    sb.deleteCharAt(len--);
                if (len >= 3 && sb.charAt(len) == sb.charAt(len-1) && sb.charAt(len-2) == sb.charAt(len-3)) 
                    sb.deleteCharAt(len);
                
			}
			strs[i] = sb.toString();
		}
		
		return strs;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt() ,i=0;
        String[] strs = new String[num];
        while (i < num) {
            String str = scanner.next();
            strs[i++] = str;
        }

		String[] strs1 = Problem1.solution(strs);
		for (String string : strs1) System.out.println(string);
		scanner.close();
	}

}
