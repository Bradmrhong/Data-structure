package com.brad.datastruct.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-12-13 10:35
 */
public class LinkedListUtilTest {

    @Test
    public void checkCircle() {
    }

    @Test
    public void mergeOrderedList() {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(4);
        LinkedList<Integer> b = new LinkedList<>();
        b.add(1);
        b.add(3);
        b.add(4);
        LinkedList<Integer> c = LinkedListUtil.mergeOrderedList(a, b);
        LinkedList.Node<Integer> first = c.first;
        String r = "";
        while (first != null) {
            r += first.item + "->";
            first = first.next;
        }
        System.out.println("result = " + r);

    }

    @Test
    public void removeLastK() {
    }

    @Test
    public void removeMiddle() {
    }

    @Test
    public void reverse() {
    }
}