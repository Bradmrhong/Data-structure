package com.brad.datastruct.leetcode.tree;

import com.brad.datastruct.LinkedList.ListNode;
import com.brad.datastruct.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Description: leetcode 199 二叉树的右视图
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-16 18:02
 */
public class _199RightSideView {

    private List<Integer> res = new ArrayList<>();

    /**
     * 思路：BFS(广度优先遍历/层次遍历)。
     * 将每层的最后一个节点放入容器返回。
     *
     * @param
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return res;
        }
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            // 一次循环遍历一层
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (i == size - 1) {
                    res.add(node.val);
                }
            }
        }
        return res;
    }


    /**
     * 思路：DFS(深度优先遍历) 根右左。
     * 规律：DFS下每层第一次遍历的右节点及时右视图结果
     * @param
     * @return
     */
    public List<Integer> rightSideView2(TreeNode root) {
        if (root == null) {
            return res;
        }
        bfs(root, 0);
        return res;
    }

    private void bfs(TreeNode root, int depth) {
        if (root != null) {
            // 这个条件代表是该层第一个遍历的右节点
            if (depth == res.size()) {
                res.add(root.val);
            }
            depth++;
            bfs(root.right, depth);
            bfs(root.left, depth);
        }
    }


}
