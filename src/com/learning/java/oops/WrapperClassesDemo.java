package com.learning.java.oops;

/**
 * Created by ejangpa on 2/8/2017.
 */
public class WrapperClassesDemo {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer("10");
       // Integer c = new Integer("ten");
        System.out.println(a + " " + b );

        Float f = new Float(10f);
        Float f2 = new Float("10.5f");
        Float f3 = new Float(10.5);
        Float f4 = new Float("10.5");

        Long l2 = new Long(3);
        Long l4 = new Long(32L);
       // Long l3 = new Long("3l");
        //Long l5 = new Long("32L");


        Boolean b1 = new Boolean("left");
        Boolean b4 = new Boolean("true");
        System.out.println(b1.equals(b4));

        Boolean b2 = new Boolean("");
        Boolean b3 = new Boolean("TrUe");
        System.out.println(b3);
        System.out.println(b2.equals(b3));
    }
}
