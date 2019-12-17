package com.brad.datastruct.String;

import java.util.Arrays;

/**
 * Description: Leetcode 03: 寻找最长不重复子串的长度
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-25 19:07
 */
public class StringUitls {


    private StringUitls() {
    }

    /**
     * 采用移动滑块法：维护一个移动的滑块[i,j]，每次滑块变化都记录其最大值，
     * j在右移的时候，每次去检查原滑块里面是否有相同的元素m，
     * 如果有，则把i移动到相同m+1的位置
     * 如果没有，则j继续右移
     * 时间复杂度O(n2)
     * 空间复杂度O(1)
     */
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (s == null || s.length() == 0) {
            return max;
        }
        for (int i = 0, j = 0; i < s.length() && j < s.length();) {
            // 查找[i, j]中是否有重复字符，如果有，则把i移动到m+1的位置，
            // 移动到m+1的位置相当于删除相同的元素
            // 如果没有重复的字符，将j所引用的位置入列
            for (int m = i; m < j; m++) {
                if (s.charAt(m) == s.charAt(j)) {
                    i = m + 1;
                    break;
                }
            }
            j++;
            max = Math.max(max, j - i);
        }
        return max;
    }


    /**
     * 找到一个数组中最大的的第K个数
     * @param arr
     * @param k
     * @return
     */
    public static int findKthLargest(int[] arr, int k) {
        int p = 0, r = arr.length - 1;
        while(true) {
            int partition = partition(arr, p, r);
            if (partition + 1 == k) {
                return arr[partition];
            } else if (partition + 1 < k) {
                p = partition + 1;
            } else {
                r = partition - 1;
            }
        }

    }

    private static int partition(int[] nums, int p, int r) {
        int pivot = nums[r];
        int pivotPosition = p;
        for (int i = p; i < r; i ++) {
            if (nums[i] > pivot) {
                int tmp = nums[pivotPosition];
                nums[pivotPosition++] = nums[i];
                nums[i] = tmp;
            }
        }
        nums[r] = nums[pivotPosition];
        nums[pivotPosition] = pivot;
        return pivotPosition;
    }


}
