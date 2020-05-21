package com.brad.datastruct.leetcode;

/**
 * Description: LeetCode 26
 * 删除排序数组中的重复数字，并返回删除完后的长度；要求空间复杂度为O(1)
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020/5/21 10:39 AM
 */
public class _026RemoveDuplicates {
    /**
     * 题解：
     * 因为是排序数组，所以重复数字一定是相邻的。
     * 遇到不重复的元素就插入tail
     * @param a 数组
     * @return
     */
    public static int removeDuplicates(int[] a) {
        if (a == null) return 0;
        if (a.length < 2) return a.length;

        int tail = 1;   //从1开始
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i-1]) {
                a[tail++] = a[i];
            }
        }
        return tail;
    }
}
