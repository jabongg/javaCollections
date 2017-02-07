package com.hackerrank.java.algorithms.bitmanipulation;

/**
 * Created by ejangpa on 2/2/2017.
 */

import java.util.*;

public class LonelyInteger {
/*
 * Complete the function below.
 */
    static int maxXor(int l, int r) {
        int[] rangeArray = new int[(r - l) + 1];
        int index = -1;
        for (int i = l; i <= r; i++) {
            index++;
            rangeArray[index] = i;
        }

        int max = -1;
        for (int i = 0; i < rangeArray.length; i++) {
            for (int j = i; j < rangeArray.length; j++) {
                int currentXORValue = rangeArray[i] ^ rangeArray[j];
                if (currentXORValue > max) {
                    max = currentXORValue;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);
    }
}
