package com.learning.java.thread;

/**
 * Created by ejangpa on 1/17/2017.
 */
public class JavaSynchronizedExample {
    public static void main(String[] args) {
            Counter counter = new Counter();
            Thread  threadA = new CounterThread(counter);
            Thread  threadB = new CounterThread(counter);

            threadA.start();
            threadB.start();
    }
}

class Counter {
    long count = 0;
    public synchronized void add(long value) {
        this.count += value;
        System.out.println(this.count + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){};
    }
}

class CounterThread extends Thread {
    protected Counter counter = null;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    public void run()  {
        for(int i=0; i<10; i++){
            counter.add(i);
        }
    }
}
