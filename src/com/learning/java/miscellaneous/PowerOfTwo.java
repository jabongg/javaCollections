package com.learning.java.miscellaneous;

import java.util.Scanner;

/**
 * Created by ejangpa on 1/13/2017.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        powerOfTwo(n);
    }
    static void powerOfTwo(int n) {
        int flag = 0;
        while ( n > 1) {
            int m = n;
            n = n / 2;
            if((n == 1) && m % 2 == 0) {
                    flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("power of two");
        } else {
            System.out.println("not power of two");
        }

    }
}
