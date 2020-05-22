package com.brad.datastruct.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Description: LeetCode 58
 * 最后一个word的长度
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020/5/21 10:39 AM
 */
public class _058LengthOfLastWord {
    /**
     * 题解：
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if (s == null) return 0;
        String tmp = s.trim();
        if (tmp.length() == 0) return 0;
        int ret = 0;
        for (int i = tmp.length() - 1; i >= 0; i--) {
            if (tmp.charAt(i) != ' ') ret++;
            else break;
        }
        return ret;
    }

}
