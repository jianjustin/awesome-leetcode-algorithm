package org.awesome.leetcode.algorithm.arrays;

import java.util.ArrayList;
import java.util.List;

public class HeBingLiangGePaiXuDeLianBiaoLcof {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(null == l1)return l2;
		if(null == l2)return l1;
		
		List<ListNode> list = new ArrayList<>();
		
		while(null != l1 || l2 != null) {
			if(null == l2 || (null != l1 && l1.val<=l2.val)) {
				list.add(l1);
				l1 = l1.next;
				continue;
			}
			if(null == l1 || (null != l2 && l1.val>=l2.val)) {
				list.add(l2);
				l2 = l2.next;
				continue;
			}
		}
		
		for (int i = 0; i < list.size()-1; i++) 
			list.get(i).next = list.get(i+1);
		
		
		return list.get(0);
    }
	
	public static void main(String[] args) {
		ListNode root = new ListNode(2);
		//root.next = new ListNode(2);
		//root.next.next = new ListNode(4);
		
		ListNode root1 = new ListNode(1);
		//root1.next = new ListNode(3);
		//root1.next.next = new ListNode(4);
		
		ListNode result = (new HeBingLiangGePaiXuDeLianBiaoLcof()).mergeTwoLists(root, root1);
		
		while (null != result) {
			System.out.print(result.val+"   ");
			result = result.next;
			
		}
	}

}
