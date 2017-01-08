package com.learning.java;

/**
 * Created by ejangpa on 10/17/2016.
 */
public class ArrayNullCheck {
    public static void main(String[] args) {
        int array1[] = new int []{1,2,3,4,5,6,234234,'\u0000',};
        for(int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

        System.out.println(array1.length);
    }

}
