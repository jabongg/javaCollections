package com.hackerrank.java;

/**
 * Created by ejangpa on 11/11/2016.
 */

import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;
public class MinMaxSum {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();



        long a[] = {f,b,c,d,e};
        boolean isElementPostive = true;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < 1) {
                isElementPostive = false;
                break;
            }
        }
        if(isElementPostive) {
            long min = min(a);
            long max = max(a);
            sum(a, min , max);
        }
        else {
            System.out.print("some array element is < 1");
        }


    }
    //

    //

    // getting sum min and max
    static void sum(long a[], long min, long max) {
        long sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        long maxSum = sum - min;
        long minSum = sum - max;
        System.out.println(minSum + " " + maxSum);
    }
    // getting min value
    static long min(long a[]) {
        long min = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    //getting max value
    static  long max(long a[]) {
        long max = Integer.MIN_VALUE ;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}

