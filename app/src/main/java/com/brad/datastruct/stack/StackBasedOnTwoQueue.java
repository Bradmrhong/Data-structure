package com.brad.datastruct.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Description: 两个队列实现一个栈
 * 思路：
 * 入栈：插入非空队列
 * 出栈：将非空队列出队列->空队列直至最后一个元素，弹出最后一个元素
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020/5/7 8:48 PM
 */
public class StackBasedOnTwoQueue<T> {
    private Queue<T> queue1 = new LinkedList<>();
    private Queue<T> queue2 = new LinkedList<>();

    /**
     * 入栈：插入非空队列
     * @param item
     */
    private void push(T item) {
        if (!queue1.isEmpty()) {
            queue1.add(item);
        } else {
            queue2.add(item);
        }
    }

    /**
     * 出栈：将非空队列出队列->空队列直至最后一个元素，弹出最后一个元素
     * @return T
     */
    private T pop() {
        if (!queue1.isEmpty()) {
            for (int i = 0; i < queue1.size() - 1; i++) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        } else if (!queue2.isEmpty()) {
            for (int i = 0; i < queue2.size() - 1; i++) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        } else {
            return null;
        }
    }

}
