package com.hackerrank.java;

/**
 * Created by ejangpa on 1/14/2017.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class EqualStacks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        checkEqualHeight(h1, h2, h3);
    }

    /**
     * checks when heights of all the three cylinders stack h1, h2, h3 equals
     * @param h1
     * @param h2
     * @param h3
     */
    static void checkEqualHeight(int[] h1, int[] h2, int h3[]) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for(int i = 0; i < h1.length; i++) {
            sum1 = sum1 + h1[i];
        }
        for(int i = 0; i < h2.length; i++) {
            sum2 = sum2 + h2[i];
        }
        for(int i = 0; i < h3.length; i++) {
            sum3 = sum3 + h3[i];
        }

        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        int largestArrayLength = findLargestofAll(h1.length, h2.length, h3.length);
        if(h1.length == 0 || h2.length == 0 || h3.length == 0) {
            return;
        }
        for (int i = 0; i < largestArrayLength; i++) {
            int largestStackHeight = findLargestofAll(sum1, sum2, sum3);
            if(largestStackHeight == -2) {
                System.out.println(sum1);
                break;
            }
            if(largestStackHeight == sum1) {
                sum1 = sum1 - h1[i1];
                i1++;
            }
            else if(largestStackHeight == sum2) {
                sum2 = sum2 - h2[i2];
                i2++;
            }
            else if(largestStackHeight == sum3) {
                sum3 = sum3 - h3[i3];
                i3++;
            } else {
                return;
            }
        }
    }

    /**
     * finding largest sum and pop that first  to decrease its height
     */
    static int findLargestofAll(int sum1, int sum2, int sum3) {
        if(sum1 == sum2 && sum2 == sum3) {
            return -2;
        }
        else if ( sum1 > sum2 && sum1 > sum2 )
            return sum1;
        else if ( sum2 > sum1 && sum2 > sum3 )
            return sum2;
        else
            return sum3;
    }
}
