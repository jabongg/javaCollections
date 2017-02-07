package com.learning.java.multithreading;

/**
 * Created by ejangpa on 2/4/2017.
 */
public class RunCallDirectDemo extends Thread{
    public static void main(String[] args) {
        RunCallDirectDemo runCallDirectDemo1 = new RunCallDirectDemo();
        runCallDirectDemo1.run();
        RunCallDirectDemo runCallDirectDemo2 = new RunCallDirectDemo();
        runCallDirectDemo2.run();
        RunCallDirectDemo runCallDirectDemo3 = new RunCallDirectDemo();
        runCallDirectDemo3.run();

/*
        runCallDirectDemo1.start();
        runCallDirectDemo2.start();
        runCallDirectDemo3.start();
*/


    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
