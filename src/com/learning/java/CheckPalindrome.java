
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
