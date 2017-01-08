package com.careercup;

/**
 * Created by ejangpa on 11/8/2016.
 */
import java.util.Scanner;
import java.lang.*;

public class ArrayIntersection {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //define sorted arrays


        int arrayA[] = {12,15,18,21,25};
        int arrayB[] = {16,18,21,24,27,31,43};
        //calling function for getting intersection on unsorted arrays
        // unsortedArray(arrayA, arrayB ,arrayA.length, arrayB.length);

        //calling function for getting intersection on sorted arrays
        sortedArray(arrayA, arrayB, arrayA.length, arrayB.length);
    }


    //function for getting intersection on unsorted arrays
    static void unsortedArray(int arrayA[], int arrayB[], int arrayALength, int arrayBLength) {
        int i, j;
        for (i = 0; i < arrayALength; i++) {
            for (j = 0; j < arrayBLength; j++) {
                if (arrayA[i] == arrayB[j]) {
                    System.out.println(arrayA[i]);
                }

            }
        }
    }


    //defined sorted arrays
    //int arrayA[] = {1, 7, 9, 11, 12, 13, 17, 20};
   // int arrayB[] = {3, 5, 9, 13, 16, 20, 25, 28};
    static void sortedArray(int arrayA[], int arrayB[], int arrayALength, int arrayBLength) {
        int i, j, k = 0, itr = 0;

        // handling boundary conditions
        if(arrayALength != 0 && arrayBLength != 0){
            if(arrayA[arrayALength - 1 ] < arrayB[0]){
                System.out.println("No intersections");
            }
        }

        if(arrayALength == 0 ){
            System.out.println("Empty Array A");
        }

        if(arrayBLength == 0 ){
            System.out.println("Empty Array B");
        }
        if((arrayALength == 0 && arrayBLength != 0) || (arrayBLength == 0 && arrayALength != 0)){
            System.out.println("No intersection");
        }
// handling general cases
        for (i = 0; i < arrayALength; i++) {
            for (j = k; j < arrayBLength; j++) {
                itr++;
                if (arrayA[i] < arrayB[j]) {
                        k = j;
                    break;
                }
               /* if (arrayA[i] > arrayB[j]) {
                    ;
                }*/
                if (arrayA[i] == arrayB[j]) {
                    System.out.println(arrayA[i]);
                }
            }
        }
        System.out.println("\n" + itr);
    }
}