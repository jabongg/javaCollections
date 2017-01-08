package com.hackerrank.java;

import java.util.Scanner;
/**
 * Created by ejangpa on 12/13/2016.
 */
public class LargestPrimeFactor {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            primeFactors(n);
        }
    }

    static void primeFactors(long num) {
        long primePrev = 1;
        for (long i = 2; i <= num; i++) {
            if ( isPrime(i) ) {
                //System.out.print(" " + i);
                if(num % i == 0 ) {
                    if(primePrev < i ) {
                        long maxPrime = 0;
                        primePrev = i;
                        maxPrime = primePrev;
                       // System.out.print(maxPrime + " ");
                    }

                }
            }
        }
        System.out.print(primePrev + " ");
    }

    static public boolean isPrime(long num) {
        if ( num < 2 ) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ( num % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}
