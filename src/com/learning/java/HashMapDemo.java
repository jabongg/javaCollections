package com.learning.java; /**
 * Created by ejangpa on 9/28/2016.
 */

import  java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap <String,Integer>(2);
            map.put ("Mike",21);
            map.put ("Miley",18);
            map.put ("Shirley",21);
            map.put ("Romey",32);
            map.put ("Mike2",21);
            map.put ("Miley3",18);
            map.put ("Shirley4",21);

        System.out.print(map.size());
    Iterator itr = map.keySet().iterator();
        while(itr.hasNext()){
            System.out.print(" "+map.get(itr.next()));

        }

        System.out.print(map.keySet()+"\n");
        System.out.print(map.entrySet()+"\n");

    }

    public static class ThreadSimpleDemo {
        public static void main (String args []){
            new ThreadTest("Ebay").start();
            new ThreadTest("Google").start();
            new ThreadTest("Facebook").start();
        }
    }
}
