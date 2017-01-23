package com.learning.java;

/**
 * Created by ejangpa on 1/21/2017.
 */
public class MethodCheck {
    public static void main(String[] args) {
        AggregationTest aggregationTest = new AggregationTest();
        aggregationTest.display();
    }
}

class AggregationTest {
    public void display() {
        System.out.println("in display method");
    }
}
