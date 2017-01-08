package com.hackerrank.java;

/**
 * Created by ejangpa on 10/3/2016.
 */
import java.util.*;
import java.util.Scanner;

class MarkAndToys {
    private int array [];
    private int length;

    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();                    //number of toys available
        int K = in.nextInt();                    //Available money in $
        int price [] = new int [N];
        for (int i = 0; i < N; i++){             // prices of toys
            price [i] = in.nextInt();
        }
        /*
            INPUT :
            7 50
            1 12 5 111 200 1000 10
         */
        List <Integer> list = new ArrayList<Integer>(10000);
        int sum = 0;

// using Quick sort
        MarkAndToys markAndToys = new MarkAndToys();
        markAndToys.sort(price);



//using bubble sort
/*
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (price[j] > price[j + 1]) {
                    int temp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = temp;
                }
            }
        }
*/

        for(int i = 0; i < N; i++){
            if(price[i] <= K  && sum + price[i] <= K){
                list.add(price[i]);
                sum = sum + price[i];
                //System.out.println(price[i]);
            }
        }
        System.out.print(list.size());
    }



    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }


    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}