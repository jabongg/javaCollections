package com.learning.java.exceptionhandling;

import java.io.IOException;

/**
 * Created by ejangpa on 2/20/2017.
 */
public class TestThrow1 {

    static void validateAgain(int age) {
        if (age < 18) {
            try {
                throw new IOException("Not able to vote");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("welcome to vote");
        }
    }
    static void validate(int age) {
        validateAgain(age);
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code");
    }
}
