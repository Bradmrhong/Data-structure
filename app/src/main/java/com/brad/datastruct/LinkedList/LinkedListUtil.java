package com.brad.datastruct.LinkedList;


import java.util.Arrays;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-22 14:29
 */
public class LinkedListUtil {

    /**
     * 检查一个链表是否有环, 快慢指针，弱快指针追上了慢指针，则说明有环
     * @return
     */
    public static boolean checkCircle(LinkedList l) {
        // 链表空或者链表只有一个元素
        if (l.first == null) {
            return false;
        }
        LinkedList.Node slow = l.first;
        LinkedList.Node fast = l.first.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 两个有序链表合并
     * 思路：
     * 1-比较两个节点的头结点哪个小，取小的当做新的头结点，并将所选中当头结点的后移
     * 2-循环遍历两个链表，取小的一方插入
     * 3-循环结束，取还未到尾结点的链表链到最后
     * **技巧--使用哨兵节点简化第一步
     * 1-哨兵节点为头结点的前一个节点，因此无需找出头结点，直接比较两个链表的节点就可以了
     */
    public static LinkedList<Integer> mergeOrderedList(LinkedList<Integer> listA, LinkedList<Integer> listB) {

        LinkedList<Integer> newList = new LinkedList<>();
        LinkedList.Node<Integer> soldier = new LinkedList.Node<>(null, null, null);
        LinkedList.Node<Integer> p = soldier;

        LinkedList.Node<Integer> nodeA = listA.first;
        LinkedList.Node<Integer> nodeB = listB.first;

        while (nodeA != null && nodeB != null) {
            if (nodeA.item < nodeB.item) {
                p.next = nodeA;
                nodeA = nodeA.next;
            } else {
                p.next = nodeB;
                nodeB = nodeB.next;
            }
            p = p.next;
        }

        if (nodeA != null) {
            p.next = nodeA;
        }
        if (nodeB != null) {
            p.next = nodeB;
        }

        newList.first = soldier.next;
        return newList;
    }

    /**
     * 删除单链表的倒数第K个节点
     * 思路：
     * 1-快指针遍历链表K次到达一个节点
     * 2-如果快指针为空，返回；如果快指针不为空，建立慢指针
     * 3-启动快慢指针遍历，当快指针为空时，慢指针指向的就是倒数第K个节点
     * 4-执行链表删除
     * @param head
     * @param k
     * @return
     */
    public static LinkedList.Node<Integer> removeLastK(LinkedList.Node<Integer> head, int k) {
        if (head == null || k < 0) {
            return head;
        }
        LinkedList.Node<Integer> fast = head;
        LinkedList.Node<Integer> slow = head;
        for (int i = 0; i < k && fast != null; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head;
        }
        LinkedList.Node<Integer> prev = null;
        while (fast != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        // 4 执行删除
        prev.next = slow.next;
        return head;
    }

    /**
     * 删除单链表中间的节点
     * 思路：
     * 1-设置快慢指针，快指针每次走两步，慢指针每次走一步，当快指针周到尾部时，慢指针所指即中间节点(无论size是奇数还是偶数)
     * @param head
     * @return
     */
    public static LinkedList.Node<Integer> removeMiddle(LinkedList.Node<Integer> head) {
        if (head == null) {
            return null;
        }
        LinkedList.Node<Integer> fast = head;
        LinkedList.Node<Integer> slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    /**
     * 单链表翻转
     * 1 -> 2 -> 3 -> 4 -> 5
     * 1 <- 2 <- 3 <- 4 <- 5
     * @param head
     * @return
     */
    public static LinkedList.Node<String> reverse(LinkedList.Node<String> head) {
        LinkedList.Node<String> prev = null;
        LinkedList.Node<String> current = head;
        LinkedList.Node<String> next;
        while (current != null) {
            next = current.next;    // 保存next节点，因为next节点在下一步要被赋值给前一位
            current.next = prev;

            prev = current; // 保存下次循环的prev
            current = next; // 当前节点后移
        }
        return prev;
    }

    public static LinkedList.Node<String> swapPairs(LinkedList.Node<String> head) {
        if (head == null) {
            return head;
        }
        LinkedList.Node<String> pre = new LinkedList.Node<>("", null, head);
        LinkedList.Node<String> temp = pre;
        while (temp.next != null && temp.next.next != null) {
            LinkedList.Node<String> start = temp.next;
            LinkedList.Node<String> end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;

    }

    /**
     * 打印链表
     */
    public static void print(LinkedList<Integer> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }


}
