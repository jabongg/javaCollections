package com.hackerrank.java;

/**
 * Created by ejangpa on 11/8/2016.
 */
public class DivisorsSum {
    public static void main(String[] args) {

        int number = 20;
       int divSum = divisorSum(number);
        System.out.println(divSum);
    }



   static int divisorSum(int number){
        int divSum = 0;
        for(int i = 1; i < (number/2)+1; i++){
            if(number % i == 0){
                divSum = divSum + i;
            }
        }
        divSum = divSum + number;

        return divSum;
    }


}
