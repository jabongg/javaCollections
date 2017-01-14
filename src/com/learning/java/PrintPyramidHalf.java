package com.learning.java;

/**
 * Created by ejangpa on 1/12/2017.
 */
public class PrintPyramidHalf {
    public static void main(String[] args) {
        int n = 6;
        printPyramid1(n);
        System.out.println();
        printPyramid2(n);
        System.out.println();
        printPyramid3(n);
    }
    static void printPyramid1(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void printPyramid2(int n) {
        for(int i = 0; i < n; i++) {
            int temp = 0;
            for(int j = 1; j < (n - i); j++) {
                System.out.print(' ');
                temp = j;
            }
            for(int k = temp ; k < n; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void printPyramid3(int n) {
        for(int i = 0; i < n; i++) {
            int temp = 0;
            for(int j = 1; j < (n - i); j++) {
                System.out.print(' ');
                temp = j;
            }
            for(int k = temp ; k < n; k++) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }

    }
}
