package com.hackerrank.java;

/**
 * Created by ejangpa on 1/16/2017.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int choice = scanner.nextInt();
            if(choice == 1) {
                int element = scanner.nextInt();
                stack = pushToStack(element, stack);
            } else if ( choice == 2){
                stack = deleteStackElement(stack);
            } else if ( choice == 3 ) {
                int max  = findMaxElementInStack(stack);
                System.out.println(max);
            }
        }
    }

    static Stack pushToStack(int element, Stack stack) {
        stack.push(element);
        return stack;
    }

    static Stack deleteStackElement(Stack stack) {
        stack.pop();
        return stack;
    }

    static int findMaxElementInStack(Stack stack) {
        int max = 0;
        while(!stack.isEmpty()) {
            if((int) stack.peek() > max) {
                max = (int) stack.peek();
            }
            stack.pop();
        }
        return max;
    }
}