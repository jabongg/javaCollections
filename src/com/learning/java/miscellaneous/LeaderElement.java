package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 12/6/2016.
 */
//finding leader in an Array . A leader is an element which is larger than all the elements in the array to its right.
import java.util.Scanner;

class LeaderElement {
    public static void main (String args []) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int leaderArray [] = new int [n];    // 98 23 54 12 20 7 27
        for(int i = 0; i < n; i++) {
            leaderArray[i] = scan.nextInt();
        }

        findLeader(leaderArray, n);
    }

    static void findLeader(int [] leaderArray, int n) {
        int currentleader = leaderArray[n - 1];
        int prevLeader = leaderArray[n - 1];
        int i = n-1;
        while(i >= 1) {
            while(leaderArray[i] < leaderArray[i-1]) {
                currentleader = leaderArray[i-1];
                i--;
                if(i == 0) {
                    //System.out.println(currentleader);
                    break;
                }
                //prevLeader = currentleader;
            }
            if(leaderArray[i] >= prevLeader) {
                System.out.println(leaderArray[i]);
                prevLeader = leaderArray[i];
                i--;
            }
            else {
                i--;
            }
        }
    }
}