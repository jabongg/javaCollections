package com.hackerrank.java;

/**
 * Created by ejangpa on 12/9/2016.
 */

import java.util.*;

public class StrangeCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long  time = 1;
        long  value = 3;

/*
        if(t == 1) {
            System.out.println(value);
        }
*/

        long timePrev = 1;
        long  valuePrev = 3;
        while(t > time) {
            timePrev = time;
            valuePrev = value;
            time = time + value;
            value = value * 2;
        }
        long currentTime = t - timePrev;
        long currentValue = valuePrev - currentTime;
        int flag = 0;
        if(currentValue == 0) {
            System.out.println(value);
            flag = 1;
        }
        if(flag == 0) {
            System.out.println(currentValue);
        }

    }
}
