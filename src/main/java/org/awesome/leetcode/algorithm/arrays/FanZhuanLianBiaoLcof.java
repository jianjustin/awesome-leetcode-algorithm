package org.awesome.leetcode.algorithm.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题24. 反转链表
 * @author jian
 *
 */
public class FanZhuanLianBiaoLcof {

	public ListNode reverseList(ListNode head) {
		if(null == head)return null;
		
		List<ListNode> list = new ArrayList<>();
		while(null != head) {
			list.add(head);
			if(null != head.next)
				head = head.next;
			else 
				break;
		}
		
		for(int i = list.size()-1; i>= 0; i--) {
			list.get(i).next = null;
			if(i > 0)list.get(i).next = list.get(i-1);
		}
		
		return head;
    }
	
	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);
		
		(new FanZhuanLianBiaoLcof()).reverseList(root);
	}
	
}
