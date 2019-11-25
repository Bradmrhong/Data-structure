package com.brad.datastruct;

import com.brad.datastruct.LinkedList.LinkedList;

import org.junit.Test;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-20 21:10
 */
public class LinkedListTest {

    @Test
    public void add() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("0");
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("brad->"+"i="+i+",e="+linkedList.get(i));
        }

        linkedList.insertBefore(2, "999");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("brad->"+"i="+i+",String="+linkedList.get(i));
        }

        linkedList.insertAfter(2, "888");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("brad->"+"i="+i+",String="+linkedList.get(i));
        }


    }

    @Test
    public void insertBefore() {
    }

    @Test
    public void insertAfter() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void size() {
    }

    @Test
    public void get() {
    }
}