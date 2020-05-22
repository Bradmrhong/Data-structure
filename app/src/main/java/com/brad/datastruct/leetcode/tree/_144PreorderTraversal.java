package com.brad.datastruct.leetcode.tree;

import com.brad.datastruct.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Description: 二叉树的前序遍历（根左右）
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-16 18:02
 */
public class _144PreorderTraversal {

    private List<Integer> ret = new ArrayList<>();

    /**
     * 递归实现方式
     * 时间复杂度：O(n)。递归函数 T(n)=2⋅T(n/2)+1。
     * 空间复杂度：最坏情况下需要空间O(n)，平均情况为O(logn)。
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            ret.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return ret;
    }


    /**
     * 非递归实现方式
     * 题解：使用一个栈辅助，先把左节点压栈，再一次对每个左节点做遍历操作(根左右)
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null) return ret;
        TreeNode p;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        // 循环条件；栈为空且p也为空
        while (!stack.empty()) {
            p = stack.pop();
            ret.add(p.val);
            if (p.right != null) {
                stack.add(p.right);
            }
            if (p.left != null) {
                stack.add(p.left);
            }
        }
        return ret;
    }
}
