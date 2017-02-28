package com.learning.java.exceptionhandling;

/**
 * Created by ejangpa on 2/20/2017.
 */
public class TestExceptionPropagation1 {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){

            n();

    }
    public static void main(String args[]){
        TestExceptionPropagation1 obj=new TestExceptionPropagation1();
        try{
        obj.p();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("exception handled");}
        System.out.println("normal flow...");
    }
}
