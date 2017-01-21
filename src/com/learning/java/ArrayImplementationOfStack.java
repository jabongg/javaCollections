package com.learning.java;

/**
 * Created by ejangpa on 1/21/2017.
 */
public class ArrayImplementationOfStack {

    int[] stack = new int[10];
    int top = -1;

    public static void main(String[] args) {
        ArrayImplementationOfStack arrayImplementationOfStack = new ArrayImplementationOfStack();
        arrayImplementationOfStack.pop();
        arrayImplementationOfStack.push(1);
        arrayImplementationOfStack.peek();

        arrayImplementationOfStack.push(5);
        arrayImplementationOfStack.peek();

        arrayImplementationOfStack.pop();
        arrayImplementationOfStack.peek();

        arrayImplementationOfStack.push(8);
        arrayImplementationOfStack.peek();
        arrayImplementationOfStack.push(10);
        arrayImplementationOfStack.peek();

        arrayImplementationOfStack.pop();
        arrayImplementationOfStack.peek();
        arrayImplementationOfStack.pop();
        arrayImplementationOfStack.peek();


        //arrayImplementationOfStack.peek();
        arrayImplementationOfStack.push(3);
        arrayImplementationOfStack.peek();
    }

    /**
     * pushes the element on the top of the stack;
     * @param element
     */
    public void push(int element) {
        ++top;
        stack[top] = element;
    }

    /**
     * deletes the top element of the stack
     */
    public void pop() {
        if (top == -1) {
            System.out.println("Empty stack");
        } else {
            top--;
        }
    }

    /**
     *  prints the top element of top
     */
    public void peek() {
        System.out.println(stack[top]);
    }

}
