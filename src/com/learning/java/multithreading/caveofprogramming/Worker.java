package com.learning.java.multithreading.caveofprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ejangpa on 2/16/2017.
 */
public class Worker {

    Random random = new Random();

    private List<Integer> list1 = new ArrayList<Integer>();
    private List<Integer> list2 = new ArrayList<Integer>();

    public void stage1() {
        try {
            Thread.sleep(0, 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        list1.add(random.nextInt(100));
    }

    public void stage2() {
        try {
            Thread.sleep(0, 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        list2.add(random.nextInt(100));
    }

    public void process() {
        for (int i = 0; i < 1_000; i++) {
            stage1();
            stage2();
        }
    }
    public void main() {
        System.out.println("Hello Worker !");
        System.out.println("main starting ...");

        long start  = System.currentTimeMillis();
        process();
        long end    = System.currentTimeMillis();

        System.out.println("time taken :" + (end - start));
        System.out.println("list1 size :" + list1.size());
        System.out.println("list2 size :" + list2.size());
    }
}
