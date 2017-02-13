package com.learning.java.collections;

import java.util.ArrayList;
import java.util.Enumeration;

/**
 * Created by ejangpa on 2/9/2017.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(5);
        al.ensureCapacity(3);
        al.add("A");
        al.add(10);
        al.add('A');
        al.add(null);
        System.out.println(al);
        al.remove(2);
        al.add(2,"mad");
        al.add(23);
        al.add(null);
        System.out.println(al);
    }
}
