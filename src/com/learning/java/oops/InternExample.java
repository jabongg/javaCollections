package com.learning.java.oops;

/**
 * Created by ejangpa on 1/31/2017.
 */
public class InternExample {
    public static void main(String[] args) {
        String s1 = new String("hello");
        //String s2 = s1.intern();
        //String s3 = s1.intern();
        String s5 = s1.intern();
        String s6 = new String("hello");
        System.out.println(s6 == s1);
        System.out.println(s6 == s5);
        //System.out.println(s5 == s1);

    }
}
