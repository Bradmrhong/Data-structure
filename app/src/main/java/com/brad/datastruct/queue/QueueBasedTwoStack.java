package com.brad.datastruct.queue;

/**
 * Description: 两个栈组成一个队列
 * 入队列：直接push入栈1；
 * 出队列：如果栈2为空，把栈1pop出来，全部压到栈2中，然后pop一个元素到栈2；如果栈2不为空，则直接pop栈2元素./
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-27 15:16
 */
public class QueueBasedTwoStack {
    private int capacity;       // 队列容量
    private String[] stack1;    // 1号栈
    private int top1;           // 1号栈顶指针
    private String[] stack2;    // 2号栈
    private int top2;           // 2号栈顶指针

    public QueueBasedTwoStack(int capacity) {
        this.capacity = capacity;
        stack1 = new String[capacity];
        stack2 = new String[capacity];
    }

    public boolean enqueue(String item) {
        // 队列满
        if (top1 + top2 > capacity) {
            return false;
        }

        stack1[top1++] = item;
        return true;
    }

    public String dequeue() {
        // 队列空
        if (top1 == 0 && top2 == 0) {
            return null;
        }
        if (top2 == 0) {
            popStack1ToStack2();
        }
        return stack2[--top2];
    }

    private void popStack1ToStack2() {
        while (top1 > 0) {
            stack2[top2++] = stack1[--top1];
        }
    }

}
