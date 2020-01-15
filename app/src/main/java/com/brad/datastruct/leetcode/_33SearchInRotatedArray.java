package com.brad.datastruct.leetcode;

import java.util.Arrays;

/**
 * Description: 有序环数组的查找
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020-01-03 17:36
 */
public class _33SearchInRotatedArray {

    /**
     * 暴力法：遍历一遍
     * 时间复杂度为O(n)
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分查找法
     * @param nums
     * @param p
     * @param r
     * @param target
     * @return
     */
    private int searchBinary(int nums[], int p, int r, int target) {
        while (p <= r) {
            int mid = p + ((r - p) >> 2);
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                p = mid + 1;
            } else {
                return nums[mid];
            }
        }
        // 二分查找，没找到
        return -1;
    }

}
