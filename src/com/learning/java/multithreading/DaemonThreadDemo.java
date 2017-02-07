package com.learning.java.multithreading;

/**
 * Created by ejangpa on 2/4/2017.
 */
public class DaemonThreadDemo extends Thread {
    public static void main(String[] args) {
        DaemonThreadDemo DaemonThreadDemo1 = new DaemonThreadDemo();
        DaemonThreadDemo DaemonThreadDemo2 = new DaemonThreadDemo();
        DaemonThreadDemo DaemonThreadDemo3 = new DaemonThreadDemo();

        DaemonThreadDemo1.setDaemon(true);

        DaemonThreadDemo1.start();
        DaemonThreadDemo2.start();
        DaemonThreadDemo3.start();

    }

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Tread" + Thread.currentThread().getName());
        } else {
            System.out.println("User Thread" + Thread.currentThread().getName());
        }
    }
}
