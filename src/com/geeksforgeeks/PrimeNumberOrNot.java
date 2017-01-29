package com.geeksforgeeks;

import java.util.Scanner;

/**
 * Created by ejangpa on 1/25/2017.
 */
public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }

   static  boolean isPrime(int n) {
        // Corner case
        if (n <= 1) {
            return false;
        }
        // Check from 2 to n-1 O(n) complexity
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
       // Check from 2 to n-1
       for (int i = 2; i <= n /2 ; i++) {
           if (n % i == 0) {
               return false;
           }
       }
       // Check from 2 to n-1 O(root(n));
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
        return true;
    }
}
