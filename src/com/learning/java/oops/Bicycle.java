package com.learning.java.oops;

/**
 * Created by ejangpa on 10/4/2016.
 */
public class Bicycle implements Cloneable{
    int cadence;
    int speed;
    int gear;

    public Bicycle(int startCadence, int startSpeed, int startGear){
        cadence = startCadence;
        speed   = startSpeed;
        gear    = startGear;

        System.out.println(cadence);
        System.out.println(speed);
        System.out.println(gear);
    }

    public void setCadence(int newValue) {
        cadence = newValue;
        System.out.println(cadence);
    }

    public void setGear(int newValue) {
        gear = newValue;
        System.out.println(gear);
    }
    public void speedUp(int speedIncrement) {
        speed = speed + speedIncrement;
        System.out.println("incremented speed " + speed);
    }

    public void applyBrakes(int speedDecrement) {
        speed = speed - speedDecrement;
        System.out.println("decremented speed" + speed);
    }


    public  static void main (String args []) throws CloneNotSupportedException {
        Bicycle cycle1 = new Bicycle(10,15,20);
        Bicycle cycle2 = cycle1;
       // Bicycle cycle3 = super.clone();
       // System.out.print(cycle1.equals(cycle3));
       // MountainBike mBike = new MountainBike(10,15,20,18);

        System.out.println(cycle1.equals(cycle1));
        System.out.println(cycle1.equals(cycle2));
        System.out.println("cycle1" + cycle1.hashCode());
        //System.out.print(cycle1.equals(cycle2));
        System.out.println("cycle2" + cycle2.hashCode());
        System.out.println();
        System.out.print(cycle1.equals(null));

       // cycle.setCadence(20);
       // cycle.applyBrakes(5);
       // cycle.setGear(40);
    }
}


class MountainBike extends Bicycle{
    int seatHeight;
    public MountainBike (
            int startSeatHeight,
            int startCadence,
            int startGear,
            int startSpeed) {
        super(startCadence, startGear, startSpeed);
        seatHeight = startSeatHeight;
    }

    public void setSeatHeight(int newValue){
        seatHeight = newValue;
    }
}