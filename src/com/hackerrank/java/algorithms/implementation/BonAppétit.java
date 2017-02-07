package com.hackerrank.java.algorithms.implementation;

/**
 * Created by ejangpa on 2/6/2017.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class BonAppétit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int bCharged = scanner.nextInt();
        int moneyReturnedToAnna = calMoneyExtraCharged(c, k, bCharged);
        if (moneyReturnedToAnna == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(moneyReturnedToAnna);
        }

    }

    public static int calMoneyExtraCharged(int[] c, int k, int bCharged) {
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum = sum + c[i];
        }

        int sumExcludingNotEaten = sum - c[k]; // sum excluding food Anna didn't eat

        int bActual = sumExcludingNotEaten / 2; // calculating share of each
        int moneyReturnedToAnna = bCharged - bActual;

        return moneyReturnedToAnna;
    }
}