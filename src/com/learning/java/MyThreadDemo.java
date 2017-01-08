package com.learning.java;

/**
 * Created by ejangpa on 1/7/2017.
 */
public class MyThreadDemo {
    public static void main(String[] args) {
            Thread thread = new NewThread();
            thread.start();
            }
    public static class NewThread extends Thread {
       @Override
        public void run() {
            System.out.println("Hello Thread !");
        }
    }
 }