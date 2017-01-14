package com.java.oops;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ejangpa on 1/14/2017.
 */
public class StringTest {

    public static void main(String args[])
    {
        FileOutputStream out = null;
        try
        {
            out = new FileOutputStream("test.txt");
            out.write(122);
        }
        catch(IOException io)
        {
            System.out.println("IO Error.");
        }
        finally
        {
           try {
               out.close();
           } catch (IOException e) {
               System.out.println(e);
           }
        }
    }

}
