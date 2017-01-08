package com.leetcode;

import java.util.Scanner;
/**
 * Created by ejangpa on 12/19/2016.
 */
public class PerfectSquares {
   static public int numSquares(int n) {
        int count = 0; int sum = 0;

       if (n == 1)
           return 1;
        for(int i = 2; i < n; i++) {
            while(sum < n){
                sum = sum + i*i;
                count++;
                continue;
            }

        }
        return count;

    }

    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int number = numSquares(n);
        System.out.println(number);
    }
}