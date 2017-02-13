package com.hackerrank.java.algorithms.implementation;

/**
 * Created by ejangpa on 2/10/2017.
 */


        import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            boolean isCanceled = isClassCanceled(a, k);         // returns true or false if class is suspended or not.
            if (isCanceled == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean isClassCanceled(int[] a, int k) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                count++;
            }
        }

        if (count >= k) {
            return false;
        } else {
            return true;
        }
    }
}
