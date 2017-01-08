package com.hackerrank.java;

/**
 * Created by ejangpa on 11/27/2016.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int pointA = 0;
        int pointB = 0;


        if(a0 > b0) {
            pointA++;
        }
        else if(a0 != b0)
            pointB++;
        if(a1 > b1) {
            pointA++;
        }
        else if(a1 != b1)
            pointB++;
        if(a2 > b2) {
            pointA++;
        }
        else if(a2 != b2)
            pointB++;

        System.out.print(pointA + " " + pointB);
    }


}


