package com.learning.java.exceptionhandling;

/**
 * Created by ejangpa on 1/15/2017.
 */
public class ExceptionPropagationDemo {
    public void method1() {
        System.out.println("method1");
        this.method2();
    }
    public void method2() throws ArithmeticException {
        System.out.println("method2");
        this.method3();
    }
    public void method3() {

        this.method4();
        System.out.println("method3");
    }
    public void method4() {
        System.out.println("method4");
        int a = 10;
        int b = 0;
        int c = a / b;
    }
    public static void main(String[] args) {
        ExceptionPropagationDemo epd = new ExceptionPropagationDemo();
        try {
            epd.method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("After method1 in main");
    }
}
