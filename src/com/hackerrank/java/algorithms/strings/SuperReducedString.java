package com.hackerrank.java.algorithms.strings;

/**
 * Created by ejangpa on 2/20/2017.
 */

        import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class SuperReducedString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String reducedArrayString = findReducedString(str);
        if (reducedArrayString.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(reducedArrayString);
        }
    }

    public static String findReducedString(String str) {
        char[] sampleArray = str.toCharArray();
        int[] countArray = new int[26];
        char[] reducedArray = new char[100];

        int j = 0;

        for (int i = 0; i < sampleArray.length; i++) {
            countArray[sampleArray[i] - 'a']++;
        }

        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] % 2 == 1) {
                reducedArray[j] = (char) (i + 97);
                j++;
            }
        }

        char[] newString = new char[j];

        for (int i = 0; i < j; i++) {
            newString[i] = reducedArray[i];
        }

        String reducedArrayString = new String(newString);
        return reducedArrayString;
    }
}