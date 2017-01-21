package com.codility;

/**
 * Created by ejangpa on 1/20/2017.
 */

/**
 *
 Task description
 A zero-indexed array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

 A[P] + A[Q] > A[R],
 A[Q] + A[R] > A[P],
 A[R] + A[P] > A[Q].
 For example, consider array A such that:

 A[0] = 10    A[1] = 2    A[2] = 5
 A[3] = 1     A[4] = 8    A[5] = 20
 Triplet (0, 2, 4) is triangular.

 Write a function:

 class Solution { public int solution(int[] A); }
 that, given a zero-indexed array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

 For example, given array A such that:

 A[0] = 10    A[1] = 2    A[2] = 5
 A[3] = 1     A[4] = 8    A[5] = 20
 the function should return 1, as explained above. Given array A such that:

 A[0] = 10    A[1] = 50    A[2] = 5
 A[3] = 1
 the function should return 0.

 Assume that:

 N is an integer within the range [0..100,000];
 each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 Complexity:

 expected worst-case time complexity is O(N*log(N));
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.
 Copyright 2009–2017 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

 */
public class Triangle {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        //i'm using bubble sort for sorting the array elements.
        bubbleSort(A);
        // sum of two edges must be greater than the third edge to form a triangle.
        for (int i = 0; i < A.length - 3; i++) {
            if ( A[i+1] + A[i + 2] > A[i] ) {
                return 1;
            }
        }
        return 0;
    }
    //sorts the array in decreasing order
  static int[]  bubbleSort(int[] A) {
      for (int i = 0; i < A.length; i++) {
          for(int j = i + 1; j < A.length; j++){
              if (A[i] < A[j]) {
                  int temp = A[j];
                  A[j] = A[i];
                  A[i] = temp;
              }
          }
      }
      return A;
  }
    //prints array Elements
    public static void printArrayElements(int[] B) {
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + "\t");
        }
    }

    public static void main(String[] args) {
        // i'm taking a demo array. You can take from Scanner also.
        int[] A = {10, 50, 5, 1};
        System.out.println(solution(A));
        printArrayElements(A);
    }
}
