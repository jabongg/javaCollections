package com.hackerrank.java.algorithms.graphtheory;

/**
 * Created by ejangpa on 2/4/2017.
 */

import java.io.*;
        import java.util.*;

public class JourneyToTheMoon {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int I = scanner.nextInt();

        for (int i = 0; i < I; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
        }
        int possiblePairs = findPossiblePairs(I);
        System.out.println(possiblePairs);
    }

    public static int findPossiblePairs(int I) {
        int possiblePairs = 0;
        for (int i = 1; i <= I; i++) {
            possiblePairs = possiblePairs + (i - 1) * 4;
        }
        return possiblePairs;
    }
}