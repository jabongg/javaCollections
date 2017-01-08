package com.java.oops;

/**
 * Created by ejangpa on 1/5/2017.
 */
public class OverridingStaticAbstractMethods {
    public static void main(String[] args) {
       String str = "-3300";
        String str2 = "Str";

        try{
            int temp=Integer.parseInt(str2);
            System.out.println("Yes");
        }catch (Exception e){
            System.out.println("No");
        }

        System.out.println();
    }

}
