package com.brad.datastruct.stack;

/**
 * Description: 数组栈
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-25 19:07
 */
public class ArrayStack {

    private String[] items;
    private int capacity;
    private int top;    // 栈顶指针

    public ArrayStack(int size) {
        items = new String[size];
        capacity = size;
        top = 0;
    }

    private boolean push(String item) {
        // 栈满
        if (top == capacity) {
            return false;
        }
        items[top++] = item;
        return true;
    }

    private String pop() {
        //栈空
        if (top == 0) {
            return null;
        }
        return items[--top];
    }

}
