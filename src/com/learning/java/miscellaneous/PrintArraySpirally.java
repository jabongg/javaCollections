package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 1/13/2017.
 */
public class PrintArraySpirally {
    public static void main(String[] args) {
       int n = 4;
        int m = 4;
        int[][] number = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("Initial Array");
        printArray(number);
        System.out.println("Spiral Array");
        printSpirallyMyCodeSchool(number, n, m);
    }


    /**
     * printSpirally prints array in spiral manner
     * @param number
     */
    static void  printSpirallyMyCodeSchool(int[][] number, int n, int m) {
        int T = 0;
        int R = n - 1;
        int B = m - 1;
        int L = 0;
        int dir = 0;
        while (L <= R && T <= B) {
            if(dir == 0) {
                for (int k = L; k <= R; k++) {
                    System.out.println(number[T][k]);
                }
                T++;
            } else if (dir == 1) {
                for(int k = T; k <= B; k++) {
                    System.out.println(number[k][R]);
                }
                R--;
            } else if (dir == 2) {
                for (int k = R; k >= L; k--) {
                    System.out.println(number[B][k]);
                }
                B--;
            } else if (dir == 3) {
                for (int k = B; k >= T; k--) {
                    System.out.println(number[k][L]);
                }
                L++;
            }
            dir = (dir + 1) % 4;
        }
    }

    /**
     * printArray() prints array Elements
     */
    static  void printArray(int[][] number) {
        for (int i = 0; i < number.length; i++) {
            for(int j = 0; j < number.length; j++) {
                System.out.print(number[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
