package com.learning.java;

/**
 * Created by ejangpa on 10/12/2016.
 */

// displaying maximum consecutive count of 1's
public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int number [] = new int[] {1, 1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0};
        int count = 0;
        int maxOnesCount = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] == 1 ){
                    count++;
            }
            if(number[i] == 0 || i == number.length - 1){
                if(count > maxOnesCount){
                    maxOnesCount = count;
                }
                count = 0;
            }
        }
      //  System.out.println(count);
        System.out.println(maxOnesCount);
        System.out.println(number.length);
    }
}
