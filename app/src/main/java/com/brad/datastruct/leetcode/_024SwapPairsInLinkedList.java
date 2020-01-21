package com.brad.datastruct.leetcode;

import com.brad.datastruct.LinkedList.ListNode;

/**
 * Description: 两两交换单链表中的节点
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * @author Brad <mailto:bradmrhong@gmail.com>
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
            ListNode start = temp.next;     // 指向需要交换的前节点
            ListNode end = temp.next.next;  // 指向需要交换的后节点
            // 这步不能少，temp.next指向end，temp.next还是等于start，最后两个节点交换之后就会缺少end元素
            temp.next = end;

            start.next = end.next;      // 前后节点交换
            end.next = start;
            temp = start;               // 重制temp节点，用于下一次循环
        }
        return pre.next;
    }

    private void printListNode(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        System.out.println(sb.toString());
    }

}
