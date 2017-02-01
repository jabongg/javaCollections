package com.hackerrank.java.algorithms.implementation;

/**
 * Created by ejangpa on 1/30/2017.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        boolean isLandAtSameLocation = ifLandAtSameLocation(x1, v1, x2, v2);
        if (isLandAtSameLocation == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean ifLandAtSameLocation(int x1, int v1, int x2, int v2)  {
        if (v1 < v2) {
            return false;
        } else {
            int sum1 = x1;
            int sum2 = x2;
            while (sum1 < sum2) {
                sum1 = sum1 + v1; // 0 3 4 2 // 0 3 6 9 12
                sum2 = sum2 + v2;            // 4 6 8 10 12
                if (sum1 == sum2) {
                    return true;
                }
            }
            return false;
        }
    }
}
