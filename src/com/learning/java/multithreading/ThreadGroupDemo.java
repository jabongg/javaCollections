package com.learning.java.multithreading;

/**
 * Created by ejangpa on 1/17/2017.
 */
public class ThreadGroupDemo  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " +
                    Thread.currentThread().getState() + " " +
                    Thread.currentThread().getThreadGroup() + " " +
                    Thread.currentThread().getPriority()
            );
        }
    }

    public static void main(String[] args) {
        ThreadGroupDemo threadGroupDemo = new ThreadGroupDemo();
        ThreadGroup myThreadGroup = new ThreadGroup("MyThreadGroup");

        Thread thread1 = new Thread(myThreadGroup, threadGroupDemo, "thread1");
        Thread thread2 = new Thread(myThreadGroup, threadGroupDemo, "thread2");
        Thread thread3 = new Thread(myThreadGroup, threadGroupDemo, "thread3");
        Thread thread4 = new Thread(myThreadGroup, threadGroupDemo, "thread4");
        Thread thread5 = new Thread(myThreadGroup, threadGroupDemo, "thread5");
        Thread thread6 = new Thread(myThreadGroup, threadGroupDemo, "thread6");
        Thread thread7 = new Thread(myThreadGroup, threadGroupDemo, "thread7");
        Thread thread8 = new Thread(myThreadGroup, threadGroupDemo, "thread8");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread4.setPriority(Thread.NORM_PRIORITY);
        thread5.setPriority(Thread.NORM_PRIORITY);
        thread6.setPriority(Thread.NORM_PRIORITY);

        thread7.setPriority(Thread.MIN_PRIORITY);
        thread8.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
    }
}
