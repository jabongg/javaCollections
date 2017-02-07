package com.hackerrank.java.java.introduction;

import java.util.Scanner;

/**
 * Created by ejangpa on 2/4/2017.
 */

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        char[] palindrome = A.toCharArray();
        for (int i = 0; i < palindrome.length / 2; i++) {
            if (palindrome[i] != palindrome[palindrome.length - 1 - i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
