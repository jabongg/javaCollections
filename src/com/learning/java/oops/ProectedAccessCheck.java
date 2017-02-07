package com.learning.java.oops;

/**
 * Created by ejangpa on 1/31/2017.
 */
public class ProectedAccessCheck implements Cloneable{
    private String carBrand = "BMW";
    public String carModel = "X3";
    protected String carShowRoom = "RacerWorld";
    public static void main(String[] args) throws CloneNotSupportedException{
        ProectedAccessCheck proectedAccessCheck = new ProectedAccessCheck();
        Bicycle b = new Bicycle();
        int x = b.speed;
    }
}
