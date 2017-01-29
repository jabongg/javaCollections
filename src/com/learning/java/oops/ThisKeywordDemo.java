package com.learning.java.oops;

/**
 * Created by ejangpa on 10/4/2016.
 */
public class ThisKeywordDemo {
        static public int x ;
        public int y ;
        private int finalVariable = initializeInstanceVariable();
        protected int initializeInstanceVariable (){
            return 7;
        }

        //constructor without this.
        public ThisKeywordDemo(int a, int b, int c) {
            x = a;
            y = b;
        }

        //constructor using this.
        public ThisKeywordDemo(int x, int y){
            this.x = x;
            this.y = y;
        }
    public static void main(String[] args) {
        System.out.println("in main");
        ThisKeywordDemo td1 = new ThisKeywordDemo(10, 15);
        ThisKeywordDemo td2 = new ThisKeywordDemo(10, 15, 20);
/*        System.out.println(td.x);
        System.out.println(td.y);
        System.out.println(ThisKeywordDemo.x);
        System.out.println(td.myPrinter());
        System.out.println(ThisKeywordDemo.myPrinter());*/
    }
    public static String myPrinter(){
        return "printing with HP Printer";
    }

    // an initializer block
    {
        System.out.println("Executing an intializer block");
    }

}




