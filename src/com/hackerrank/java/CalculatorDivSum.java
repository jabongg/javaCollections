package com.hackerrank.java;

import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
/*
class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        // n has no divisors other than itself
        int iterations = 0;
        if(n == 1){
            return n;
        }

        // Find and sum divisors:
        int half = n/2;
        int sum = n;
        do{
            iterations++;
            if(n % half == 0){
                sum += half;
            }
        }while( half-- > 1 );
        System.out.println("iterations : " + iterations);
        return sum;
    }
}
*/

class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
     int iterations = 0;
        int sum = 0;
        for (int i = 1; i*i<=n; i++) {
        iterations++;
            if (n % i == 0) {
                if (i != n / i) sum += i;

                sum += (n / i);

            }
        }
        System.out.println(iterations);
        return sum;
    }
}
/*//Write your code here method 1
class Calculator implements AdvancedArithmetic{
    public int divisorSum(int number){
        int divSum = 0;
        int iterations = 0;
        for(int i = 1; i < (number/2)+1; i++){
            iterations++;
            if(number % i == 0){
                divSum = divSum + i;
            }
        }
        divSum = divSum + number;
        System.out.println("iterations : " + iterations);
        return divSum;
    }
}*/

class CalculatorDivSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}