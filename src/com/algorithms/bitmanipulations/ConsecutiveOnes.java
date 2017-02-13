package com.algorithms.bitmanipulations;

/**
 * Created by ejangpa on 2/13/2017.
 */
import java.util.Scanner;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxContiguousOnesCount = maxConsecutiveOnes(n) /*findConsecutiveOnes(n)*/;
        System.out.println(maxContiguousOnesCount);
    }

    /**
     * finds consecutive ones in the binary representation of a number
     * @param n
     * @return
     */
    static int findConsecutiveOnes(int n) {

        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);
        char[] binaryArray = binaryString.toCharArray();
        int maxContiguousOnesCount = 0;
        int currentContiguousOnesCount = 1;
        int i = 1;
        while (i < binaryArray.length) {
            if (binaryArray[i] == '1' ) {
                if (binaryArray[i] == binaryArray[i - 1]) {
                    currentContiguousOnesCount++;
                    if (maxContiguousOnesCount < currentContiguousOnesCount) {
                        maxContiguousOnesCount = currentContiguousOnesCount;
                    }
                }
            } else {
                currentContiguousOnesCount = 1;
            }
            i++;
        }

        return maxContiguousOnesCount;
    }

    private static int maxConsecutiveOnes(int n) {
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);

        int maxContiguousOnesCount = 0;
        //count the number of iterations to reach x = 0;

        while (n != 0) {
            n = n & (n << 1);
            maxContiguousOnesCount++;
        }
        return maxContiguousOnesCount;
    }
}
