package com.learning.java.collections;

import java.util.TreeSet;

/**
 * Created by ejangpa on 1/27/2017.
 */

public class TreeSetSimpleDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(132);
        treeSet.add(323);
        treeSet.add(888);
        treeSet.add(373);
        treeSet.add(987);
        treeSet.add(321);
        treeSet.add(578);
       // treeSet.add("123");
        System.out.println(treeSet);
    }
}
