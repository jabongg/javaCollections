package com.learning.java.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by ejangpa on 2/9/2017.
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector(0,1);
        System.out.println(vector.capacity());
        vector.addElement(1);
        vector.addElement("javaranch");
        System.out.println(vector);
        vector.add(2343);
        vector.addElement(null);
        System.out.println(vector);
        vector.removeElementAt(2);
        System.out.println(vector);
        Enumeration enumeration = vector.elements();
        Iterator iterator = vector.iterator();
        ListIterator listIterator = vector.listIterator();

        System.out.println("enum initial value:" + enumeration.getClass().getName());
        System.out.println("enum initial value:" + iterator.getClass().getName());
        System.out.println("enum initial value:" + listIterator.getClass().getName());

        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());
    }
}
