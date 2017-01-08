package com.hackerrank.java;

/**
 * Created by ejangpa on 12/8/2016.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int sumDiagPrimary = 0;
        int sumDiagSecondary = 0;
      //  int j = n;
        for(int i = 0; i < n; i++) {
            sumDiagPrimary = sumDiagPrimary + a[i][i];

        }

        for(int i = 0,j = n-1; i < n ; i++, j--) {
            sumDiagSecondary = sumDiagSecondary + a[i][j];
        }

        int diagDiff = sumDiagPrimary - sumDiagSecondary;
        if(diagDiff < 0) {
            System.out.println(-diagDiff);
        }
        else {
            System.out.println(diagDiff);
        }

    }
}
