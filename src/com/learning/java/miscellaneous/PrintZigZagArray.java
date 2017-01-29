package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 1/7/2017.
 */
public class PrintZigZagArray {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] arrayElements = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(arrayElements.length);
        System.out.println(arrayElements[0]);
        System.out.println(arrayElements[1][1]);
        System.out.println(arrayElements[2][2]);
    }
}
