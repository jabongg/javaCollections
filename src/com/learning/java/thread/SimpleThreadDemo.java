package com.learning.java.thread;

/**
 * Created by ejangpa on 1/17/2017.
 */

public class SimpleThreadDemo extends Thread {
    public static void main(String[] args) {
        SimpleThreadDemo thread = new SimpleThreadDemo();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("thread running");
    }
}
