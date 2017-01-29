package com.learning.java.miscellaneous;

import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 * Created by ejangpa on 1/10/2017.
 */
public class CalendarDemo {
    public static void main(String[] args ) {
        Calendar calendarDemo = Calendar.getInstance();
        calendarDemo.add(Calendar.MONTH,-5);
        System.out.println(calendarDemo.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(calendarDemo.getTime());
        System.out.println(str);
    }
}
