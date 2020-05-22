package com.brad.datastruct.leetcode.string;

/**
 * Description: LeetCode 27
 * 删除数组中的某个特定元素，并返回删除完后的长度；要求空间复杂度为O(1)
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020/5/21 10:39 AM
 */
public class _027RemoveSpecified {
    /**
     * 题解：
     *
     * 遇到不为特定的元素就插入tail
     * @param a 数组
     * @return
     */
    public static int removeSpecified(int[] a, int k) {
        if (a == null) return 0;

        int tail = 0;   //从0开始
        for (int i = 0; i < a.length; i++) {
            if (a[i] != k) {
                a[tail++] = a[i];
            }
        }
        return tail;
    }
}
