package com.algorithms.sortingalgorithms;

/**
 * Created by ejangpa on 2/21/2017.
 */
public class QuickSortAlgorithm {

    public static void main(String[] args) {
        int[] A = { 123, 3, 9, 89, 98,234,  1/*, 663, 345, 31, 99*/};
        int start = 0;
        int end = A.length - 1;
        printArray(A);
        System.out.println();
        quickSort(A, start, end);
        printArray(A);
    }

    public static void quickSort(int[] A, int start, int end) {
        if (start < end) {
            int pIndex = partition(A, start, end);
            quickSort(A, start, pIndex - 1);
            quickSort(A, pIndex + 1, end);
        }
    }

    // partition logic ... heart (<3) of quickSort
    public static  int partition(int[] A, int start, int end) {
        int pivot = A[end];
        int pIndex = start;
        for (int i = 0; i < end; i++) {
            if (A[i] <= pivot) {
                swap(A, i, pIndex);
                pIndex++;
            }
        }
        swap(A, pIndex, end);
        return pIndex;
    }

    public static void swap(int[] A, int i,int pIndex) {
        int temp = A[i];
        A[i] = A[pIndex];
        A[pIndex] = temp;
    }

    public static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}