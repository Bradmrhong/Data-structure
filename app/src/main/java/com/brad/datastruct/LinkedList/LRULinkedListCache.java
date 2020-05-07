package com.brad.datastruct.LinkedList;

/**
 * Description: LRU(Least recently used) 最近最少使用策略
 * 思路：添加操作
 * 1-如果元素已经在表中了，则取出这个元素，删除原来的位置，在头结点插入
 * 2-i-如果元素不在表中，则判断max_size是否已满，如果满了，则删除尾结点在插入新元素在头结点
 * 2-ii-如果max_size未满，则直接插入
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-24 17:56
 */
public class LRULinkedListCache<E> {

    private final static int MAX_SIZE = 10;

    private Node<E> head;   // 头结点不保存任何东西
    private int size = 0;

    public LRULinkedListCache() {
        this.head = new Node<>(null);
    }

    // 添加一个元素
    public boolean add(E e) {
        if (isExist(e)) {
            delete(e);
            insert2Head(e);
        } else {
            if (size >= MAX_SIZE) {
                deleteLast();
            }
            insert2Head(e);
        }
        return true;
    }


    /**
     * 判断元素是否已经在表中
     * @param e 元素
     */
    private boolean isExist(E e) {
        Node<E> x = head.next;
        while (x != null) {
            if (x.item.equals(e)) {
                return true;
            }
            x = x.next;
        }
        return false;
    }

    /**
     * 删除节点
     * @param e
     * @return
     */
    private boolean delete(E e) {
        Node<E> x = head.next;
        Node<E> prev = head;
        while (x != null) {
            if (x.item.equals(e)) {
                prev.next = x.next;
                return true;
            }
            prev = x;
            x = x.next;
        }
        return false;
    }

    /**
     * 删除最后一个节点
     * @return
     */
    private boolean deleteLast() {

        // empty list
        if (head.next == null) {
            return false;
        }
        Node<E> prev = head;

        while (prev.next.next != null) {
            prev = prev.next;
        }

        prev.next = null;
        size--;
        return true;

    }

    /**
     * 头插法：插入节点到表头
     * @param e
     * @return
     */
    private boolean insert2Head(E e) {
        Node<E> x = new Node<>(e, head.next);
        head.next = x;
        size++;
        return true;
    }

    private static class Node<E> {
        E item;         // 节点数据
        Node<E> next;   // 后继节点

        public Node(E item) {
            this.item = item;
        }

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }



    }


}
