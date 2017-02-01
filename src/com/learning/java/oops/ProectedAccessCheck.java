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
       // System.out.println(proectedAccessCheck.carBrand);

       // ProectedAccessCheck obj1 = new ProectedAccessCheck();
       // System.out.println(obj1.clone() != obj1);
        //System.out.println(obj1.clone().getClass() == obj1.getClass());
        //System.out.println(obj1.clone().equals(obj1));
    }
}
