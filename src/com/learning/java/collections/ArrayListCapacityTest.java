package com.learning.java.collections;

/**
 * Created by ejangpa on 2/21/2017.
 */
import java.util.ArrayList;

public class ArrayListCapacityTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for (Integer i = 0; i < 12; i++) {
            al.add(i);
        }
        System.out.println(al.size());
        System.out.println();
    }
}