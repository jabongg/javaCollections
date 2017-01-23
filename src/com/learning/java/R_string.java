// string reverse program

package com.learning.java;

import java.lang.*;
import java.util.*;

public class R_string {
    public static void main(String[] args) {
        int[] abc = {5, 6, 7, 9, 12};
        System.out.println(abc);
        String arrayReverse = "Kankan";
        char[] arrayStr = arrayReverse.toCharArray();
        for (int i = 0; i < arrayStr.length / 2; i++) {
            char temp;

            temp = arrayStr[(arrayStr.length - 1) - i];
            arrayStr[(arrayStr.length - 1) - i] = arrayStr[i];
            arrayStr[i] = temp;
        } //end of for loop

        System.out.println(arrayStr);

        for (int i = 0; i < arrayStr.length ; i++) {
            System.out.print(arrayStr[i]);
        } // end of for loop
    } // end of main
} 