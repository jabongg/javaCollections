package com.learning.java.thread;
/**
 * Created by ejangpa on 9/29/2016.
 */

import java.lang.InterruptedException;

class ThreadSimpleDemo{
    public static void main(String[] args) {
       // new ThreadTest("Google").start();
       // new ThreadTest("facebook").start();

        ThreadTest thread1 = new ThreadTest("Google");
        ThreadTest thread2 = new ThreadTest("Facebook");
        thread1.start();
        thread2.start();

        AnotherThread thread3 = new AnotherThread();
        thread3.start();
    }

}
class ThreadTest extends Thread{
                public ThreadTest(String str){
                    super(str);
                }

                public void run(){
                    for (int i=0; i<2;i++){
                        System.out.println("Loop"+i+":"+getName());
                        try{
                            System.out.println("Loop"+i+":waiting:"+getName());
                            sleep(1000);
                        }catch (InterruptedException e){

                        }
                    }
                System.out.println("Thread finished for " + getName());
                }
    }


class AnotherThread extends Thread{
    public void run(){
        System.out.println("Another Thread");
    }
}