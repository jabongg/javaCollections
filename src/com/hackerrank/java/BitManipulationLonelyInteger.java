package com.hackerrank.java;

/**
 * Created by ejangpa on 1/4/2017.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class BitManipulationLonelyInteger {
    public static int lonelyInteger(int[] a) {
        int returnedUniqueElement = 0;

        if(a.length == 1) {
            return a[0];
        }
        for(int i = 0; i < a.length - 1 ; i++) {
             a[i + 1] = a[i] ^ a[i + 1];
            if(i == a.length - 2) {
                //returnedUniqueElement = uniqueElement;
                return  a[i + 1];
            }
        }
        return returnedUniqueElement;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
