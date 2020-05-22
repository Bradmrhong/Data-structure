package com.brad.datastruct.leetcode.tree;

import com.brad.datastruct.LinkedList.ListNode;
import com.brad.datastruct.tree.TreeNode;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-16 18:02
 */
public class _109SortedListToBST {

    /**
     * 思路：递归。
     * 由于二叉搜索树左子树所有节点的值小于右字树，因此查找到链表中间的节点，就是根节点。
     * 递归进行左右子树的查找
     * @param head
     * @return
     */
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        TreeNode res = null;
        ListNode mid = findMiddle(head);
        res = new TreeNode(mid.val);
        // 递归结束条件
        if (head == mid) {
            return res;
        }
        res.left = sortedListToBST(head);
        res.right = sortedListToBST(mid.next);
        return res;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // 从中间节点的左边断开
        if (prev != null) {
            prev.next = null;
        }
        return slow;
    }

}
