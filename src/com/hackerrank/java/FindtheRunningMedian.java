package com.hackerrank.java;

/**
 * Created by ejangpa on 1/19/2017.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class FindtheRunningMedian {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            list.add(in.nextInt());
            double median = evaluateRunningMedian(list);
            System.out.println(median);
        }

    }
    static double evaluateRunningMedian(ArrayList<Integer> list) {
        Collections.sort(list);
        double median = 0;
        if (list.size() == 1) {
            median = list.get(0);
        } else {
            int sizeList = list.size();
            if (sizeList % 2 == 0) {
                double midElementsSum = list.get(((sizeList) / 2) - 1)
                        + list.get(((sizeList) / 2));
                median = midElementsSum / 2;
            } else {
                median = list.get(((sizeList) / 2));
            }
        }
        return median;
    }
}
