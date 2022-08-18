package org.awesome.leetcode.algorithm.arrays;

import java.util.ArrayList;
import java.util.List;

public class LianBiaoZhongDaoShuDiKgeJieDianLcof {

	public ListNode getKthFromEnd(ListNode head, int k) {
		List<ListNode> nodes = new ArrayList<>();
		
		while (null != head) {
			nodes.add(head);
			head = head.next;
		}
		
		if(nodes.size() < k)return null;
		return nodes.get(nodes.size()-k);
    }
	
}

