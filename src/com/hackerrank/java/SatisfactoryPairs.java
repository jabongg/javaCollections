package com.hackerrank.java;

import java.util.Scanner;
/**
 * Created by ejangpa on 12/3/2016.
 */
public class SatisfactoryPairs {

    public static void main(String[] args) {

        //define limit
        // int limit = 100;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int primePrev = 0;
        int primeCurr = 0;
        int count = 0;

        // System.out.println("Prime numbers between 1 and " + limit);

        //loop through the numbers one by one
        for(int i = n; i <= m; i++){

            boolean isPrime = true;

            //check to see if the number is prime
            for(int j=2; j < i ; j++){
                         /*  if(n == 1) {
	                       	isPrime = false;
	                       }*/
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            // print the number
            if(i == 1) {
                isPrime = false;
            }
            if(isPrime){
                if(primePrev == 0 && i == 2) {
                    primePrev = 2;
                }
                primeCurr = i;
                if(primeCurr - primePrev == 2) {
                    //	System.out.println("pair :" + primePrev + " " + primeCurr);
                    count++;
                }
                //	 System.out.print(i + " ");

                primePrev = primeCurr;
            }
        }
        System.out.println(count);
    }
}