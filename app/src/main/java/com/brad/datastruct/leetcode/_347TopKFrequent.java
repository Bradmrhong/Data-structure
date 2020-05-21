package com.brad.datastruct.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Description: 一个数组中前K个频率最高的数
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-12-19 16:39
 */
public class _347TopKFrequent {
    /**
     * 解题思路，使用一个hashmap存储（数字，频率）
     * 遍历map，使用优先队列（小顶堆）（大小为K）按照频率大到小存储
     * 输出数列
     *
     * @param nums
     * @param k
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public List<Integer> topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> count = new HashMap<>();
        // 按照<元素，频率>的方式存入map
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // 小顶堆
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return count.get(o1) - count.get(o2);
            }
        });
        // 把元素塞入小顶堆
        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        // 构建输出数列
        List<Integer> output = new ArrayList<>();
        while (heap.size() != 0) {
            output.add(heap.poll());
        }
        Collections.reverse(output);
        return output;
    }

}
