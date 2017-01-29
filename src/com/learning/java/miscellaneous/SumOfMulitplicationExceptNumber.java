package com.learning.java.miscellaneous;

import java.util.Scanner;

/**
 * Created by ejangpa on 1/12/2017.
 */
public class SumOfMulitplicationExceptNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        for(int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
        }
        int[] arrayB = new int[n];
        int multiplicationValue = 1;
        for(int i = 0; i < n; i++) {
            multiplicationValue = multiplicationValue * arrayA[i];
        }
        if(multiplicationValue > 0) {
            sumOfProduct(arrayA, arrayB, multiplicationValue);
        } else {
            return;
        }

    }
    static  void sumOfProduct(int[] arrayA, int[] arrayB, int multiplicationValue) {
            for(int i = 0; i < arrayA.length; i++) {
                arrayB[i] = multiplicationValue / arrayA[i];
            }
            printArray(arrayB);
    }
    static void printArray(int[] arrayB) {
        for(int i = 0; i < arrayB.length; i++) {
                System.out.print(arrayB[i] + " ");
        }
        System.out.println();
    }

}
