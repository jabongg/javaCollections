package com.leetcode;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by ejangpa on 1/26/2017.
 */

public class PowerMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double powerValue = myPow(x, n);
        System.out.println(powerValue);
       // System.out.println(Math.sqrt(-4));

    }
    public static double myPow(double x, int n) {
        double powerValue = 1;
        int modN = 0;
        if (n < 0) {
            modN = -n;
        } else {
            modN = n;
        }
        int flag = 0;
        for (int i = 1; i <= modN; i++) {
            if (n < 0) {
                powerValue =  (powerValue * x);
                flag = 1;
            } else {
                powerValue = powerValue * x;
            }
        }
        if (flag == 1) {
            return  1 / powerValue;
        } else {
            return powerValue;
        }
    }
}