package com.brad.datastruct.stack;

import java.util.Calendar;

/**
 * Description: 利用栈实现浏览器的前进后退功能
 * 使用两个栈，点击一个新界面，直接push到栈1，且如果栈2不为空，清空栈2；
 * 点击后退按钮，弹出栈1的界面，并加入到栈2；
 * 点击前进按钮，弹出栈2的界面，
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-27 17:41
 */
public class SampleBrowser {
    private Object[] stack1;    // 栈1
    private Object[] stack2;    // 栈2
    private int top1;        //
    private int top2;        //
    private int capacity;

    public SampleBrowser(int capacity) {
        this.capacity = capacity;
        stack1 = new Object[capacity];
        stack2 = new Object[capacity];
    }

    public boolean clickNewPage(Object o) {
        if (top1 == capacity) {
            return false;
        }
        stack1[top1++] = o; // 压栈
        if (top2 != 0) {
            top2 = 0;
        }
        return true;
    }

    public Object clickBack() {
        if (top1 == 0) {
            return null;
        }

        // 弹出栈1的界面，并加入到栈2
        Object value = stack1[--top1];
        stack2[top2++] = value;
        return value;
    }

    public Object clickForward() {
        if (top2 == 0) {
            return null;
        }
        // 弹出栈2的界面，并将当前界面压到栈1
        Object value = stack2[--top2];
        stack1[top1++] = value;
        return value;
    }

    public boolean isBackEnable() {
        return top1 != 0;
    }

    public boolean isForwardEnable() {
        return top2 != 0;
    }


}
