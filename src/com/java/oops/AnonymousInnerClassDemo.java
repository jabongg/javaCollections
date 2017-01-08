package com.java.oops;

/**
 * Created by ejangpa on 10/6/2016.
 */
public class AnonymousInnerClassDemo  {
    public static void main (String args []){

        Person p = new Person(){
            void eat(){
                System.out.println("nice Fruits");
            }
        };
        p.eat();
    }
}


abstract class Person{
     abstract void eat()/*{
         System.out.println("in Person");
     }*/;
}