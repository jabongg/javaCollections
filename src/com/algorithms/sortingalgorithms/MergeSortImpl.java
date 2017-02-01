package com.algorithms.sortingalgorithms;

/**
 * Created by ejangpa on 1/31/2017.
 */

public class MergeSortImpl {
    public static void main(String[] args) {
        int[] A = {12, 4, 3, 46, 23, 98, 78, 65};
        MergeSortImpl mergeObj = new MergeSortImpl();
        mergeObj.printElements(A);
        mergeObj.mergeSort(A);
        mergeObj.printElements(A);
    }

    /**
     * This method prints array elements
     *
     */
    public void printElements(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    /**
     * This method sorts the elements of the array
     *
     */
    public void mergeSort(int[] A) {

        int n = A.length;

        //setting for base condition
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = A[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = A[i];
        }

        // recursive calls
        mergeSort(left);
        mergeSort(right);
        merge(A, left, right);
    }

    /**
     * This method performs the merge operation of Left half (L) and right half (R) of the array A.
     * @param A
     * @param L
     * @param R
     */
    public void merge(int[] A, int[] L, int[] R) {
        int nL = L.length;
        int rL = R.length;

        int i = 0;  // i points to 0th index in array L
        int j = 0;  // j points to 0th index in array R
        int k = 0;  // k points to 0th index in array A

        while (i < nL && j < rL) {
            if (L[i] < R[j]) {
                A[k] = L[i];
                i = i + 1;
            } else {
                A[k] = R[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while (i < nL) {  /* if array right half i.e. R is exausted , then simply copy elements to array A*/
            A[k] = L[i];
            i = i + 1;
            k = k + 1;
        }

        while (j < rL) {  /* if array left half i.e. L is exausted , then simply copy elements to array A*/
            A[k] = R[j];
            j = j + 1;
            k = k + 1;
        }
    }
}