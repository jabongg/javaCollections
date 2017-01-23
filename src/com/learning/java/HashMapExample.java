package com.learning.java;

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
}
