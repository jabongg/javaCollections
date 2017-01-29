package com.learning.java.collections;

import java.util.Map;

/**
 * Created by ejangpa on 1/23/2017.
 */

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1,"karan");
        map.put(2,"kankan");
        map.put(3,"somya");
        map.put(4,"vandy");
        map.put(5,"jhala");

        // Converting to Set so that we can traverse.
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry m = (Map.Entry) iterator.next();
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }

    /**
     * Created by ejangpa on 11/11/2016.
     */
    public static class ArrayListDemo {
        public static void main(String[] args) {
            ArrayList <String> arrayList = new ArrayList<String>();
            arrayList.add("Ankush");
            arrayList.add("jb");
            arrayList.add("mike");

            System.out.println();
        }
    }
}
