package com.learning.java.multithreading;

/**
 * Created by ejangpa on 1/17/2017.
 */
public class SynchronizedBlockDemo implements Runnable{
    private static int sum1 = 0;
    private static int sum2 = 0;

    /*protected int  count = 0;*/

    public void add(int value1, int value2) {
       synchronized (this) {
           this.sum1 += value1;
           this.sum2 =+ value2;
           System.out.println(sum1 + " " + Thread.currentThread().getName());
           System.out.println(sum2 + " " + Thread.currentThread().getName());
       }
    }

/*
    public void add(int value) {
        this.count = count + value;
        System.out.println(count + Thread.currentThread().getName());
    }
*/


    public static void main(String[] args) {
        SynchronizedBlockDemo synchronizedBlockDemo = new SynchronizedBlockDemo();
        Thread thread1 = new Thread(synchronizedBlockDemo, "multithreading 1");
        thread1.start();

        Thread thread2 = new Thread(synchronizedBlockDemo, "multithreading 2");
        thread2.start();
    }
    @Override
    public void run() {
       // add(5);
        add(15, 40);
        add(5, 30);
    }
}
