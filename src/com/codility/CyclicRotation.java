package com.codility;

/**
 *
 Task description
 A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

 For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

 Write a function:

 class Solution { public int[] solution(int[] A, int K); }
 that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

 For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

 Assume that:

 N and K are integers within the range [0..100];
 each element of array A is an integer within the range [−1,000..1,000].
 In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 Copyright 2009–2017 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        for (int i = 0; i < K; i++) {

            int temp ;
            temp = A[A.length - 1];
            for (int m = A.length - 1; m > 0; m--) {
                A[m] = A[m - 1];
            }
            A[0] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        // i'm taking a sample array . You can take array elements using Scanner.
        int[] A = {1, 2, 3, 4, 5, 6, 7};

        // number of times Array is to be rotated to right. I'm rotating it by 3 but you can roate it by
        // number of times you wish by taking from Scanner.

        int k = 3;
        // passing values to the method.
        CyclicRotation cyclicRotation = new CyclicRotation();
        cyclicRotation.printArrayElements(A);
        System.out.println();
        int[] B = cyclicRotation.solution(A, k);
        cyclicRotation.printArrayElements(B);

    }

    public void printArrayElements(int[] B) {
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + "\t");
        }
    }
}
