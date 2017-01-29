package com.learning.java.oops;

/**
 * Created by ejangpa on 1/23/2017.
 */
public class StaticVariableDemo {

    static int count = 0;
    static {
        System.out.println("static block 1");
    }

    //instance block
    {
        System.out.println("static block");
    }

    //static block
    static {
        System.out.println("static block 2");
    }

    static void  getName() {
        System.out.println("sarika");

    }

    static void getMyStory() {
        System.out.println("get stories");
    }

    public static void main(String[] args) {
        StaticVariableDemo staticVariableDemo = new StaticVariableDemo();
        //System.out.println(staticVariableDemo.getCount());
        //System.out.println(staticVariableDemo.getCount());

        StaticVariableDemo.getMyStory();
        StaticVariableDemo.getName();

        staticVariableDemo.getMyStory();
        staticVariableDemo.getName();

        for (int i = 0; i < 5; i++) {
           // count = 0;
            count++;
            System.out.println(count);
        }
    }

}
