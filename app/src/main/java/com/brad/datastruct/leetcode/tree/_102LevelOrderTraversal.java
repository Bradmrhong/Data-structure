package com.brad.datastruct.leetcode.tree;

import com.brad.datastruct.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Description: leetcode 102 二叉树的层次遍历
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-16 18:02
 */
public class _102LevelOrderTraversal {

    private List<Integer> res = new ArrayList<>();

    /**
     * 思路：BFS(广度优先遍历/层次遍历)。
     * 将每层的最后一个节点放入容器返回。
     *
     * @param
     * @return
     */
    public List<Integer> levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return res;
    }


}
