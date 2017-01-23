package com.learning.java;

/**
 * Created by ejangpa on 1/23/2017.
 */

import java.util.*;

public class ComparableSortDemo  {
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al);
        System.out.println(al);

        for(Student st:al){
            System.out.println(st.rollNumber+" "+st.name+" "+st.age);
        }
    }
}

class Student implements Comparable<Student> {
    int rollNumber ;
    int age;
    String name;

    public Student(int rollNumber,  String name ,int age) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public int compareTo(Student student) {
        if (age == student.age) {
            return 0;
        }
        if (age > student.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
