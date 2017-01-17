package com.java.oops.threads;

/**
 * Created by ejangpa on 1/17/2017.
 */
public class ThreadDemoRunnable implements Runnable{
    public static void main(String[] args ) {
        ThreadDemoRunnable  threadDemoRunnable = new ThreadDemoRunnable();
        Thread hare = new Thread(threadDemoRunnable, "Hare");
        Thread tortoise = new Thread(threadDemoRunnable, "Tortoise");
        Thread drake = new Thread(threadDemoRunnable, "drake");
        drake.getState();
        tortoise.getState();
        hare.getState();

        hare.start();
        hare.getState();
        tortoise.start();
        tortoise.getState();
        drake.start();
        drake.getState();

        /*ThreadGroup threadGroup = new ThreadGroup("ussain bolt");
        threadGroup.activeCount() ;*/
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + (i + 1));
                    try {
                        System.out.println(Thread.currentThread().getState());
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getState());
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
        }
    }
}
