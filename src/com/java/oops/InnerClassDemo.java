package com.java.oops;
// inner class demo

/**
 * Created by ejangpa on 10/5/2016.
 */
public class InnerClassDemo {

    static int data = 30;
    private int speedInner = 40;

     class StaticNestedClass{
         void msg() {
            System.out.println("data is " + data);
            System.out.println(speedInner);
        }

    }

    public static void main(String[] args) {
        InnerClassDemo ind = new InnerClassDemo();
        InnerClassDemo.StaticNestedClass icd = ind.new StaticNestedClass();
        icd.msg();
        System.out.println(ind.speedInner);
      //  InnerClassDemo.StaticNestedClass icd = new InnerClassDemo.StaticNestedClass();
       // icd.msg();
        //InnerClassDemo.StaticNestedClass.msg();
    }
  /*  class InnerClass{

    }*/
}
