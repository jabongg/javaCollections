package com.geeksforgeeks;

/**
 * Created by ejangpa on 1/25/2017.
 */
  // program to count trailing zeros in factorial
 import java.util.Scanner;
public class TrailingZeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //enter number whose factorial is to be calculated
        int n = scan.nextInt();
        long factValue = factorial(n); // calcualting factorial of n . n should be in range of long.
        int countZeros = countZerosInFactValue(factValue); // calculating number of zeros
        System.out.println(countZeros);
    }
    // calculating number of zeros
    public static int countZerosInFactValue(long factValue) {
        int countZeros = 0;
        while (factValue % 5 == 0) {
            factValue = factValue / 5;
            countZeros++;
        }
        return countZeros;
    }
    // calcualting factorial of n
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
