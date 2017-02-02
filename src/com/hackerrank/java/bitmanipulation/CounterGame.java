package com.hackerrank.java.bitmanipulation;

/**
 * Created by ejangpa on 2/2/2017.
 */

import java.util.*;

public class CounterGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int N = scan.nextInt();

        int count = 0;
        for (int i = 1; i <= T; i++) {
           while (N > 1) {
               boolean isNPowerOf2 = isPowerOf2(N);
               if (isNPowerOf2 == true) {
                   count = getCount(N);
               }
               if (count % 2 == 0) {
                   System.out.println("Richard");
               } else {
                   System.out.println("Louise");
               }
           }
/*         if (count % 2 == 0) {
               System.out.println("Richard");
           } else {
               System.out.println("Louise");
           } */
        }
    }

    static boolean isPowerOf2(int N) {
        boolean isNPowerOf2 = false;
        while (N >= 1) {
            if (N == 2) {
                isNPowerOf2 = true;
                break;
            }
            N = N / 2;
        }
        return isNPowerOf2;
    }


    static int getCount(int N) {
        int count = 0;
        boolean isNPowerOf2 = false;
        while (N >= 1) {
            if (N == 2) {
                isNPowerOf2 = true;
                count++;
                break;
            }
            if (isNPowerOf2 == false) {
                N = N / 2;
                count++;
            }
        }
        return count;
    }
}