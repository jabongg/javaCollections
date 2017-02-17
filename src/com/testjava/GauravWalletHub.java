
/**
 * 1)Write an efficient algorithm to check if a string is a palindrome. A string is a palindrome if the string matches the reverse of string.
        */

package com.learning.java;

/**
 * Created by ejangpa on 12/22/2016.
 */
public class CheckPalindrome {
    public static void main (String args[]) {
        String s = "12121";
        char palindromeArray[] = s.toCharArray();
        boolean isPalindrome = checkingPalindrome(palindromeArray);
        System.out.println("is palindrome :" +isPalindrome);
    }
    static boolean checkingPalindrome(char [] palindromeArray) {
        boolean isPalindrome = false;
        int i ;
        int j = palindromeArray.length - 1;
        for(i = 0; i < j; i++) {
                if(palindromeArray[i] == palindromeArray[j]) {
                    j--;
                }
                else {
                    return isPalindrome;
                }
        }
        isPalindrome = true;
        return isPalindrome;
    }
}




/**
 * 2) Write an efficient algorithm to find K-complementary pairs in a given array of integers. Given Array A, pair (i, j) is K- complementary if K = A[i] + A[j];
 */

package com.learning.java;

import java.util.Scanner;

/**
 * Created by ejangpa on 12/23/2016.
 */
public class ComplementaryPairs {
    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int arraySize = scan.nextInt();
        int complementaryArray[] = new int[arraySize];
        for(int i = 0; i < complementaryArray.length; i++) {
            complementaryArray[i] = scan.nextInt();
        }
        /**
         * input format
         * 17 5 1 12 3 5 16
         *
         * */
        findComplementaryPairs(complementaryArray, K);
    }
    static void  findComplementaryPairs(int[] complementaryArray, int K) {
        for(int i = 0; i < complementaryArray.length - 1; i++) {
            for(int j = i + 1; j < complementaryArray.length  ; j++) {
                if(complementaryArray[i] + complementaryArray[j] == K) {
                    System.out.println(complementaryArray[i] + " " + complementaryArray[j]);
                }
            }
        }
    }
}
