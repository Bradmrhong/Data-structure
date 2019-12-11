package com.brad.datastruct.sort;

import java.util.Arrays;

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

    /**
     * 归并排序
     * 思路：分治 + 递归
     * 1-(分治)假设头为p，尾为r，
     * 2-每次找到待排序的中点，分成两个待排序数组，一直分下去直到(p >= r)(递归终止条件)
     * 3-两两分割的有序数组进行合并(有序数组合并)
     * @param a
     */
    public static void mergeSort(int[] a) {
        if (a == null) {
            return;
        }
        mergeSortInternally(a, 0, a.length-1);
    }

    private static void mergeSortInternally(int[] a, int p, int r) {
        // 递归终点
        if (p >= r) {
            return;
        }
        // 找到中点
        int mid = p + (r - p) / 2;
        mergeSortInternally(a, p, mid);
        mergeSortInternally(a, mid + 1, r);
        mergeOrderedArray(a, p, mid, r);
    }

    /**
     * 合并两个有序数组 a[p...mid], a[mid+1...r]
     * @param a 总数组
     * @param p
     * @param mid
     * @param r
     */
    private static void mergeOrderedArray(int[] a, int p, int mid, int r) {
        int[] tmp = new int[r-p+1];
        int i = p, j = mid+1, k = 0;
        // 从头遍历两个数组，那个小就塞到临时数组里去
        while (i <= mid && j <= r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }

        // 查看哪个数组还没遍历完，直接塞到临时数组的最后
        if (i < mid) {
            while (i <= mid) {
                tmp[k++] = a[i++];
            }
        } else {
            while (j <= r) {
                tmp[k++] = a[j++];
            }
        }

        // 将临时数组的东西拷贝到最终数组该有的位置
        for (int m = 0; m < r-p+1; m++) {
            a[p+m] = tmp[m];
        }

    }

    public static void quickSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        quickSortInternally(a, 0, a.length-1);

    }

    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) {
            return;     // 递归结束条件
        }
        int partition = partition(a, p, r);
        quickSortInternally(a, p, partition-1);
        quickSortInternally(a, partition+1, r);
    }

    private static int partition(int[] a, int p, int r) {
        // 为了简单书写，这里直接选取最后一个元素当中枢点，工业上可以采用三数分割法
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                int tmp = a[j];
                a[j] = a[i];
                a[i++] = tmp;
            }
        }
        a[r] = a[i];
        a[i] = pivot;
        return i;
    }


    /**
     * 插入排序
     * 思路：分成已排序区和未排序区，遍历未排序区，每次取出未排序区的第一个元素插入到已排序区
     *
     * @param a 待排序的数组
     */

    public static void Insert(int[] a) {
        if (a == null) {
            return;
        }

//        // 遍历未排序区，从1开始，因为只有一个数据的情况下可以认为该区是有序的
//        for (int i = 1; i < a.length - 1; i++) {
//            int last = a[i];
//            int j = i - 1;
//            // 遍历排序区，找到位置插入，涉及移位
//            for (; j >= 0; j--) {
//                if (last < a[j]) {
//                    a[j+1] = a[j];
//                } else {
//                    break;
//                }
//            }
//            a[j+1] = last;  // 因为循环里面j--所以这里要加1
//        }

        for (int i = 1; i < a.length - 1; i++) {
            int insert = a[i];
            int index = i-1; // 插入的位置
            while (index >= 0 && insert < a[index]) {
                a[index+1] = a[index];
                index--;
            }
            a[index+1] = insert;
            System.out.println(Arrays.toString(a));
        }

    }



    public static void quickSort2(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        quickSortInternally2(a, 0, a.length-1);

    }

    public static void quickSortInternally2(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int pivot = partition2(a, p ,r);
        quickSortInternally2(a, p, pivot-1);
        quickSortInternally2(a, pivot+1, r);
    }

    private static int partition2(int[] a,int p, int r) {
        int pivot = a[r];
        int pivotPosition = p;
        for (int i = p; i < r; i++) {
            if (a[i] < pivot) {
                int tmp = a[pivotPosition];
                a[pivotPosition++] = a[i];
                a[i] = tmp;
            }
        }
        a[r] = a[pivotPosition];
        a[pivotPosition] = pivot;
        return pivotPosition;
    }





}
