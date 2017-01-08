package com.learning.java;

/**
 * Created by ejangpa on 9/30/2016.
 */
class MyThread extends Thread
{
    MyThread()
    {
        System.out.print(" MyThread");
    }
    public void run()
    {
        System.out.print(" bar");
    }
    public void run(String s)
    {
        System.out.println(" baz");
    }
}
public class TestThreads
{
    public static void main (String [] args)
    {
        Thread t = new MyThread()
        {
            public void run()
            {
                System.out.println(" foo");
            }
        };
        t.start();
    }
}