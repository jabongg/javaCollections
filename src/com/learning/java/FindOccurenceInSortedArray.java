package com.learning.java;

import java.util.ArrayList;

/**
 * Created by ejangpa on 1/13/2017.
 */
public class FindOccurenceInSortedArray {
    public static void main(String[] args) {
        int[] number = {
          1, 1, 3, 3, 3, 5, 5, 5, 5, 5, 7, 8, 8, 8, 9, 9, 11
        };
        int[] numberUnique = new int[number.length];
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] != number[i + 1]) {
                 count = 0;
                numberUnique[i] = number[i];
            }
            count++;
            al.add(count);
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
