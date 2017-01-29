package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 1/14/2017.
 */
public class StackArrayImplementation {

    static int top = -1;
    public static void main(String[] args) {
        int[] elements = new int[7];
        push(1, elements);
        peek(elements);
        push(2, elements);
        peek(elements);
        push(23, elements);
        peek(elements);
        pop();
        peek(elements);
        push(38, elements);
        peek(elements);
        pop();
        peek(elements);
    }

    static  void push(int number, int[] elements ) {
        elements[++top] = number;
    }

    static  void pop() {
        top--;
    }

    static void peek(int[] elements) {
        System.out.println(elements[top]);
    }

}
