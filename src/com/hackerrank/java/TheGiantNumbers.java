package com.hackerrank.java;

import java.util.Scanner;

/**
 * Created by ejangpa on 11/12/2016.
 */

public class TheGiantNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numbers [] = new int[n];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int q = scanner.nextInt(); //queries
        for(int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int k  = scanner.nextInt();
            int count = 0;
            for(int j = 0; j < numbers.length; j++) {
               boolean isPrime =  checkPrime(x);

                if(x % numbers[j] == 0) {
                    count++;
                }
            }
            if(count >= k) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }
    }

    static  boolean checkPrime( int n) {
        //checks whether an int is prime or not.

            //check if n is a multiple of 2
            if (n%2==0) return false;
            //if not, then just check the odds
            for(int i=3;i*i<=n;i+=2) {
                if(n%i==0)
                    return false;
            }
            return true;
    }

}
