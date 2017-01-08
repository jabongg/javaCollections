package com.hackerrank.java;

import java.util.Scanner;

/**
 * Created by ejangpa on 11/11/2016.
 */
public class ShiftArrayElement {
       public static void main(String args []) {
           //int arrayA [] = {1,2,5,7,22,25,91};


           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int k = in.nextInt();
           int q = in.nextInt();
           int[] a = new int[n];
           for (int a_i = 0; a_i < n; a_i++) {
               a[a_i] = in.nextInt();
           }

/*
         int shiftElementsByPlaces = k % n ;
             for(int i = 0; i < shiftElementsByPlaces; i++) {
                        shiftArrayElement(a);
             }


            for(int a0 = 0; a0 < q; a0++) {
               int m = in.nextInt();
               System.out.println(a[m]);
            }

*/

           for (int i = 0; i < q; i++) {
               int rot = k % n;
               int idx = in.nextInt();
               if (idx - rot >= 0)
                   System.out.println(a[idx - rot]);
               else
                   System.out.println(a[idx - rot + a.length]);
           }
       }
                /*
                * Sample Input

                3 2 3
                1 2 3
                0
                1
                2
                Sample Output

                2
                3
                1

                * */

           //printArrayElements(arrayB);
          // System.out.println();


   // printing array elements
    static void printArrayElements(int arrayB []) {
        for(int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + "\t");
        }
    }
// shifting array elements by 1 place to right without using shift operator
    static  int[] shiftArrayElement(int arrayA[]) {
        int temp1 = arrayA[0];
        int temp2;
        for(int i = 0; i < arrayA.length -1; i++) {
            temp2 = arrayA[i + 1];
            arrayA[i + 1] = temp1;
            temp1 = temp2;
            if(i == arrayA.length - 2 )
                arrayA[0] = temp2;
        }
        return arrayA;
    }
}
