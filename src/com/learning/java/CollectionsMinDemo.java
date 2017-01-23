package com.learning.java;

/**
 * Created by ejangpa on 1/23/2017.
 */

import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.ArrayList;

public class CollectionsMinDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("11");
        list.add("2");
        list.add("4");
        list.add("23");
        list.add("JB");
        //System.out.println(Collections.max(list));
        //System.out.println(Collections.min(list));
      //  System.out.println(list);
        Collections.addAll(list, "ns", "java", "bear");
      //  System.out.println(list);
        String[] str = {"c", "c++","c"};
      //  System.out.println(list);
        Collections.addAll(list, str);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.frequency(list, "c"));
    }
}
