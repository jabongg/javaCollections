package com.learning.java;

/**
 * Created by ejangpa on 9/30/2016.
 */
class Test
{
    public static void main(String [] args) throws InterruptedException
    {

            for(int i = 0; i < args.length; i++)
            {
                System.out.println(Integer.parseInt(args[i]));
                Thread.currentThread().sleep(1000);
                System.out.println(Thread.currentThread().getName());
                Thread.currentThread().setName("MyThread");
                System.out.println(Thread.currentThread().getName());
            }

    }


}