package com.careercup;

/**
 * Created by ejangpa on 1/25/2017.
 */
import java.util.*;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "aaaggbbbbc"; // we can take input from scanner also
        char[] strArray = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();         // taking LinkedHashMap to
                                                                    // maintain the insetion order
        for (char ch : strArray) {
            if (map.containsKey(ch)) {
                int value = map.get(ch);
                map.put(ch, value + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
           Map.Entry entry = (Map.Entry) iterator.next();
            System.out.print(entry.getValue() +""+ entry.getKey());
        }
    }
}