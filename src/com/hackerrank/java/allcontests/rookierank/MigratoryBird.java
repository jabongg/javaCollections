package com.hackerrank.java.allcontests.rookierank;

/**
 * Created by ejangpa on 2/11/2017.
 */

import java.util.*;

public class MigratoryBird {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i = 0; types_i < n; types_i++) {
            types[types_i] = in.nextInt();
        }
        // your code goes here
        Arrays.sort(types);
        int mostCommonBirdType = findMostCommonBird(types);
        System.out.println(mostCommonBirdType);
    }

    public static int findMostCommonBird(int[] types) {
        int mostCommonBirdType = 0;
        int count = 1;
        int lastMaxBirdTypeIndex = -1; // taking negative
        int maxCount = 0;
        for (int i = 0; i < types.length - 1; i++) {
            if (types[i] == types[i + 1]) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                    mostCommonBirdType = types[i];
                    count = 1;
                }
            }

        }
        return mostCommonBirdType;
    }

    public static void  bubbleSort(int[] types) {
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < types.length; j++) {
                if (types[i] > types[j]) {
                    int temp;
                    temp = types[i];
                    types[i] = types[j];
                    types[j] = temp;
                }
            }
        }
    }

}
