package com.brad.datastruct.leetcode;

import com.brad.datastruct.LinkedList.ListNode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-15 17:29
 */
public class _02AddTwoNumberLinkedlistTest {

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(0);
        new _02AddTwoNumberLinkedlist().addTwoNumbers(l1, l2);
    }
}