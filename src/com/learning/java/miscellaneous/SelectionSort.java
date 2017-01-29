package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 10/6/2016.
 */
public class SelectionSort {
 // your code goes here
 public static void main(String[] args) {
     int a [] = {16,52,43,31,344,14,89};

     /*
      * Selection sorting is conceptually the most simplest sorting algorithm.
      * This algorithm first finds the smallest element in the array and exchanges
      * it with the element in the first position, then find the
      * second smallest element and exchange it with the element in the second position,
      * and continues in this way until the entire array is sorted.
      */



     for(int i = 0 ; i < a.length; i++){
         int minIndex = i;
         //finding minimum value in the array
         for(int j = i + 1; j < a.length; j++){
             if(a[j] < a[minIndex]){
                 minIndex = j;
            }
         }
         // swap the min element with the a[i]
         int temp;
         temp = a[i];
         a[i] = a[minIndex];
         a[minIndex] = temp;
     }

     for(int i = 0; i < a.length; i++){
         System.out.print("\t" + a[i]);
     }


 }
}



