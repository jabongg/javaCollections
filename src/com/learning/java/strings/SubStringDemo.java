package com.learning.java.strings;

/**
 * Created by ejangpa on 2/4/2017.
 */
public class SubStringDemo {
    public static void main(String[] args) {
        String str = "welcometowritealone";
        System.out.println(str.substring(6, 10));  //Note: [startIndex, endIndex) i.e. inclusive startIndex and exclusive endIndex.
    }
}
