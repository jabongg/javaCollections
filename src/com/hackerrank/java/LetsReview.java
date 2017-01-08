package com.hackerrank.java;

import java.util.Scanner;

/**
 * Created by ejangpa on 10/17/2016.
 */
public class LetsReview {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String arr[] = new String[n];
        //String str = scan.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }

        String ss = "";
        for (int i = 0; i < n; i++) {
            String s = arr[i];
            ss = "";
            for (int j = 0; j < s.length(); j++) {

                if (j % 2 == 0) {
                    System.out.print(s.charAt(j));
                } else {
                    ss = ss + s.charAt(j);
                }
            }
            System.out.print(" " + ss);
            System.out.println();
        }

    }
}

