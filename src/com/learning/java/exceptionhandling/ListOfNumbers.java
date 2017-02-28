package com.learning.java.exceptionhandling;

/**
 * Created by ejangpa on 2/20/2017.
 */

import java.io.IOException;
import  java.util.List;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileWriter;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() {
        // The FileWriter constructor throws IOException, which must be caught.
        try{
            PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < SIZE; i++) {
                // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                out.println("Value at: " + i + " = " + list.get(i));
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
