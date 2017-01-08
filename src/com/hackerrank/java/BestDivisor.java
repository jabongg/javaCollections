package com.hackerrank.java;

/**
 * Created by ejangpa on 12/2/2016.
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Set;

public class BestDivisor {
    public static void main (String args []) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        findDivisors(number);
    }

    static void findDivisors(int n) {
        HashMap<Integer, Integer> mapObj = new HashMap<Integer, Integer>();
        HashMap<Object, Object> mapObjCurrentMax = new HashMap<Object, Object>();

        //ArrayList<Integer> al = new ArrayList<Integer>();
        int i = 1;
        int maxCurrent = 0;
        while(i <= n/i) {
            if(n%i == 0 /* && i != n/i */) {
                int num2DigiSum , num1DigiSum= 0;
               // System.out.println(i +" "+ n/i);
                num1DigiSum = DigiSum(i);
                mapObj.put(i, num1DigiSum);
                if(i == n/i) {
                    num2DigiSum = DigiSum(i);
                    mapObj.put(i, num2DigiSum);
                }
                else {
                    num2DigiSum = DigiSum(n/i);
                    mapObj.put(n/i, num2DigiSum);
                }


                if(maxCurrent < num1DigiSum) {
                    maxCurrent = num1DigiSum;
                }
                if(maxCurrent < num2DigiSum) {
                    maxCurrent = num2DigiSum;
                }
            }
            i++;
        }

        //System.out.println("maxCurrent :" + maxCurrent);
        int count = 0;
        for(Map.Entry m: mapObj.entrySet()) {
            //System.out.println(m.getKey()+" "+m.getValue());
            if(m.getValue() == maxCurrent) {
                mapObjCurrentMax.put(m.getKey(),m.getValue());
                count++;
            }
        }

        Map<Object, Object> map = new TreeMap<Object, Object>(mapObjCurrentMax);

       // System.out.println("Maximum digit sum divisors");
        for(Map.Entry m: map.entrySet()) {
            if(count == 1) {
                System.out.println(m.getKey() );
                break;
            }
            else {
                System.out.println(m.getKey() );
                break;
            }

        }

    }


    static int DigiSum(int n) {
        int sum = 0;
        int max = 0;
        while(n >= 1) {
            sum = sum + n%10;
            n = n/10;
        }
        if(sum > max) {
            max = sum;
        }
        return max;
    }

}