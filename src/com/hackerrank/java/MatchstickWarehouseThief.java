package com.hackerrank.java;

/**
 * Created by ejangpa on 1/26/2017.
 */
import java.util.*;

public class MatchstickWarehouseThief {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[][] crate = new int[c][2];
        for(int crate_i=0; crate_i < c; crate_i++){
            for(int crate_j=0; crate_j < 2; crate_j++){
                crate[crate_i][crate_j] = in.nextInt();
            }
        }
        // your code goes here
        // your code goes here
        int max = 0; int j = 0;
        for (int crate_i = 0; crate_i < c; crate_i++){
            if (crate[crate_i][1] > max) {
                max = crate[crate_i][1];
                j = crate_i;
            }
        }
        System.out.println(max);
        int sum = 0;
        sum = sum + crate[j][0];
    }
}
