package com.learning.java;

/**
 * Created by ejangpa on 1/3/2017.
 */
public class OverrideMain {
    public static void main(String[] args) {
        main(10);
        String  str ;
        //System.out.println(str);
        main("String");
        System.out.println("Hello World!");
    }

    public static void main(int i) {
        System.out.println(i);
    }

    public static void main(String str) {
        System.out.println(str);
    }

}
