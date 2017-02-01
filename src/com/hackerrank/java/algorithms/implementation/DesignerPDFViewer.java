package com.hackerrank.java.algorithms.implementation;

/**
 * Created by ejangpa on 1/30/2017.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        char[] wordArray = word.toCharArray();
        int areaHighlighted = findAreaHighlightedRectangle(wordArray, h);
        System.out.println(areaHighlighted);
    }

    public static int findAreaHighlightedRectangle(char[] wordArray, int[] h) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        if (wordArray.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < wordArray.length; i++) {
                int remainder = wordArray[i] % 97;

                if (h[remainder] > max) {
                    max = h[remainder];
                    index = remainder;
                }
            }
            int areaHighlighted = ((wordArray.length * 1) * h[index]);
            return areaHighlighted;
        }

    }
}

