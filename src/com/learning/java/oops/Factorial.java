package com.learning.java.oops;

import java.util.Scanner;

/**
 * Created by ejangpa on 10/14/2016.
 *
 */
public class Factorial {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long factValue = factorial(n);
        System.out.println(factValue);
    }
    public static int factorial (int number){
        int valueOfFactorial = number;
        if (number == 1 || number == 0) {
            return 1;
        }
        else{
            valueOfFactorial = number * factorial(number - 1);
        }
        return valueOfFactorial;
    }
}
