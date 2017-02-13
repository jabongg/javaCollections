package com.learning.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by ejangpa on 2/9/2017.
 */
public class SetDemo {
    public static void main(String[] args) {
       /* Set set = new HashSet(2,3); */
        Set set = new LinkedHashSet(2,3);
        System.out.println(set);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(3);
        set.add(41);
        set.add(52);
        set.add(33);

        System.out.println(set);

    }
}
