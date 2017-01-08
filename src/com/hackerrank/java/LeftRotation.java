package com.hackerrank.java;

import java.util.*;


/**
 * Created by ejangpa on 10/1/2016.
 */
public class LeftRotation {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        for(int i = 0; i < k; i++){
            int temp;
            temp = a[0];
            for (int j = 0; j < n-1; j++) {
                a[j] = a[j+1];   //getting here ArrayIndexOutOfBoundException
            }
            a[n-1] = temp;
        }
        return a;
    }
}
