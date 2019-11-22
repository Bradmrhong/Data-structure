package com.brad.datastruct;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author Brad <mailto:brad.hong@bindo.com>
 * @version 1.0
 * @since 2019-11-20 20:15
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


    }

    @Test
    public void insertBefore() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("0");
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.insertBefore(2, "999");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("brad->"+"i="+i+",String="+linkedList.get(i));
        }

    }

    @Test
    public void insertAfter() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("0");
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.insertAfter(2, "999");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("brad->"+"i="+i+",String="+linkedList.get(i));
        }

    }

    @Test
    public void remove() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("0");
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.remove("3");
        System.out.println("1111111");

        linkedList = new LinkedList<>();
        linkedList.add("0");
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.remove("2");
        System.out.println("1111111");

        linkedList = new LinkedList<>();
        linkedList.add("0");
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.remove("0");
        System.out.println("1111111");


    }

    @Test
    public void reverse() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("0");
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.reverse();
        System.out.println("end");


    }

}