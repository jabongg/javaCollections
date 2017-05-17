package com.hackerrank.algorithms;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FightTheMonsters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hit = in.nextInt();
        int t = in.nextInt();
        int[] h = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
            
            int killedMonsters = countKilledMonsters(h, t, hit);
            System.out.println(killedMonsters);
            
        in.close();
    }
    
    private static int countKilledMonsters(int[] monstersHealth, int time, int hit) {
        int killedMonsters = 0;
        //bubble sort
        //sortIncreasingHealth(monstersHealth);
        
        sort(monstersHealth, 0, monstersHealth.length - 1);
        
        int lastMonsterHealth = Integer.MIN_VALUE;
        for (int i = 0; i < monstersHealth.length; i++) {
            while ((monstersHealth[i] > 0) && (time > 0)) {
                monstersHealth[i] = monstersHealth[i] - hit;
                time--;
                lastMonsterHealth = monstersHealth[i];
            }
            if (lastMonsterHealth <= 0) {
                killedMonsters++;
            }
            if (time == 0) {
                break;
            }
        }
        return killedMonsters;
    }
    
    
    
    private static void sortIncreasingHealth(int[] monstersHealth) {
        for (int i = 0; i < monstersHealth.length; i++) {
            for (int j = i + 1; j < monstersHealth.length; j++) {
                if (monstersHealth[i] > monstersHealth[j]) {
                    int temp            = monstersHealth[i];
                    monstersHealth[i]   = monstersHealth[j];
                    monstersHealth[j]   = temp;
                }
            }
        }
    }
    
         // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
        static void merge(int arr[], int l, int m, int r)
        {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;
     
            /* Create temp arrays */
            int L[] = new int [n1];
            int R[] = new int [n2];
     
            /*Copy data to temp arrays*/
            for (int i=0; i<n1; ++i)
                L[i] = arr[l + i];
            for (int j=0; j<n2; ++j)
                R[j] = arr[m + 1+ j];
     
     
            /* Merge the temp arrays */
     
            // Initial indexes of first and second subarrays
            int i = 0, j = 0;
     
            // Initial index of merged subarry array
            int k = l;
            while (i < n1 && j < n2)
            {
                if (L[i] <= R[j])
                {
                    arr[k] = L[i];
                    i++;
                }
                else
                {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
     
            /* Copy remaining elements of L[] if any */
            while (i < n1)
            {
                arr[k] = L[i];
                i++;
                k++;
            }
     
            /* Copy remaining elements of R[] if any */
            while (j < n2)
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
     
        // Main function that sorts arr[l..r] using
        // merge()
        static void sort(int arr[], int l, int r)
        {
            if (l < r)
            {
                // Find the middle point
                int m = (l+r)/2;
     
                // Sort first and second halves
                sort(arr, l, m);
                sort(arr , m+1, r);
     
                // Merge the sorted halves
                merge(arr, l, m, r);
            }
        }
}
