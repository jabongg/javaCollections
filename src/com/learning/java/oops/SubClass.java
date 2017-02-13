package com.learning.java.oops;

/**
 * Created by ejangpa on 2/8/2017.
 */
public class SubClass extends SuperClass {

    public SubClass() {
        super();
        System.out.println("sub class constructor");
    }

    public void printHello() {
        System.out.println("Hello from sub class");
      //  super.printHello();
     //   System.out.println(super.pet);
        return;
    }
    // main
    public static void main(String[] args) {

        SubClass subClass = new SubClass();
        subClass.printHello();
    }
}
