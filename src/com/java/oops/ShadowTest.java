package com.java.oops;

/**
 * Created by ejangpa on 10/6/2016.
 */
public class ShadowTest {
    int x = 0;
    class FirstLevel {
        public int x = 1;
       void  methodInFirstLevel(int x){
           System.out.println(" x " + x);
           System.out.println("this.x " + this.x);
           System.out.println("ShadowTest.this.x " + ShadowTest.this.x);
        }

    }

    public  static void main (String args []){
        ShadowTest shadow = new ShadowTest();
        ShadowTest.FirstLevel level = shadow.new FirstLevel();
        level.methodInFirstLevel(23);
    }
}
