package com.brad.datastruct.array;


import java.util.Arrays;

/**
 * Description: 数组相关算法题
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-25 19:07
 */
public class ArrayUitls {


    private ArrayUitls() {
    }

    /**
     *有一个整形数组，包含正数和负数，然后要求把数组内的所有负数移至正数的左边，且保证相对位置不变，
     * 要求时间复杂度为O(n), 空间复杂度为O(1)。
     * 例如，{10, -2, 5, 8, -4, 2, -3, 7, 12, -88, -23, 35}
     * 变化后是{-2, -4, -3, -88, -23, 10, 5, 8, 2, 7, 12, 35};。
     * 思路：定义两个指针i,j指向头，[0, i]为负数位置，j往后遍历遇到负数就插入到负数区间的最后一个位置
     */
    public static int[] moveNagetiveDigitsToLetf(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        int i = 0, j = 0, pos = 0, tmp;
        while (i < a.length && j < a.length) {
            // 遇到负数就插入到负数区间的最后一个位置，不能直接交换，直接交换会打乱位置
            if (a[j] < 0) {
                tmp = a[j];
                // 移位
                for (int m = j; m > i; m--) {
                    a[m] = a[m-1];
                }
                a[i++] = tmp;
            }
            j++;
            System.out.println(Arrays.toString(a));
        }
        return a;
    }



}
