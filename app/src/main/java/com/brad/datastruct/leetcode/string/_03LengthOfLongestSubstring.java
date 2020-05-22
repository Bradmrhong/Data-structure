package com.brad.datastruct.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Description: LeetCode 23
 * 最小不重复子串
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020/5/21 10:39 AM
 */
public class _03LengthOfLongestSubstring {
    /**
     * 题解：滑动窗口法O(n2)
     * 右指针往右移动，每次一定判断窗口内是否有重复字符
     * 如果有重复字符，左指针指向窗口内的重复字符，更新最大子字串大小
     * 如果没有重复字符，右指针+1，更新最大子串大小
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        int left = 0, right = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            // 检查滑块内是否有重复字符
            for (int j = left; j < right; j++) {
                if (s.charAt(j) == s.charAt(right)) {
                    left = j + 1;   // 为什么不为j, 因为要移过这个元素，才不包含这个重复元素
                }
            }
            right++;
            max = Math.max(max, right - left);

        }
        return max;
    }

    /**
     * 题解：滑动窗口法O(2n) = O(n)
     * 采用set进行优化
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) return 0;

        Set<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int max = 0;
        while (left < s.length() && right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            } else {
                set.add(s.charAt(right++));
                max = Math.max(max, right - left);
            }
        }
        return max;
    }


}
