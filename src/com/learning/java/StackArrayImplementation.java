package com.learning.java;

/**
 * Created by ejangpa on 1/14/2017.
 */
public class StackArrayImplementation {
    public static void main(String[] args) {
        int[] elements = new int[7];
        push(1, elements);
        push(2, elements);
        push(23, elements);
        pop(23, elements);
        push(38, elements);
        peek(elements);
    }
    static  void push(int number, int[] elements ) {
        int top = -1;
        elements[++top] = number;
    }

    static  void pop(int number, int[] elements) {
    }

    static void peek(int[] elements) {

    }

}
