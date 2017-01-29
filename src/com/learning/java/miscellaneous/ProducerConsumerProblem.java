
package com.learning.java.miscellaneous;
/**
 * Created by ejangpa on 9/30/2016.
 */

import java.lang.Runnable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerProblem {

    List <Integer> resourseQueue = new ArrayList<Integer> ();

    public static void main (String [] args){

        Producer producer = new Producer();
        Thread producerThread = new Thread(producer);
        producerThread.start();

        Consumer consumer = new Consumer();
        Thread consumerThread  = new Thread(consumer);
        consumerThread.start();

       // System.out.print(resourseQueue);
//
//        for (int i = 0; i < resourseQueue.size(); i++){
//
//        }
    }
}

class Producer extends ProducerConsumerProblem implements Runnable  {
    @Override
    public void run() {
       try {
           put();
       }
       catch (InterruptedException e){
           System.out.print(" producer interrupted !");
       }
    }
    public synchronized void put() throws InterruptedException{
        for(int i = 0; i < 5; i++){
              wait();
              System.out.println( "in Producer : " + resourseQueue.add(i) + " " + i + resourseQueue);
              notify();
           // System.out.println(resourseQueue.add(i));
        }
    }
}


class Consumer extends ProducerConsumerProblem  implements Runnable{
    @Override
    public void run() {
        try{
            get();
        }
        catch (InterruptedException e){
            System.out.print("Consumer Interrupted ! ");
        }


    }
    public synchronized void get() throws InterruptedException{
        for(int i = 100; i > 95; i--){
                //wait();
                System.out.println( "in Consumer :" + resourseQueue.add(i) + " " + i + " " + resourseQueue);
                notify();
            // System.out.println(resourseQueue.add(i));
        }
    }
}