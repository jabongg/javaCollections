package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 1/23/2017.
 */
public class EqualsMehodDemo {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        String o = "hello";
        Object s = o;
        if (o.equals(s)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        if (s.equals(o)) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
