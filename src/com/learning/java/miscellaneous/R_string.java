package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 27/01/2017.
 */
import java.lang.*;
import java.util.Scanner;

public class R_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayToReverse = scanner.nextLine();
        char[] arrayStr = arrayToReverse.toCharArray();
        for (int i = 0; i < arrayStr.length / 2; i++) {
            char temp;

            temp = arrayStr[(arrayStr.length - 1) - i];
            arrayStr[(arrayStr.length - 1) - i] = arrayStr[i];
            arrayStr[i] = temp;
        } //end of for loop

        System.out.println(arrayStr);
    } // end of main
} 