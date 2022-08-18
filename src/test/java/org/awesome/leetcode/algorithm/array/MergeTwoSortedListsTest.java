package org.awesome.leetcode.algorithm.array;

import org.awesome.leetcode.algorithm.arrays.ListNode;
import org.awesome.leetcode.algorithm.arrays.MergeTwoSortedLists;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists_test(){
        ListNode l1 = new ListNode(-9);
        l1.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(7);

        MergeTwoSortedLists service = new MergeTwoSortedLists();
        ListNode result = service.mergeTwoLists(l1, l2);

        Assert.assertEquals(result.val, -9);
        Assert.assertEquals(result.next.val, 3);
        Assert.assertEquals(result.next.next.val, 5);
        Assert.assertEquals(result.next.next.next.val, 7);
    }
}
