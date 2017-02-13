package com.learning.java.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by ejangpa on 2/9/2017.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.capacity());
        stack.add(1322);
        stack.add("somya");
        stack.add(null);
        stack.add(null);
        stack.add(773);
        System.out.println(stack);
        stack.push("arrayList");
        stack.peek();
        stack.indexOf(3);
        stack.capacity();
        stack.pop();

        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.search(1322));
        System.out.println(stack.search("jang"));

        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            if (stack.size() % 2 == 0) {
                System.out.println(iterator.next());
            }
            iterator.remove();
        }

        Enumeration enumeration = stack.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
