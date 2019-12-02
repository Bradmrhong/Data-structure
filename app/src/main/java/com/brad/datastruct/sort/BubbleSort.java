package com.brad.datastruct.sort;

/**
 * Description: 冒泡排序
 * 优化1：通过一次遍历查看交换方式判断遍历是否结束
 * 优化2：记录最后交换时候的index，二次遍历的时候到index就可以了，因为index后面的已经排序完成
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-28 18:09
 */
public class BubbleSort {

    /**
     * 大泡下沉: 分成已排序区和未排序区，遍历并相邻两个数据进行比较，判断是否交换位置，
     * 每次冒泡都至少有一个元素移动到它该到的位置（即未排序段的末尾）。
     * @param nums
     */
    public static void BigBubbleDown(int[] nums) {
        if (nums == null) {
            return;
        }
        // 只需要遍历 n-1 次
        for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    /**
     * 大泡下沉
     * 优化2： 记录最后交换时候的index，二次遍历的时候到index就可以了，因为index后面的已经排序完成
     * @param nums
     */
    public static void BigBubbleDown2(int[] nums) {
        if (nums == null) {
            return;
        }
        int lastExchange = 0; // 最后一次交换位置
        int index = nums.length - 1;    // 遍历到最后一次交换位置就不需要往下遍历了
        // 只需要遍历 n-1 次
        for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < index; j++) {
                if (nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    flag = true;
                    lastExchange = j;
                }
            }
            index = lastExchange;
            if (!flag) break;
        }
    }

    /**
     * 小泡上浮（不推荐使用）
     */
    public static void SmallBubbleUp(int[] nums) {
        if (nums == null) {
            return;
        }
        // 只需要遍历 n-1 次
        for (int i = nums.length - 1; i > 0; i--) {
            boolean flag = false;
            for (int j = nums.length - 1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;   // 如果没有数据交换，说明已经有序
        }

    }


}
