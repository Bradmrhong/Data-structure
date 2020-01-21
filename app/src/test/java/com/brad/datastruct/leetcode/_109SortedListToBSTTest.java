package com.brad.datastruct.leetcode;

import com.brad.datastruct.LinkedList.ListNode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-16 18:07
 */
public class _109SortedListToBSTTest {

    @Test
    public void sortedListToBST() {
        ListNode pre = new ListNode(1);
        ListNode l = pre;
        l.next = new ListNode(-10);
        l = l.next;
        l.next = new ListNode(-3);
        l = l.next;
        l.next = new ListNode(0);
        l = l.next;
        l.next = new ListNode(5);
        l = l.next;
        l.next = new ListNode(9);

        new _109SortedListToBST().sortedListToBST(pre.next);

    }
}