package com.hackerrank.java;

/**
 * Created by ejangpa on 1/19/2017.
 */


import java.io.*;
        import java.util.*;

public class Polygons {

    static int countSquare = 0;
    static int countPolygon = 0;
    static int countRectangle = 0;

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            countNumbersOfEachPolygons(a, b, c, d);
        }
        System.out.println(countRectangle + " " + countSquare + " " + countPolygon);
    }

    public static void countNumbersOfEachPolygons(int a, int b, int c, int d) {
        if (a == c && b == d && a!=b  && a > 0 && b > 0) {
            countRectangle++;
        } else if (a == b  && b == c &&  c == d && a > 0 ) {
            countSquare++;
        } else {
            boolean flag = false;
            if (a < 0 || b < 0 || c < 0 || d < 0 ) {
                countPolygon++;
                flag = true;
            }
            if (flag == false) {
                countPolygon++;
            }
        }
    }
}