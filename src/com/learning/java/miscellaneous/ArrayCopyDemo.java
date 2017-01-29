package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 10/17/2016.
 */

class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 1, 6);
        //
        //arraycopydemo(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
   /* static char[] arraycopydemo(char[] copyFrom, int index, char[] copyTo, 0, 7) {

    }*/
}