package com.hackerrank.java.allcontests.rookierank;

/**
 * Created by ejangpa on 2/10/2017.
 */

import java.util.*;

public class HackerRankInAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            boolean containsHackerrank = containsHackerrank(s);
            if (containsHackerrank == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean containsHackerrank(String s) {
        char[] sampleArray = s.toCharArray();
        char[] hackerArray = {'h','a','c','k','e','r','r','a','n','k'};
        int k = 0;
        boolean containsHackerrank = false;
        if (sampleArray.length < hackerArray.length) {
            return containsHackerrank;
        }

        for (int i = 0; i < hackerArray.length; i++) {
            for (int j = k; j < sampleArray.length; j++) {
                if ((hackerArray[i] == sampleArray[j]) && (j >= k)) {
                    sampleArray[j] = '\0';
                    if (i == hackerArray.length - 1) {
                        containsHackerrank = true;
                    }
                    k = j;
                    break;
                }
                if ((j == sampleArray.length - 1) && (sampleArray[j] != hackerArray[i])) {
                    return containsHackerrank;
                }
            }
        }
        if (containsHackerrank == true) {
            return containsHackerrank;
        }
        return containsHackerrank;
    }
}
