package com.learning.java.miscellaneous;

import java.util.PriorityQueue;

/**
 * Created by ejangpa on 1/3/2017.
 */

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.offer("first");
        q.offer("second");
        q.offer("third");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
