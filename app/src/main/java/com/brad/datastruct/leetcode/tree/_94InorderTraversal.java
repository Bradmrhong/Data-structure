package com.brad.datastruct.leetcode.tree;

import com.brad.datastruct.LinkedList.ListNode;
import com.brad.datastruct.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Description: 二叉树的中序遍历（左根右）
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-16 18:02
 */
public class _94InorderTraversal {

    private List<Integer> ret = new ArrayList<>();

    /**
     * 递归实现方式
     * 时间复杂度：O(n)。递归函数 T(n)=2⋅T(n/2)+1。
     * 空间复杂度：最坏情况下需要空间O(n)，平均情况为O(logn)。
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            ret.add(root.val);
            inorderTraversal(root.right);
        }
        return ret;
    }


    /**
     * 非递归实现方式
     * 题解：使用一个栈辅助，先把左节点压栈，再一次对每个左节点做遍历操作(左根右)
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        // 循环条件；栈为空且p也为空
        while (p != null || !stack.empty()) {
            // 遍历到左子树的最后
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            ret.add(p.val);
            p = p.right;
        }
        return ret;
    }
}
