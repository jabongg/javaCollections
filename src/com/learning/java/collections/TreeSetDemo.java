package com.learning.java.collections;

/**
 * Created by ejangpa on 1/12/2017.
 */


import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TreeSetDemo {

    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("a".compareTo("b"));
        System.out.println("z".compareTo("b"));
        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo(null));
        Set s = new TreeSet();
        s.add(new StringBuffer("A"));
        s.add(new StringBuffer("B"));
        s.add(new StringBuffer("C"));
        s.add(new StringBuffer("D"));
        s.add(new StringBuffer("E"));
        System.out.println(s);



        System.out.println(s);
    }
}