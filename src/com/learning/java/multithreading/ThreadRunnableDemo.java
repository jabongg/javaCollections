package com.learning.java.multithreading;

/**
 * Created by ejangpa on 1/7/2017.
 */
public class ThreadRunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(),"Thread1JB") ;
        t1.start();
        Thread t2 = new Thread(new MyRunnable(),"Thread2DASKO");
        t2.start();
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getThreadGroup().getParent() + "Hello Thread ! Your father is Runnable interface" );
        }
    }
}
