package com.learning.java;

/**
 * Created by ejangpa on 1/17/2017.
 */


import java.util.*;
public class BinaryArray {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Create Stack object
        Stack<Integer> stack = new Stack<Integer>();

        // User input
        //System.out.println("Enter decimal number: ");
        int num = in.nextInt();

        int lastCount = 0;
        int maxZeroStreak = 0;
        int maxFinalCheck = 0;
        int count = 0;
        boolean startFlag = false;

        while (num != 0)
        {
            int d = num % 2;
            if (d == 0) {
                count++;
            } else  {
                lastCount = count;
                count = 0;
                if (lastCount > maxZeroStreak ) {
                    maxZeroStreak = lastCount;
                }
            }
            stack.push(d);
            num /= 2;
        }

        System.out.print("\nBinary representation is:");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());

        }
       // System.out.println();
        System.out.println(maxZeroStreak);
    }
}