package com.java.oops.com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by ejangpa on 1/15/2017.
 */
public class ExceptionHierarchyDemo {
    public double division(int a, int b) {
        double c = 0;
        try {
            c = a / b;
            FileReader fr = new FileReader("TestJB.txt");
            System.out.println("Not executed");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void main(String[] args) {
        ExceptionHierarchyDemo ehd = new ExceptionHierarchyDemo();
        ehd.division(25, 0);
    }
}
