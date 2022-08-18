package org.awesome.leetcode.algorithm.arrays;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p =head;

        while (p != null){
            if(p.val >= x){
                p2.next = p;
                p2 = p2.next;
            }else{
                p1.next = p;
                p1 = p1.next;
            }

            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }

        p1.next = l2.next;
        return l1.next;
    }
}
