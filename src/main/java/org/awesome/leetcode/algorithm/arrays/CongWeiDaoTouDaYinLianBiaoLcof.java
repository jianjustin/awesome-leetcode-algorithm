package org.awesome.leetcode.algorithm.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题06. 从尾到头打印链表
 * @author jian
 *
 */
public class CongWeiDaoTouDaYinLianBiaoLcof {
	public int[] reversePrint(ListNode head) {
		List<Integer> list = new ArrayList<>();
		if(null == head)return new int[0];
		
		while (null != head) {
			list.add(head.val);
			head = head.next;
		}
		
		
		int[] result = new int[list.size()];
		int size = list.size();
		for(int i = 0; i < size; i++)
			result[i] = list.get(size-i-1);
		
		return result;
    }
}
