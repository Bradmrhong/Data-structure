package com.brad.datastruct.stack;

import com.brad.datastruct.LinkedList.LinkedList;

/**
 * Description: 链栈
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-25 19:18
 */
public class LinkedListStack {

    // 初始化头结点，亦作为栈顶指针
    private LinkedList.Node<String> top = new LinkedList.Node<>(null, null, null);


    /**
     * 使用头插法插入，如果使用尾插法的话，会使得pop操作变复杂
     * @param item
     * @return
     */
    public boolean push(String item) {
        LinkedList.Node<String> newNode = new LinkedList.Node<>(item, null, null);
        newNode.next = top;
        top = newNode;
        return true;
    }

    public String pop() {
        String value = top.item;
        top = top.next; // 覆盖掉;
        return value;
    }



}
