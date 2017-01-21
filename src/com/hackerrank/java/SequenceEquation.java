package com.hackerrank.java;

/**
 * Created by ejangpa on 1/21/2017.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
public class SequenceEquation {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] seqArray = new int[n];
        for (int i = 0; i < n; i++) {
            seqArray[i] = scanner.nextInt();
        }
       // getSeqValue(seqArray); //this method is an accepted one on Hackerrank but time complexity is not order n; i.e. !O(n);
        getLinearOrderY(seqArray); // trying to get O(n) time complexity;
    }
    public static void getLinearOrderY(int[] seqArray) {
        int[] newSecArray = new int[seqArray.length];
        for (int i = 0; i < seqArray.length; i++) {
            newSecArray[seqArray[seqArray[i]]] = i ;
        }
        for (int i = 0; i < seqArray.length; i++) {
            System.out.println(newSecArray);
        }
    }

    public static void getSeqValue(int[] seqArray) {
        int seqLength = seqArray.length;
        int y = 0;
        int flag = 0;
        for (int x = 1; x <= seqLength; x++) {
            for (int i = 0; i < seqLength; i++) {
                if (x == seqArray[i]) {
                    y = checkForY(seqArray, i + 1);
                    System.out.println(y);
                    break;
                }
            }

        }

    }

    public static int checkForY(int[] seqArray, int i) {
        int y = 0;
        int j = 0;
        while(seqArray[j] != i) {
            j++;
        }
        if (seqArray[j] == i) {
            y = j + 1;
        }
        return y;
    }
}
