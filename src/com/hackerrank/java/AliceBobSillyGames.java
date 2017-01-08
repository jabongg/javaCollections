package com.hackerrank.java;

/**
 * Created by ejangpa on 12/13/2016.
 */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AliceBobSillyGames {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            // your code goes here
            getSetArray(n);
        }
    }
    static void getSetArray(int n) {
        int [] numberSet = new int[n];

        for(int i = 1; i <= n; i++) {
            numberSet[i-1] = i;
        }

        int flag = 0;
        for(int i = 2; i <= n; i++) {

            if(isPrime(i)) {
               /* System.out.print(i +" ");*/
                int k = 1;
                while(k <= n) {
                    if(i*k - 1 < n) {
                        numberSet[i*k - 1] = 0;
                    }
                    k++;
                    //k = k*i;
                }
                flag++;
            }
        }


        if(flag % 2 == 0) {
            System.out.println("Bob");
        }
        else {
            System.out.println("Alice");
        }

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
