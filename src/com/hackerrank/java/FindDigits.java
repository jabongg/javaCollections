package com.hackerrank.java;

/**
 * Created by ejangpa on 1/3/2017.
 *
 */
        import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int count = getCount(n);
            System.out.println(count);
        }
    }
    static int getCount(int n) {
        int number = n;
        int remainder ;
        int count = 0;
        while(n > 0) {
                remainder = n % 10;
                if(remainder == 0) {
                    n = n / 10;
                    continue;
                }
                if(number % remainder == 0) {
                    count++;
                }
                n = n / 10;
        }
        return count;
    }
}
