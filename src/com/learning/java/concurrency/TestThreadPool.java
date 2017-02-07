package com.learning.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ejangpa on 2/4/2017.
 */


public class TestThreadPool {
    public static void main(String[] args) {
      ExecutorService executor = Executors.newFixedThreadPool(5);   //creating a pool of 5 threads
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("Hello");
            executor.execute(worker);//calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");
    }
}
