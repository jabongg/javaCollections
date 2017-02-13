package com.hackerrank.java.algorithms.implementation;

/**
 * Created by ejangpa on 2/10/2017.
 */


        import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int initialTreeHeight = 1;
            int growth = findTreeHeight(n, initialTreeHeight);
            System.out.println(growth);
        }
    }

    static int findTreeHeight(int n, int initialTreeHeight) {
        int growth = initialTreeHeight;
        if (n == 0) {
            return growth;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {                    // growth for spring
                growth = 2 * growth;
            } else {
                growth = growth + 1;             // growth for summer
            }
        }
        return growth;
    }
}

