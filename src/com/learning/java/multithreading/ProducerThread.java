package com.learning.java.multithreading;

import java.util.Vector;

/**
 * Created by ejangpa on 2/16/2017.
 */
public class ProducerThread implements Runnable {

    private final Vector sharedQueue;
    private final int SIZE;

    public ProducerThread(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Produced: " + i);
            try {
                produce(i);
            } catch (InterruptedException ex) {

            }

        }
    }

 /* 	produce() {
		synchronized (q) {
			//produce items
			q.notify();
		}
	} */

    private void produce(int i) throws InterruptedException {

        //wait if queue is full
        while (sharedQueue.size() == SIZE) {
            synchronized (sharedQueue) {
                System.out.println("Queue is full " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());

                sharedQueue.wait();
            }
        }

        //producing element and notify consumers
        synchronized (sharedQueue) {
            sharedQueue.add(i);
            sharedQueue.notifyAll();
        }
    }

}
