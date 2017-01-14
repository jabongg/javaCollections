package com.learning.java.library;

/**
 * Created by ejangpa on 1/12/2017.
 */
public class PossibleCombinations {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        printCombinations(number);
    }

    /**
     * Prints all the possible combinations of numbers in the array.
     * @param number
     */
    static void printCombinations(int[] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                System.out.println(number[i]);
            }
        }
    }
}
