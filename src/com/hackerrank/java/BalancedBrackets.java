package com.hackerrank.java;

/**
 * Created by ejangpa on 12/28/2016.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class BalancedBrackets {


    public static boolean isBalanced(String expression) {
        char[] bracketArray;
        bracketArray = expression.toCharArray();
        //char[] stack = new char[bracketArray.length];
        Stack<Character> stack = new Stack<>();
        int i;
        int j = 0;

        if(bracketArray.length % 2 != 0) {
            return false;
        }
        else {
            for( i = 0; i < bracketArray.length; i++) {
                if(bracketArray[i] == '{'
                        || bracketArray[i] == '['
                        || bracketArray[i] == '('
                        ) {
                    stack.push(bracketArray[i]);
                }
                switch (bracketArray[i]) {
                    case '}':
                        if(stack.isEmpty() || stack.pop() != '{');
                        return false;
                    case ']':
                        if(stack.isEmpty() || stack.pop() != '[');
                        return false;
                    case ')':
                        if(stack.isEmpty() || stack.pop() != '(');
                        return false;
                }
                /*else if(bracketArray[i] == '}' ) {
                    if(stack.isEmpty() ||  stack.pop() != '{' ) {
                        return false;
                    }
                }
                else if(bracketArray[i] == ']' ) {
                    if(stack.isEmpty() ||  stack.pop() != '[' ) {
                        return false;
                    }
                }
                else if(bracketArray[i] == ')' ) {
                    if(stack.isEmpty() ||  stack.pop() != '(' ) {
                        return false;
                    }
                }*/
            }
            if(!stack.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
