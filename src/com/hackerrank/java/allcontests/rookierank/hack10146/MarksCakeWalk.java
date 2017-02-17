package com.hackerrank.java.allcontests.rookierank.hack10146;

/**
 * Created by ejangpa on 2/14/2017.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class MarksCakeWalk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        // your code goes here
        sort(calories);
        int miles = (int) minimumMiles(calories);
        System.out.println(miles);
        //print(calories);
    }

    public static void print(int[] calories) {
        for (int i = 0; i < calories.length; i++) {
            System.out.println(calories[i]);
        }
    }

    public static void sort(int[] calories) {
        for (int i = 0; i < calories.length; i++) {
            for (int j = i + 1; j < calories.length; j++) {
                if (calories[i] < calories[j]) {
                    int temp = calories[i];
                    calories[i] = calories[j];
                    calories[j] = temp;
                }
            }
        }
    }

    public static  double minimumMiles(int[] calories) {
        double miles = 0;
        for (int i = 0; i < calories.length; i++) {
            miles = miles + calories[i] * Math.pow(2,i);
        }
        return miles;
    }
}
