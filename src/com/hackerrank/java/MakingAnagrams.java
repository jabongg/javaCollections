package com.hackerrank.java;

/**
 * Created by ejangpa on 12/16/2016.
 */



import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
public class MakingAnagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    static int numberNeeded(String first, String second) {


        int[]  alpha = new int[26];
        int delete = 0;
        for(int i=0; i<first.length(); i++){
            int index = first.charAt(i) - 'a';
            alpha[index]++;
        }
        for(int i=0; i<second.length(); i++){
            int index = second.charAt(i) - 'a';
            alpha[index]--;
        }
        for(int i=0; i<26; i++){
            delete += Math.abs(alpha[i]);
        }
        return delete;
    }
}
