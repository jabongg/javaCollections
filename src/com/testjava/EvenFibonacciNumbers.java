

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvenFibonacciNumbers {

    public static void main(String[]  assholekidashmein) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            fibonacci(1,2,n);
        }
    }
	
	static void fibonacci(int num1, int num2, Long N) {
		   long sum = 2;	// Takes care of 1 & 2 since N >= 10
			long fibonacciOdd1 = 3;
			long fibonacciOdd2 = 5;
			long fibonacciEven = fibonacciOdd1 + fibonacciOdd2;
			while (fibonacciEven <= N) { // N is the upper limit
				sum += fibonacciEven;
				fibonacciOdd1 = fibonacciOdd2 + fibonacciEven;
				fibonacciOdd2 = fibonacciOdd1 + fibonacciEven;
				fibonacciEven = fibonacciOdd1 + fibonacciOdd2;
	}	
        System.out.println(sum);
    }
}
