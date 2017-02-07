package com.learning.java.multithreading;

/**
 * Created by ejangpa on 2/4/2017.
 */

public class JoinDemo implements Runnable {
    public void run(){
        for(int i = 1; i <= 5; i++){
           try{
                Thread.sleep(1500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i + Thread.currentThread().getName());
        }
    }

    public static void main(String args[]) {
        Thread t1 = new Thread(new JoinDemo()," t1 ");
        Thread t2 = new Thread(new JoinDemo()," t2 ");
        Thread t3 = new Thread(new JoinDemo()," t3 ");

        t1.start();
        try{
            t1.join(1500);
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
