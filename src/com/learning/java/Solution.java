package com.learning.java;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Solution {


        public static int  solution(int[] A) {
        // write your code in Java SE 8
        int m,k,lsum,rsum;
            int n = A.length;
            List<Integer> output = new ArrayList<Integer>();
        for(k = 0; k < n; ++k)
        {
            lsum=0;rsum=0;
            for(m = 0; m < k; ++m)
                lsum += A[m];
            for(m = k + 1; m < n; ++m)
                rsum += A[m];
            if(lsum == rsum){
               output.add(k);
                continue;
            }
        }

        return output.get(output.size()-1);
    }


public static void main(String []args)
{
  //  int [] a = {-1,3,-4,5,1,-6,2,1};

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter N : ");
    int N = scan.nextInt();

    int A [] = new int [N];
    System.out.println("Enter Array A Elements : ");
    for(int i = 0; i < N ; i++){
        A[i] = scan.nextInt();
    }

    int r1 = solution(A);
    System.out.println("result is "+ r1);

}

}