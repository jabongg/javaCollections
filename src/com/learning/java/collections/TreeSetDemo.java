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
        // your code goes here
        try{
            Set s = new TreeSet();
            s.add("Aron");
            s.add(1);
            Iterator iter = s. iterator();
            while(iter.hasNext()) {
                System.out.println(iter.next());
            }
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}