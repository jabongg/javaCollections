package com.learning.java.collections;

/**
 * Created by ejangpa on 1/27/2017.
 */
import java.util.*;

/**
 * Driver Class
 */
public class EqualsHashcodeDemo {
    public static void main(String[] args) {
        Student student1 = new Student("HB121");
        Student student2 = new Student("HB121");
        System.out.println(student1.equals(student2));
        System.out.println(student1);
        System.out.println(student2);

        Map<Student, ReportCard> studentsReport = new HashMap<>();
        studentsReport.put(student1, new ReportCard());
        studentsReport.put(student2, new ReportCard());

        System.out.println(studentsReport.size() + student1.getRegistrationNumber());
        System.out.println(studentsReport.keySet());
    }
}

/**
 * Student class
 */
class Student {
    private String registrationNumber;
    public Student(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    //getter
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    //setter
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

/**
 * Report Card Class
 */
class ReportCard {
    private int mathScore;
    public ReportCard() {
        this.mathScore = (int) (Math.random() * 100);
    }
    //getter
    public int getMathScore() {
        return mathScore;
    }
    //setter
    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

}