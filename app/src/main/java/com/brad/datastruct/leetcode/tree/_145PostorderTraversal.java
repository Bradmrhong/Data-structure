package com.brad.datastruct.leetcode.tree;

import com.brad.datastruct.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Description: 二叉树的前序遍历（左右根）
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-16 18:02
 */
public class _145PostorderTraversal {

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
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            ret.add(root.val);
        }
        return ret;
    }


    /**
     * 非递归实现方式
     * 题解：注意到前序遍历是根左右，如果是根右左的话，再倒序输出，即是左右根(后序)
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null) return ret;
        TreeNode p;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        // 循环条件:栈为空
        while (!stack.empty()) {
            p = stack.pop();
            ret.add(p.val);
            if (p.left != null) {
                stack.add(p.left);
            }
            if (p.right != null) {
                stack.add(p.right);
            }
        }
        Collections.reverse(ret);
        return ret;
    }
}
