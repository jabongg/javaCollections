package com.hackerrank.java;

/**
 * Created by ejangpa on 12/30/2016.
 */
import java.util.Scanner;

public class WeightedMean {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] X = new int[N];
        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            W[i] = scan.nextInt();
        }
        int avg = weightedMean(X, W, N);
        System.out.println(avg);
    }
    static int weightedMean(int[] X, int[] W, int N) {
        int sumofMultiplicationTwoArrayElements = 0;
        int sumOfArrayWElements = 0;
        int avg;
        for(int i = 0; i < N; i++) {
            sumofMultiplicationTwoArrayElements = sumofMultiplicationTwoArrayElements + X[i] * W[i];
        }

        for(int j = 0; j < N; j++) {
            sumOfArrayWElements = sumOfArrayWElements + W[j];
        }

        avg = sumofMultiplicationTwoArrayElements / sumOfArrayWElements;
        return avg;
    }
}
