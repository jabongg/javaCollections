package com.datastructures.sortingalgorithms;

/**
 * Created by ejangpa on 1/15/2017.
 */

public class SelectionSort {

    public static void  main(String[] args) {
        int[] bubbleArray = {1, 32, 3, 43, 2, 89, 97, 79, 4};
        /**
         * The algorithm works by selecting the smallest unsorted item and then swapping
         * it with the item in the next position to be filled.
         * The selection sort works as follows: you look through the entire array for the smallest element,
         * once you find it you swap it (the smallest element) with the first element of the array.
         * Then you look for the smallest element in the remaining array (an array without the first element)
         * and swap it with the second element. Then you look for the smallest
         * element in the remaining array (an array without first and second elements) and swap it with the third element, and so on.
         * @param bubbleArray
         */

        for (int i = 0; i < bubbleArray.length - 1; i++) {
           int min = i;
            for (int j = i + 1; j < bubbleArray.length; j++) {
                if ( bubbleArray[j] < bubbleArray[min]) {
                    min = j;
                }
            }
            int temp = bubbleArray[i];
            bubbleArray[i] = bubbleArray[min];
            bubbleArray[min] = temp;
        }

        for (int i = 0; i < bubbleArray.length; i++) {
            System.out.println(bubbleArray[i]);
        }
    }
}
