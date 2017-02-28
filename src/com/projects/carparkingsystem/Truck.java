package com.projects.carparkingsystem;

/**
 * Created by ejangpa on 1/23/2017.
 */

public class Truck extends Vehicle {

    private int numOfContainers;

    public Truck() {
        super();
    }

    public Truck(String model, String color, int numOfWheels, String transmission, int numOfContainers) {
        super(model, color, numOfWheels, transmission);
        this.numOfContainers = numOfContainers;
    }

//getters

    public int getnumOfContainers() {
        return numOfContainers;
    }

    //setter
    public void setnumOfContainers() {
        this.numOfContainers = numOfContainers;
    }

    //Method
    public void printTruckdetails() {
        super.printDetails();
        System.out.println(" Number of Containers in this Truck are: " + this.numOfContainers);

    }

}