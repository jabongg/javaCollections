package com.learning.java.multithreading.caveofprogramming;

/**
 * Created by ejangpa on 2/16/2017.
 */
public class Processor extends Thread {

    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("hello");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}
