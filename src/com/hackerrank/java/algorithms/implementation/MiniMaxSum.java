package com.hackerrank.java.algorithms.implementation;

/**
 * Created by ejangpa on 2/10/2017.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long sum = a + b + c + d + e;
        long[] sumArray = {a, b, c, d, e};

        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] < min) {
                min = sumArray[i];
            }

            if (sumArray[i] > max) {
                max = sumArray[i];
            }
        }
        System.out.print( (sum - max) + " " + (sum - min));
    }
}
