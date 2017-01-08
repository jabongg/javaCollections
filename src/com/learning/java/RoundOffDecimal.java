package com.learning.java;

/**
 * Created by ejangpa on 12/30/2016.
 */
import java.text.DecimalFormat;

public class RoundOffDecimal {
    public static void main (String args[]) {

        DecimalFormat df=new DecimalFormat("0.00");
        String formate = df.format(12.3232);
        //double finalValue = (Double) df.parse(formate) ;
        System.out.println(formate);
    }
}
