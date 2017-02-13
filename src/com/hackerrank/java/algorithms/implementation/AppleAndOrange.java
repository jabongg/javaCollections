package com.hackerrank.java.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by ejangpa on 2/10/2017.
 */

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int countOrange = 0;
        int countApple = 0;

        if(s > a && s < t && s < b && t < b && t > a){


            for(int i = 0; i < orange.length; i++){
                int calculate = b + orange[i];
                if(calculate >= s  && calculate <= t){
                    countOrange++;
                }
            }
//count for apples falling on sam's home

            for(int i = 0; i < apple.length; i++){
                int calculate = a + apple[i];
                if(calculate >= s  && calculate <= t){
                    countApple++;
                }
            }

            System.out.println(countApple);
            System.out.println(countOrange);

        }
        else{
            return;
        }
    }
}
