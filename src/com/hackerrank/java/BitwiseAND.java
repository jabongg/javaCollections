package com.hackerrank.java;

/**
 * Created by ejangpa on 1/24/2017.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class BitwiseAND {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();

            // building the array {1 to n};
            int[] arrayA = new int[n];
            for (int i = 0; i < n; i++) {
                arrayA[i] = i + 1;
            }
            int max = getMax(arrayA, n, k);
            System.out.println(max);

        }
    }

    /** getting maximum value less than k */
    public static int getMax(int[] arrayA, int n, int k) {
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int binaryAND = arrayA[i] & arrayA[j];  // bitwise AND

                if (( binaryAND >  max ) && ( binaryAND <  k)) {
                    max = binaryAND;
                }
            }
        }
        return max;
    }
}
