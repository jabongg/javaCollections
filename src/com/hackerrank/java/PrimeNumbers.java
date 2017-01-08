package com.hackerrank.java;

/**
 * Created by ejangpa on 10/14/2016.
 */
public class PrimeNumbers {
     public static void main(String args[]){
         int num=8;
         for(int i=2;i<=num;i++){
             for(int j=2;j<i;j++){
                 if(i%j==0){
                     break;
                 }
                 System.out.println(j);
             }

         }
     }
}
