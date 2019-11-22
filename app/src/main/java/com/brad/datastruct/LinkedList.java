package com.brad.datastruct;

/**
 * Description:
 *
 * @author Brad <mailto:brad.hong@bindo.com>
 * @version 1.0
 * @since 2019-11-20 18:17
 */
public class LinkedList<E> implements List<E> {

    private int size = 0;   //
    public Node<E> first;
    public Node<E> last;


    @Override
    public void add(E e) {
        // 尾部插入
        Node<E> newNode = new Node<>(e, last, null);        // 新建一个结尾点，next指针指向null, prev指针指向原last
        // 原来没有节点
        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;    // 原last指针的next指向newNode
        }
        last = newNode;         // last指针后移
        size++;                 // size + 1
    }

    @Override
    public void insertBefore(int index, E e) {
        if (size < index || index < 0) {
            return;
        }
        Node<E> x;
        if (index < size/2) {
            x = first;
            for (int i = 0; i < index - 1; i++) {
                x = x.next;
            }
        } else {
            x = last;
            for (int i = size - 1; i > index - 1; i--) {
                x = x.prev;
            }
        }
        Node<E> newNode = new Node<>(e, x, x.next);
        newNode.next.prev = newNode;
        x.next = newNode;
        size++;
    }

    @Override
    public void insertAfter(int index, E e) {
        if (size < index || index < 0) {
            return;
        }
        Node<E> x;
        if (index < size/2) {
            x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
        } else {
            x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
        }
        Node<E> newNode = new Node<>(e, x, x.next);
        newNode.next.prev = newNode;
        x.next = newNode;
        size++;
    }


    @Override
    public void remove(E e) {
        if (e == null) {
            for (Node<E> var = first; var != null; var = var.next) {
                if (var.item == null) {
                    Node<E> next = var.next;
                    Node<E> prev = var.prev;
                    // 如果待删除的是头结点
                    if (prev == null) {
                        first = next;
                    } else {
                        prev.next = next;
                        var.prev = null;
                    }
                    // 如果待删除的是尾结点
                    if (next == null) {
                        last = prev;
                    } else {
                        next.prev = prev;
                        var.next = null;
                    }
                    var.item = null;    // 释放
                }
            }
        } else {
            for (Node<E> var = first; var != null; var = var.next) {
                if (var.item.equals(e)) {
                    Node<E> next = var.next;
                    Node<E> prev = var.prev;
                    // 如果是头结点
                    if (prev == null) {
                        first = next;
                        next.prev = null;
                    } else if (next == null) {  // 判断是尾结点
                        last = prev;
                        prev.next = null;
                    } else {
                        next.prev = prev;
                        prev.next = next;
                    }
                    var.next = null;
                    var.prev = null;
                    var.item = null;
                }
            }
        }


        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        // 前半部分，由前往后索引
        if (index < size/2) {
            Node<E> x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x.item;
        } else {    // 后半部分，后往前索引
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x.item;
        }
    }

    /**
     * 双向链表翻转
     */
    @Override
    public void reverse() {
        if (size == 0) {
            return;
        }
        Node<E> currentNode = first;
        Node<E> preNode = null;
        Node<E> nextNode = null;
        last = currentNode;
        while(currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = preNode;
            currentNode.prev = nextNode;
            preNode = currentNode;
            currentNode = nextNode;
//            nextNode = currentNode.next;
//            currentNode.next = preNode;
//            currentNode.prev = nextNode;
//            preNode = currentNode;
//            currentNode = nextNode;
        }
        first = preNode;
    }


    /**
     * 定义链表节点数据结构
     * @param <E>
     */
    public static class Node<E> {
        E item;         // 节点数据
        Node<E> next;   // 后继节点
        Node<E> prev;   // 前继节点

        public Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

    }
}
