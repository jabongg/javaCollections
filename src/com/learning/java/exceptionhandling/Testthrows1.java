package com.learning.java.exceptionhandling;

import java.io.IOException;

/**
 * Created by ejangpa on 2/20/2017.
 */

public class Testthrows1 {
    public static void main(String[] args)  {
        Testthrows1 testthrows1 = new Testthrows1();
       try {
           testthrows1.p();
       } catch (Exception e) {
           e.printStackTrace();
       }
        System.out.println("normal flow");
    }

    void p() throws IOException {
        n();
    }

    void n() throws IOException{
        m();
        System.out.println("in m()");
    }

    void m() throws IOException {
        throw new IOException("device error");
        //System.out.println("in m()");
    }
}
