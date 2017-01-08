package com.java.oops;

/**
 * Created by ejangpa on 11/11/2016.
 */
public  class   AbstractClassDemo extends AbstractImplDemo {
    public static void main (String args []) {
        AbstractImplDemo abstractObj  = new AbstractClassDemo();
        abstractObj.getSpeed();
    }

    void getSpeed(){
        System.out.println("the speed is 40Km/h");
    }
}

    abstract class AbstractImplDemo {
    abstract void getSpeed();
}