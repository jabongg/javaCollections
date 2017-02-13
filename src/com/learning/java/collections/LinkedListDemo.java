package com.learning.java.collections;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by ejangpa on 2/9/2017.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add("sfasdf");
        list.add(true);
        list.add(null);
        list.add(null);
        list.set(3,false);
        list.remove(1);
        list.addFirst("swati");
        System.out.println(list);

        ListIterator listIterator = list.listIterator(5);
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
