package com.brad.datastruct.sort;

/**
 * Description: 实现插入排序，选择排序，归并排序，快速排序
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-28 22:08
 */
public class SortUtils {

    /**
     * 插入排序
     * 思路：分成已排序区和未排序区，遍历未排序区，每次取出未排序区的第一个元素插入到已排序区
     *
     * @param a 待排序的数组
     */
    public static void insertSort(int[] a) {
        if (a == null) {
            return;
        }
        // 遍历未排序区，从1开始，因为只有一个数据的情况下可以认为该区是有序的
        for (int i = 1; i < a.length - 1; i++) {
            int last = a[i];
            int j = i - 1;
            // 遍历排序区，找到位置插入，涉及移位
            for (; j >= 0; j--) {
                if (last < a[j]) {
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }
            a[j+1] = last;  // 因为循环里面j--所以这里要加1
        }
    }

    /**
     * 选择排序
     * 思路：分成已排序区和未排序区，遍历未排序区，每次交换未排序区的最小的元素和未排序区的首元素。
     *
     * @param a 待排序的数组
     */
    public static void selectSort(int[] a) {
        if (a == null) {
            return;
        }
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length ; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
    }

    public static void mergeSort(int[] a) {
        if (a == null) {
            return;
        }

    }

    public static void quickSort(int[] a) {
        if (a == null) {
            return;
        }

    }
}
