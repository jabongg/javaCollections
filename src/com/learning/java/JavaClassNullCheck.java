package com.learning.java;

/**
 * Created by ejangpa on 1/21/2017.
 */
public class JavaClassNullCheck {

   public JavaClassNullCheck(Object o) {
        System.out.println("Object" + o);
    }
    public JavaClassNullCheck(String s) {
        System.out.println("String" + s);
    }
    public static void main(String[] args) {
        JavaClassNullCheck javaClassNullCheck = new JavaClassNullCheck("sfds");
       JavaClassNullCheck javaClassNullCheck1 = new JavaClassNullCheck(javaClassNullCheck);
        javaClassNullCheck.a(5);
        javaClassNullCheck1.a(6);

    }

    public int a (int par){
        Integer k =1;
        JavaClassNullCheck javaClassNullCheck2 = new JavaClassNullCheck(this);
        System.out.println(this.getClass());
        return  k;
    }
}
