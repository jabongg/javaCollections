package com.learning.java.multithreading.caveofprogramming;

/**
 * Created by ejangpa on 2/16/2017.
 */
public class SynchronizedKeywordDemo {

    private  int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }
    public static void main(String[] args) {
        SynchronizedKeywordDemo synchronizedKeywordDemo = new SynchronizedKeywordDemo();
        synchronizedKeywordDemo.doWork();
    }


    public void doWork() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    synchronized (this) {
                        increment();
                    }
                    System.out.println(count + Thread.currentThread().getName());
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    synchronized (this) {
                        increment();
                    }
                    System.out.println(count + Thread.currentThread().getName());
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

        }
        System.out.println("count is :" + count);
    }
}
