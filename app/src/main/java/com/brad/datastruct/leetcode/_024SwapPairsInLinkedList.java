package com.brad.datastruct.leetcode;

import com.brad.datastruct.LinkedList.ListNode;

/**
 * Description:
 *
 * @author Brad <mailto:brad.hong@bindo.com>
 * @version 1.0
 * @since 2020-01-15 18:26
 */
public class _024SwapPairsInLinkedList {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;

            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

}
