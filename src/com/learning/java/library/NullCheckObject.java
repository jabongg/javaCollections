package com.learning.java.library;

/**
 * Created by ejangpa on 1/12/2017.
 */


import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class NullCheckObject {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        B iOne = null;
        iOne.m2();
        //	B.m2();
    }
}

class B {
   static void m2() {
        System.out.println("Hello");
    }
}