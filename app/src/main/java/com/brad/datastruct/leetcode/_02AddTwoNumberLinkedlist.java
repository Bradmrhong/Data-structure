package com.brad.datastruct.leetcode;

import com.brad.datastruct.LinkedList.ListNode;

/**
 * Description: 有序环数组的查找
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-03 17:36
 */
public class _02AddTwoNumberLinkedlist {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        if (l1 == null && l2 == null) {
            return result.next;
        }
        int flag = 0;
        ListNode pre = result;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                pre.next = new ListNode((l1.val + l2.val + flag) % 10);
                flag = (l1.val + l2.val + flag) > 9 ? 1 : 0;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null && l2 == null) {
                pre.next = new ListNode((l1.val + flag) % 10);
                flag = (l1.val + flag) > 9 ? 1 : 0;
                l1 = l1.next;
            } else {
                pre.next = new ListNode((l2.val + flag) % 10);
                flag = (l2.val + flag) > 9 ? 1 : 0;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if (flag != 0) {
            pre.next = new ListNode(flag);
        }
        return result.next;
    }

}
