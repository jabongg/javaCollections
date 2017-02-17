package com.learning.java.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/**
 * Created by ejangpa on 2/16/2017.
 */
public class ProducerConsumerDemo {
    public static void main(String[] args) {

        Vector sharedQueue = new Vector();
        int size = 4;

        Thread  producer = new Thread(new ProducerThread(sharedQueue, size),"producer");
        Thread consumer = new Thread(new ConsumerThread(sharedQueue, size),"consumer");

        producer.start();
        consumer.start();
    }
}