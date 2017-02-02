package com.learning.java.thread;

/**
 * Created by ejangpa on 2/1/2017.
 */

public class ThreadTest1 implements Runnable{
    public static void main(String[] args){
        ThreadTest1 t = new ThreadTest1();

        t.start();
    }
   static void start() {
       System.out.println("hello");
    }
    public void run() { }
}