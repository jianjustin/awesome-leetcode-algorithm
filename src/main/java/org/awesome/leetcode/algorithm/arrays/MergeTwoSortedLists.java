package org.awesome.leetcode.algorithm.arrays;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);//empty node

        ListNode left = list1, right = list2;
        while (true){
            if(left == null && right != null){
                result.next = new ListNode(right.val);
                right = right.next;
            }

            if(right == null && left != null){
                result.next = new ListNode(left.val);
                left = left.next;
            }

            if(left == null && right == null){
                break;
            }

            if(left.val > right.val){
                result.next = new ListNode(right.val);
                right = right.next;
            }

            result.next = new ListNode(left.val);
            left = left.next;
        }
        return result.next;
    }

}
