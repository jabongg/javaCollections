package com.learning.java.strings;

import com.learning.java.oops.Bicycle;

/**
 * Created by ejangpa on 2/4/2017.
 */
public class ArrayCopyDemo extends Bicycle {
    public static void main(String[] args) {
            int arr1[] = { 0, 1, 2, 3, 4, 5 };
            int arr2[] = { 5, 10, 20, 30, 40, 50 };

        System.out.println();
                   // b.setCadence(4);
            /* static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) */
            // copies an array from the specified source array
            System.arraycopy(arr1, 3, arr2, 2, 3);
        System.out.println(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

