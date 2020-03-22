package org.awesome.leetcode.algorithm.arrays;

public class ShanChuLianBiaoDeJieDianLcof {
	
	public ListNode deleteNode(ListNode head, int val) {
		if(null == head)return head;
		if(head.val == val)return deleteNode(head.next, val);
		ListNode item = head;
		
		while(null != item && null != item.next) {
			if(item.next.val == val) 
				item.next = item.next.next;
			item = item.next;
		}
		return head;
    }
	
	public static void main(String[] args) {
		ListNode root = new ListNode(-3);
		root.next = new ListNode(5);
		root.next.next = new ListNode(-99);
		
		root = (new ShanChuLianBiaoDeJieDianLcof()).deleteNode(root, -99);
		while(null != root) {
			System.out.print(root.val+",");
			root = root.next;
		}
	}

}
