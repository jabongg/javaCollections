package com.learning.java.library;

/**
 * Created by ejangpa on 1/12/2017.
 */
public class ArrayRotationLeftBy90Degree {
    public static void main(String[] args) {
        int[][] arrayA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arrayB = new int[3][3];
        System.out.println("Initial Array :");
        printArray(arrayA);
        System.out.println();
        System.out.println("Left Rotated Array");

            rotateArrayAntiClockwise(arrayA, arrayB);
            int[][] arrayC = new int[3][3];
        System.out.println("Array Rotated Again :");
            rotateArrayAntiClockwise(arrayB, arrayC);

        System.out.println("Right Rotated Array");

        rotateArrayClockwise(arrayA, arrayB);

    }
    static void rotateArrayAntiClockwise(int[][] arrayA, int[][] arrayB) {
        for(int i = 0; i < arrayA.length; i++) {
            for(int j = 0 ; j <arrayA.length; j++) {
                int k = i;
                int l = (arrayA.length - 1) - j;
                arrayB[l][k] = arrayA[i][j];
            }
        }
        printArray(arrayB);
    }

    static void rotateArrayClockwise(int[][] arrayA, int[][] arrayB) {
        for(int i = 0; i < arrayA.length; i++) {
            for(int j = 0 ; j <arrayA.length; j++) {
                int k = (arrayA.length - 1 ) - i;
                int l =  j;
                arrayB[l][k] = arrayA[i][j];
            }
        }
        printArray(arrayB);
    }

    static void printArray(int[][] arrayB) {
        for(int i = 0; i < arrayB.length; i++) {
            for(int j = 0; j < arrayB.length; j++) {
                System.out.print(arrayB[i][j] + " ");
            }
            System.out.println();
        }
    }
}