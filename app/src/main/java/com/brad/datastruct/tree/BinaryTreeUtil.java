package com.brad.datastruct.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-12-16 10:49
 */
public class BinaryTreeUtil {

    /**
     * 深度优先遍历（前序）,递归实现
     * @param root
     */
    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /**
     * 深度优先遍历（中序）,递归实现
     * @param root
     */
    public static void midOrder(TreeNode root) {
        if (root != null) {
            midOrder(root.left);
            System.out.println(root.val);
            midOrder(root.right);
        }
    }

    /**
     * 深度优先遍历（后序）,递归实现
     * @param root
     */
    public static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.val);
        }
    }


    /**
     * 宽度优先遍历（层次）
     */
    public static void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode tmp;
        int levelLenth = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            levelLenth = queue.size();
            for (int i = 0; i < levelLenth; i++) {
                tmp = queue.poll();
                if (tmp != null) {
                    System.out.println(tmp.val);
                    if (tmp.left != null) queue.add(tmp.left);
                    if (tmp.right != null) queue.add(tmp.right);
                }

            }
        }
    }

    /**
     * 求二叉树的高度
     */
    public static int heightOfTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp = null;
        int lenLevel, height = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            lenLevel = queue.size();
            for (int i = 0; i < lenLevel; i++) {
                temp = queue.poll();
                if (temp != null) {
                    if (temp.left != null) queue.add(temp.left);
                    if (temp.right != null) queue.add(temp.right);
                }
            }
            if (temp != null) {
                height++;
            }
        }
        return height;
    }
}
