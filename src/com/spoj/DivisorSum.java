package com.spoj;

/**
 * Created by ejangpa on 12/30/2016.
 */

import java.util.*;
        import java.lang.*;

public class DivisorSum {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int sum = divisorsSum(N);
            System.out.println(sum);
        }
    }
    static int divisorsSum(int N) {
        int sum = 0;
        for(int i = 1; i <= N/i; i++) {
            if(N % i == 0) {
                sum = sum + i;
                int d = N/i;
                if(d!=i && d != N)
                    sum = sum + d;
            }
        }
        return sum;
    }
}