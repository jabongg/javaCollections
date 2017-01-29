package com.learning.java.exceptionhandling;

import java.io.FileNotFoundException;

/**
 * Created by ejangpa on 1/15/2017.
 */
public class ThrowsDemo {
    public static void main(String[] args) /*throws FileNotFoundException*/ {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.throwsExceptionDemo();
    }
    static public void throwsExceptionDemo() /*throws FileNotFoundException*/ {
       // FileReader fileReader = new FileReader("Test.txt");
        try {
            throw new FileNotFoundException("reading file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
