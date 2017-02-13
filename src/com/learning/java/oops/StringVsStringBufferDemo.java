package com.learning.java.oops;

/**
 * Created by ejangpa on 2/8/2017.
 */
public class StringVsStringBufferDemo {
    public static void main(String[] args) {
        String str1 = new String("Durga");
        String str2 = new String("Durga");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


        StringBuffer sb1 = new StringBuffer("jb");
        StringBuffer sb2 = new StringBuffer("jb");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        System.out.println(sb1.substring(0));


        String s1 = new String("jangbahadur");
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        String s4 = s1.toString();
        System.out.println(s4 == s1);

        final StringBuffer sb3 = new StringBuffer();
        sb3.append("jangbahadurpatel");
        sb3.append("q");
        System.out.println(sb3 + " " + sb3.length());

        sb3.append("jangbahadurpatel");
        sb3.append("q");
        sb3.append("r");

        sb3.append("jangbahadurpatel");
        sb3.append("q");
        System.out.println(sb3 + " " + sb3.length());

        sb3.append("jangbahadurpatel").append("q").append("r").deleteCharAt(2).insert(2,"343");
        sb3.append("q");
        sb3.append("r");
        sb3.append("s");
        System.out.println(sb3.capacity());
    }
}
