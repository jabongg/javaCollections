package com.hackerrank.java;

/**
 * Created by ejangpa on 1/10/2017.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class BoatTrips {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
        int[] p = new int[n];
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }

        boolean canTravel = canPerformTripNoMoreThanGivenBoats(p, m, c);
        if(canTravel == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean canPerformTripNoMoreThanGivenBoats(int[] p, int m, int c) {
        boolean flag = false;
        for(int i = 0; i < p.length; i++) {
            if(p[i] <=  m * c) {
                if(i == p.length - 1) {
                    flag = true;
                }
            } else {
                break;
            }
        }
        if(flag == true) {
            return true;
        } else {
            return false;
        }
    }
}
