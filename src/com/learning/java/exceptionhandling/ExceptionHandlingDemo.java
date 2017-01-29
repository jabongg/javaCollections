package com.learning.java.exceptionhandling;

/**
 * Created by ejangpa on 1/15/2017.
 */

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
       ExceptionHandlingDemo eh = new ExceptionHandlingDemo();
        eh.method1();
    }
    public void method1() {
        method1();
    }
}
