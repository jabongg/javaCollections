/*
package com.hackerrank.java;

import java.util.Scanner;
*/
/**
 * Created by ejangpa on 12/12/2016.
 *//*

public class MultiplesOf3And5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long sum = sumMuliples(n);
            System.out.println(sum);
        }
    }

    static long sumMuliples(int n) {

        long sum = 0;
       for(int i = 1; i < n; i++) {
           if(i%3 == 0 || i%5 == 0) {
               sum = sum + i;
           }
       }
        return sum;
//my previous way
       */
/*
        long sum = 0;int multiple3 = 0; int multiple5 = 0;
        int multiple3Sum = 0;
        int multiple5Sum = 0;
        int commonSum = 0;
       // int i = 1,  j = 1;

       while( multiple3 < n ) {
            multiple3 = 3*i;
            multiple5 = 5*j;

            if(multiple3 < multiple5) {
                System.out.print(multiple3 +" ");
                i++;
                sum = sum + multiple3;
            }
            if(multiple3 > multiple5 && multiple5 != n) {
               System.out.print(multiple5 +" ");
                j++;
                sum = sum + multiple5;
            }

            if(multiple3 == multiple5) {
                System.out.print(multiple5 + " ");
                j++;
                i++;
                sum = sum + multiple5;
            }

            //multiple3Sum = multiple3Sum + multiple3;
        }

*//*


*/
/*        for(int i = 1; multiple5 <= n; i++) {
            multiple5 = 5*i;
            multiple5Sum = multiple5Sum + multiple5;
        }
        sum = multiple3Sum + multiple5Sum;
        return sum;
        *//*


    }
}

*/



package com.hackerrank.java;

import java.util.Scanner;
/**
 * Created by ejangpa on 12/12/2016.
 */
public class MultiplesOf3And5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long sum = sumMuliples(n);
            System.out.println(sum);
        }
    }

    static long sumMuliples(int n) {
        long a=0, b=0, d=0;

        a=(n-1)%3;
        a=n-1-a;
        a=a/3;

        b=(n-1)%5;
        b=n-1-b;
        b=b/5;

        d=(n-1)%15;
        d=n-1-d;
        d=d/15;
        long c= 3*a*(a+1)/2 + 5*b*(b+1)/2 - 15*d*(d+1)/2;
        return c;

    }
}


