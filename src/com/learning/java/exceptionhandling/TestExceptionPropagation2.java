package com.learning.java.exceptionhandling;

/**
 * Created by ejangpa on 2/20/2017.
 */
public class TestExceptionPropagation2 {
    public static void main(String[] args) {
        TestExceptionPropagation2 t = new TestExceptionPropagation2();
        t.p();
        System.out.println("normal flow");
    }

    public void p() {
        try {
            n();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    void n() {
        m();
    }
    void m() {
        try {
            throw new java.io.IOException("device error!");  //checked exception
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
