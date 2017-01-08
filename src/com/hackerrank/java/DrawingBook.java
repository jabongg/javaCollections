package com.hackerrank.java;

/**
 * Created by ejangpa on 12/20/2016.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here

        int[] book = new int[n];
        for (int i = 0; i < n; i++) {
            book[i] = i + 1;
        }
        int minPageTurns;
        minPageTurns = findingMinimumPageTurns(n, p, book);
        System.out.println(minPageTurns);
    }

    static int findingMinimumPageTurns(int n, int p, int[] book) {
        int countFront = 0;
        int countBack = 0;
        int i = 0; int j = 0;
        if(p%2 == 0) {
             i = 2;

            if(n%2 == 0) {
                j = n - 1;
            }
            else {
                j = n - 2;
            }

        }
        else {


            if(n%2 == 0) {
                i = 1;
                j = n - 2;
            }
            else {
                i = 0;
                j = n - 1 ;
            }
        }

        for (int k = i , l = j ; k <= l; k = k + 2, l  = l - 2) {
            if (book[l] == p) {
                break;
            } else {
                countBack++;
            }
            if (book[k] == p) {
                break;
            } else {
                countFront++;
            }
        }
            if (countFront <= countBack) {
                return countFront;
            } else {
                return countBack;
            }

    }

}
