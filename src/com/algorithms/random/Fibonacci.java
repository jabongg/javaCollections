package com.algorithms.random;

/**
 * Created by ejangpa on 2/16/2017.
 */

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = fibonacci(N);
        System.out.println(result);
    }

    static int fibonacci(int N) {

        if (N == 1 || N == 0) {
            return 1;
        } else {
           return fibonacci(N - 1) + fibonacci(N - 2);
        }
    }
}
