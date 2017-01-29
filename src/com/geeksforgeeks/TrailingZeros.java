package com.geeksforgeeks;
/**
 * Created by ejangpa on 1/25/2017.
 */
  // program to count trailing zeros in factorial
 import java.util.Scanner;
public class TrailingZeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();       // suppose we want to find trailing zeroes in factorial of n = 100
        int countTrailingZeros = countTrailingZerosInFactorialOf(n); // calculating number of zeros
        System.out.println(countTrailingZeros);
    }
    public static int countTrailingZerosInFactorialOf(int n) {
        int countTrailingZeros = 0;
        // Keep dividing n by powers of 5 and update count
        for (int i = 5; n / i >= 1; i = i * 5) {
            countTrailingZeros = countTrailingZeros + (n / i);
        }
        return countTrailingZeros;
    }
}
