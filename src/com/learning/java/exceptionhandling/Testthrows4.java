package com.learning.java.exceptionhandling;

import java.io.IOException;

/**
 * Created by ejangpa on 2/20/2017.
 */
public class Testthrows4 {
    public static void main(String[] args) throws  IOException {
        M m = new M();
        try {
            m.method();
        } catch (Exception e) {
            try {
                throw new Exception(e);  // re-throwing the same exception.
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

    }
}

class M {
    void method()throws IOException {
        throw new IOException("device error");
    }
}
