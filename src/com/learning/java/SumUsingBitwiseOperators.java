package com.learning.java;

/**
 * Created by ejangpa on 12/28/2016.
 */
public class SumUsingBitwiseOperators {
    public static void main (String args[]) {
        int a = 3;
        int b = 5;
        int S = a ^ b;

       //     int C = (a & b) << 1;
         //   int Sum = C + S;

       int C = a & b;
       int Sum = 2*C + S;
        System.out.println(Sum);
        int sumRec = sumRecursion(a,b);
        System.out.println(sumRec);
    }
    static int  sumRecursion(int a, int b) { // what will be the close condition of this recursion?
        if(b == 0) {
            return a;
        }
        else {
            return sumRecursion(a ^ b, (a & b) << 1);
        }
    }
}

