package com.learning.java.oops;

/**
 * Created by ejangpa on 2/11/2017.
 */
public class TestCP {

    int i = 10;
    {
        m4();
        System.out.println("first instance");
    }

    TestCP() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {


    //overriding
        P p = new P();
        p.marriage();

        C c = new C();
        c.marriage();
        c.m1();

        P  p1 = new C();
        p1.marriage();

        {
            System.out.println("hello test");
        }

        TestCP test = new TestCP();

       /* //overloading
        P p = new C();
        p.m1(10,1.5f);
        p.m1(10.3f,10);
       // p.m1(10.5f, 10.5f);
        // p.m1(10,10); //ambiguous method
        p.m1(32.f);
        p.m1(13.0F);
        p.m1('a');
        p.m1(10L);
        p.m1(10.5);
        p.m1(100);
        p.m1(10,10,10);*/
       // p.m1("jb");
       // p.m1(new Object());
      /*  p.m1(new StringBuffer("durga"));
        p.m1(new String("durga"));
        p.m1(null);*/
    }

    public void m4() {
        System.out.println(j);
    }
    {
        System.out.println("second instance block");

    }
    int j = 20;

}
