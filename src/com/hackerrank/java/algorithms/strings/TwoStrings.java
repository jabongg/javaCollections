package com.hackerrank.algorithms;


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        String a;
        String b;
        for (int i = 0; i < p; i++) {
            a = scan.next();
            b = scan.next();
            
            boolean hasCommonSubString = checkForCommonSubString(a, b);
            if (hasCommonSubString) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
            /*
            String result = (hasCommonSubString == true)
                ? "YES"
                : "NO"; */
        }    
    }
    
    private static boolean checkForCommonSubString(String a, String b) {
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        char[] alphabet = new char[26];
        
        boolean hasCommonSubString = false;
        for (int i = 0; i < arrayA.length; i++) {
            alphabet[arrayA[i] - 'a'] = arrayA[i];
        }
        
        for (int i = 0; i < arrayB.length; i++) {
            if ((alphabet[arrayB[i] - 'a']) == arrayB[i]) {
                hasCommonSubString = true;
                break;
            }
        }
        
        return hasCommonSubString;
    }
}