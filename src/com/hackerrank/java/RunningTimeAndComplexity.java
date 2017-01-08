package com.hackerrank.java;

/**
 * Created by ejangpa on 1/8/2017.
 */

import java.util.*;

public class RunningTimeAndComplexity {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            boolean isPrimeNumber = isPrime(n);
            if(isPrimeNumber == true) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }

    static boolean isPrime(int n) {
        int flag = 0;
        for(int i = 2;i <= Math.sqrt(n); i++){
            if(n % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0)  {
            return true;
        } else {
            return false;
        }
    }
}
