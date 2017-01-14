package com.learning.java;

/**
 * Created by ejangpa on 1/12/2017.
 */
public class InPlaceArrayRotation {
    public static void main(String[] args) {
        int[][] arrayA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Initial array");
        printArray(arrayA);
        System.out.println("After Left rotation");
        int[][] mat = inPlaceArrayRotation(arrayA);
        printArray(mat);
    }
    static int[][] inPlaceArrayRotation(int[][] mat) {
        int N = mat.length;
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++)
        {
            // Consider elements in group of 4 in current square
            for (int y = x; y < N-x-1; y++)
            {
                int temp = mat[x][y];                       // store current cell in temp variable
                mat[x][y] = mat[y][N-1-x];                  // move values from top right to top left
                mat[y][N-1-x] = mat[N-1-x][N-1-y];          // move values from bottom right to top right
                mat[N-1-x][N-1-y] = mat[N-1-y][x];          // move values from bottom left to bottom right
                mat[N-1-y][x] = temp;                       // assign temp to bottom left
            }
        }
       return (mat);

    }

    static void printArray(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


}

