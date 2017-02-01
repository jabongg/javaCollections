package com.learning.java.oops;

/**
 * Created by ejangpa on 1/31/2017.
 */
public class StringEqualsDemo {
    public static void main(String[] args) {
        StringEqualsDemo a = new StringEqualsDemo();
        System.out.println(a.equals(null));

        String s1 = "Hello";
        String s2 = new String("Hello");
        if (s1 != s2) {
            System.out.println("true");
            System.out.println(s1 + " " + s2);
        }
        if (s1.equals(s2)) {
            System.out.println("equalstrue");
        }
    }
}
