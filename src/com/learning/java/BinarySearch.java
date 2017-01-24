package com.learning.java;

/**
 * Created by ejangpa on 1/13/2017.
 */
public class BinarySearch {
    public int binarySearch(int[] inputArr, int key) {
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch mbs = new BinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,902,123};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
    }
}
