package com.learning.java.designpattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ejangpa on 2/22/2017.
 */
public class Singleton  /*Serializable*/ {
    //private static Singleton soleInstance  = new Singleton(); //eager initialization
    private static Singleton soleInstance  = null;
    // private constructor
    private Singleton() {
        System.out.println("creating ..");
    }

    public static Singleton getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new Singleton();
        }
        return soleInstance;
    }
}

class TestClass {

    // threads
    static void useSingleton() {
        Singleton singleton = Singleton.getSoleInstance();
        print("singleton",singleton);
    }

    public static void main(String[] args)  {
/*
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new T);
        executorService.submit();
        executorService.shutdown();*/

        /*
        Singleton s1 = Singleton.getSoleInstance();
        Singleton s2 = Singleton.getSoleInstance();

        print("s1", s1);
        print("s2", s2);*/

        //--------------------------------------------
       /* // Reflection
        try {
            Class clazz =  Class.forName("patterns.Singleton");
            Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
            ctor.setAccessible(true);
            Singleton s3 = ctor.newInstance();
            print("s3", s3);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //-------------------------------------------
       /*// Serialization
        try {
            FileOutputStream fos = new FileOutputStream("s2.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
        // Deserialization
            FileInputStream fis = new FileInputStream("s2.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Singleton s4 = (Singleton) ois.readObject();
            print("s4", s4);


        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        //--------------------------------------------

       /*// Cloneable
        try {
            Singleton s5 = (Singleton) s2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/

       //---------------------------------------------
    }

    static void print(String name, Singleton object ) {
        System.out.println(String.format("Object : %s, HashCode : %d" ,name , object.hashCode()));
    }
}
