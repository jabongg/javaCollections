package com.learning.java;

import java.util.Scanner;

/**
 * Created by ejangpa on 10/3/2016.
 */
public class PartitionQuickSort {
    public static void main (String args []){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A [] = new int[N] ;

        for(int i = 0; i < N ; i++){            // taking input into Array A[]
            A[i] = scan.nextInt();
        }

        int r = N - 1;
        int p = 1;

// quickSort algorithm
        int q = 0;

      //  quickSort(A, p, r);
      //  display(A,q);
        q = partition (A, p , r);
        display(A,q);
    }

    public static int partition(int A[], int p, int r){
        int x = A[r];
        int i = p - 1;
        for( int j = p; j <= r - 1; j++) {
            if(A[j] <= x){
                i = i + 1;
                exchange(A, i, j);
            }
        }
        exchange(A, i+1 , r);
        return i+1;
    }

   public static int [] exchange(int A[], int i, int j){
       int temp ;
       temp = A[i];
       A[i] = A[j];
       A[j] = temp;
       return A;
   }

    public static void display(int A [], int pivot){
        for( int i = 0; i < A.length; i++){
            System.out.print(A[i] + "\t");
        }

        System.out.println(pivot);
    }




    public  static int [] quickSort(int A [], int p, int r){
        int q = 0;
        if (p < r){
            q = partition(A, p, r);
        }
        quickSort(A, p, q - 1);
        quickSort(A, q + 1, r);
        return A;
    }
}
