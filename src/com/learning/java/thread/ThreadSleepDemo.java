package com.learning.java.thread;

/**
 * Created by ejangpa on 2/1/2017.
 */
public class ThreadSleepDemo extends Thread{

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSleepDemo thread1 = new ThreadSleepDemo();
        thread1.start();
        ThreadSleepDemo thread2 = new ThreadSleepDemo();
        thread2.start();
    }
}
