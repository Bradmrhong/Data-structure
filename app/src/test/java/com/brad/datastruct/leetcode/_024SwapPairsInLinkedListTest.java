package com.brad.datastruct.leetcode;

import com.brad.datastruct.LinkedList.ListNode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-16 12:05
 */
public class _024SwapPairsInLinkedListTest {

    @Test
    public void swapPairs() {
        ListNode pre = new ListNode(1);
        ListNode l = pre;
        l.next = new ListNode(1);
        l = l.next;
        l.next = new ListNode(2);
        l = l.next;
        l.next = new ListNode(3);
        l = l.next;
        l.next = new ListNode(4);

        new _024SwapPairsInLinkedList().swapPairs(pre.next);


    }
}