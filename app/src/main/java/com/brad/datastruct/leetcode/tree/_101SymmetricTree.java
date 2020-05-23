package com.brad.datastruct.leetcode.tree;

import com.brad.datastruct.tree.TreeNode;

/**
 * Description: 对称二叉树
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-16 18:02
 */
public class _101SymmetricTree {

    /**
     * 递归求解
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricInternal(root.left, root.right);
    }

    private boolean isSymmetricInternal(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return isSymmetricInternal(left.left, right.right) && isSymmetricInternal(left.right, right.left);
    }

}
