package com.hackerrank.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by ejangpa on 10/12/2016.
 */
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        convertToBinary(num);
    }

    static void convertToBinary (int num){
        ArrayList <Integer> al = new ArrayList<Integer>();
        while (num >= 2){
            al.add(num % 2);
            num = num / 2;
            if(num == 1){
                al.add(num);
            }
        }
    //    System.out.println(al);

        pushArrayListToArray(al);
    }

    static void pushArrayListToArray(ArrayList <Integer> al){
        Integer binaryArray[] = new Integer[al.size()];
        int i = 0;
        ListIterator<Integer> itr = al.listIterator();

        while (itr.hasNext() ){
            binaryArray[i] = al.get(i);
           // System.out.println(binaryArray[i]);
           // System.out.println(al.get(i));
            i++;
            if(i == al.size()){
               break;
            }
        }

        getCounter(binaryArray);

    }

    static void getCounter(Integer [] number){

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
    }
}
