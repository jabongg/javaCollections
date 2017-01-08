package com.hackerrank.java;

/**
 * Created by ejangpa on 12/8/2016.
 */




import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class SparseArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String stringArrayA [] = new String [N];
        for(int i = 0; i < N; i++) {
            stringArrayA [i] = scan.next();
        }
        int Q = scan.nextInt();
        String queryStringArrayB [] = new String[Q];
        for(int i = 0; i < Q; i++) {
            queryStringArrayB [i] = scan.next();
        }
        //check occurence count of query string into the string array
        for(int i = 0; i < Q; i++) {
            String queryString = queryStringArrayB[i];
            int count = occurenceCount(queryString , stringArrayA);
            System.out.println(count);
        }


    }

    static int occurenceCount(String  queryString , String [] stringArrayA) {
        int count = 0;
        int N = stringArrayA.length;
        for(int j = 0; j < N; j++ ) {
            if(queryString.equals(stringArrayA[j])) {
                count++;
            }
        }
        return count;
    }
}