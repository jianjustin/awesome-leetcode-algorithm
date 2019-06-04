package org.awesome.leetcode.algorithm.string;

/**
 * @author eatMelon-Masses
 * @date 2019-06-03
 *
 * 541. 反转字符串2 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k
 *     个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。 示例: 输入: s = "abcdefg", k = 2
 *     输出: "bacdfeg" 要求: 该字符串只包含小写的英文字母。 给定字符串的长度和 k 在[1, 10000]范围内。
 *
 *     result： 成功 显示详情 执行用时 : 2 ms,
 *     在Reverse String II的Java提交中击败了95.10% 的用户 内存消耗 : 39.7 MB, 在Reverse String II的Java提交中击败了73.21%
 *     的用户
 */
public class ReverseStr2 {
  public String reverseStr(String s, int k) {
    final int distanceSum =2*k;
    if (s.trim().length()==0){
      return "";
    }
    char[] temp =s.toCharArray();
    int count = temp.length / distanceSum;
    int start = 0;
    for (int i = 0; i <count ; i++) {
      start =(i * distanceSum);
      reverseWord(temp,start,distanceSum/2);
    }
    int remainderSum = temp.length % distanceSum;
    if (remainderSum < k) {
      reverseWord(temp, (count) * distanceSum, remainderSum);
    } else if(remainderSum>=k) {
      reverseWord(temp, (count) * distanceSum, k);
    }
    return String.valueOf(temp);
  }

  public void reverseWord(char[] result, int start, int length) {
    int end = start + length - 1;
    int sign = (length & 1) + 1;
    while ((start + sign) <= end) {
      char temp = result[start];
      result[start++] = result[end];
      result[end--] = temp;
    }
  }
}
