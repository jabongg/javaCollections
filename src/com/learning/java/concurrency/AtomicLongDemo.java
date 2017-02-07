package com.learning.java.concurrency;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ejangpa on 2/3/2017.
 */
public class AtomicLongDemo implements Runnable {

    private final AtomicLong seqNumber = new AtomicLong(0);
    public long next() {
        return seqNumber.getAndIncrement();
    }

    @Override
    public void run() {
        next();
    }

    public static void main(String[] args) {

        //creating five threads
        AtomicLongDemo atomicLongDemo = new AtomicLongDemo();
        Thread thread1 = new Thread(atomicLongDemo);
        thread1.start();
        Thread thread2 = new Thread(atomicLongDemo);
        thread2.start();
        Thread thread3 = new Thread(atomicLongDemo);
        thread3.start();
        Thread thread4 = new Thread(atomicLongDemo);
        thread4.start();
        Thread thread5 = new Thread(atomicLongDemo);
        thread5.start();

        System.out.println(atomicLongDemo.seqNumber);
    }
}
