package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 1/20/2017.
 */
public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str = "Here is a writealone wrider";
        System.out.println(str.replace("er","xxx"));
        System.out.println(str.replaceFirst("er","zx"));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.replaceAll("er","zx"));
    }
}