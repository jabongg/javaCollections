package com.hackerrank.java.java.introduction;

/**
 * Created by ejangpa on 2/4/2017.
 */

        import java.io.*;
        import java.util.*;
        import java.*;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) < 0 ?"No":"Yes");
        System.out.print(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}
