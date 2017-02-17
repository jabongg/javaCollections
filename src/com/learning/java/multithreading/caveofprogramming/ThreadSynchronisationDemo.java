package com.learning.java.multithreading.caveofprogramming;

import java.util.Scanner;

/**
 * Created by ejangpa on 2/16/2017.
 */
public class ThreadSynchronisationDemo {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.start();

        System.out.println("press return to stop ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        processor.shutdown();
    }
}
