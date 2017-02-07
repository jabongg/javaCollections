package com.learning.java.multithreading;

/**
 * Created by ejangpa on 2/2/2017.
 */
public class DeadLockDemo extends Thread {
    public static void main(String[] args) {
        // creating multiple threads to analyse the deadlock condition.
        DeadLockDemo deadLockDemo1 = new DeadLockDemo();
        deadLockDemo1.start();
        DeadLockDemo deadLockDemo2 = new DeadLockDemo();
        deadLockDemo2.start();
        DeadLockDemo deadLockDemo3 = new DeadLockDemo();
        deadLockDemo3.start();
        DeadLockDemo deadLockDemo4 = new DeadLockDemo();
        deadLockDemo4.start();
        DeadLockDemo deadLockDemo5 = new DeadLockDemo();
        deadLockDemo5.start();
        DeadLockDemo deadLockDemo6 = new DeadLockDemo();
        deadLockDemo6.start();
    }

    public void run() {
            method1();
            method2();
    }

    /* method1 aquires two locks , one on integer and other on String object*/
    public void method1() {
        synchronized (String.class) {
            System.out.println("taking lock on String object");
            System.out.println(Thread.currentThread().getName());

            synchronized (Integer.class) {
                System.out.println("Taking lock on Integer object");
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    /* method2 aquires two locks , one on integer and other on String object but in reverse order*/
    public void method2() {
        synchronized (Integer.class) {
            System.out.println("Taking lock on Integer Object");
            System.out.println(Thread.currentThread().getName());

            synchronized (String.class) {
                System.out.println("Taking lock on String class Object");
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
