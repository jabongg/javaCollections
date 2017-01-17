package com.java.oops.threads;

import java.util.ArrayList;
import java.util.Scanner;

/**11
 * Created by ejangpa on 1/17/2017.
 */
public class ThreadDemoRunnable {

    public static ThreadSafeStack queue = new ThreadSafeStack();

    public static void main(String[] args ) {

        for(int i = 0; i < 10000; i++){
            queue.queue(i);
        }

        Thread thread1 = new Thread( new Labour(queue));
        Thread thread2 = new Thread( new Labour(queue));
        thread1.start();
        thread2.start();
    }
}


class Labour implements Runnable {

    ThreadSafeStack queue;

    Labour(ThreadSafeStack queue){
        this.queue = queue;
    }

    public void run() {
        int count = 0;
        while(!queue.isEmpty()){
            int num = queue.dequeue();
            try {
                Thread.sleep(10);
            }catch(Exception e){}
            count++;
        }
        System.out.println(Thread.currentThread().getName() + " : " + count);
        System.out.println("Labour is going home.");
    }
}

class ThreadSafeStack{

    ArrayList<Integer> nums;

    ThreadSafeStack() {
        nums = new ArrayList<Integer>();
    }

    public synchronized void queue(int num){
        nums.add(num);
    }

    public synchronized int dequeue(){
        int num = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        return num;
    }

    public synchronized boolean isEmpty(){
        return nums.size() == 0;
    }
}

