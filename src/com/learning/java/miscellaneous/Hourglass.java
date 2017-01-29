package com.learning.java.miscellaneous;

/**
 * Created by ejangpa on 10/17/2016.
 */
import java.util.Scanner;

public class Hourglass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
*
*   1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 2 4 4 0
    0 0 0 2 0 0
    0 0 1 2 4 0
*
* */
        int arr[][] = new int[3][3];
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                arr[i][j] = in.nextInt();
            }
        }


//print

        for(int i = 0; i < 3; i++){
            int iCount = 1;
            for(int j = 0; j < 3; j++){
                if(iCount == 2){
                    System.out.print(arr[i][i] + " ");
                }
                else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
