package com.hackerrank.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ejangpa on 11/12/2016.
 */
public class Transmitter {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int[] x = new int[n];
            for(int x_i=0; x_i < n; x_i++){
                x[x_i] = in.nextInt();
            }

            Arrays.sort(x);
            int range = x[n-1] - x[0];
            int noOfAntena = 0;
            if(range%(k*2) == 0){
                noOfAntena = range/(k * 2);
            } else{
                noOfAntena = range/(k * 2) + 1;
            }
            System.out.println(noOfAntena);
        }
    }

