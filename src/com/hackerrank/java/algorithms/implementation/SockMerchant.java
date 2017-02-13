package com.hackerrank.java.algorithms.implementation;

/**
 * Created by ejangpa on 2/10/2017.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        // sort the array
        bubbleSort(c);

        //now search for pairs
        int count = findMatchingPairs(c);
        System.out.println(count);
    }

    // finds matching pairs

    static int findMatchingPairs(int[] c) {
        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                count++;
                i = i + 1;  // if pairs found, incement for searching next pair.
            }
        }
        return count;
    }

    // sorts the array
    static void bubbleSort(int[] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[j];
                    c[j] = c[i];
                    c[i] = temp;
                }
            }
        }
    }
}