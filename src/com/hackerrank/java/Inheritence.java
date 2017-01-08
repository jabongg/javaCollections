package com.hackerrank.java;

/**
 * Created by ejangpa on 10/12/2016.
 */
import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores){
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public char calculate() {
        int average = 0;
        for(int i = 0; i < testScores.length; i++){
            average += testScores[i];
        }
        average = average / testScores.length;

        if(average >= 90) {
            return 'O'; // Outstanding
        }
        else if(average >= 80) {
            return 'E'; // Exceeds Expectations
        }
        else if(average >= 70) {
            return 'A'; // Acceptable
        }
        else if(average >= 55) {
            return 'P'; // Poor
        }
        else if(average >= 40) {
            return 'D'; // Dreadful
        }
        else {
            return 'T'; // Troll
        }
    }
}



class Inheritence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = "jb";//scan.next();
        String lastName = "patel";//scan.next();
        int id = 2372421;//scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

      //  Person p = new Person(firstName, lastName, id);
       // p.printPerson();
       // System.out.println("Grade: " + p.calculate() );

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}