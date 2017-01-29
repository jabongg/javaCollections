package com.learning.java.miscellaneous;
import java.util.Scanner;

/**
 * Created by ejangpa on 10/17/2016.
 */
public class Matrix {

    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        String arr[]= new String[n];
        for(int i=0;i<n;i++){
            arr[i]="";
        }
        int index=0;
        int i = 1;
        while(index<n) {
            for (; i < n * n; i++) {
                if (i % n == 0) break;
                arr[index] = arr[index] + i + "*";

            }
            index++;
        }

        int start=0;
        int end=n-1;
        for(int k=0;k<n;k++){
            if(k%2 == 1) {
                System.out.print(arr[end]);
                end = end - 1;
            }
        }




    }
}
