package org.awesome.leetcode.algorithm.arrays;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);//empty node

        ListNode left = list1, right = list2, key = result;
        while (true){
            if(left == null){
                key.next = right;
                break;
            }

            if(right == null){
                key.next = left;
                break;
            }

            if(left.val > right.val){
                key.next = new ListNode(right.val);
                right = right.next;
            }else{
                key.next = new ListNode(left.val);
                left = left.next;
            }

            key = key.next;

        }
        return result.next;
    }

}
