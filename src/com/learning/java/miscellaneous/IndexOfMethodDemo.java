package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 1/24/2017.
 */
public class IndexOfMethodDemo {
    public static void main(String[] args) {
        String str = "https://www.writealone.com/";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.indexOf("com"));
        System.out.println(str.indexOf('h'));
        System.out.println(str.lastIndexOf('/'));
    }
}
