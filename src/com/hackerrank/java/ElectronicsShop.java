package com.hackerrank.java;

import java.util.Scanner;

/**
 * Created by ejangpa on 11/21/2016.
 */


public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }
//sort the arrays in reverse order
        sort(keyboards);
        display(keyboards);
        sort(pendrives);
        display(pendrives);
        maxPurchase(keyboards, pendrives , s);

    }
// calculating the maximum Purchase
    static void  maxPurchase(int [] keyboards, int [] pendrives , int moneyAvail) {
        if(keyboards[keyboards.length - 1] + pendrives[pendrives.length - 1] >= moneyAvail) {
            System.out.println("-1");
        }
        else {
            int itr = 0;
            int max = 0; boolean flag = false;
            for(int i = 0; i < keyboards.length; i++) {
                for(int j = 0; j < pendrives.length; j++) {
                    itr++;
                    if(keyboards[i] + pendrives[pendrives.length -1] > moneyAvail) {
                        break;
                    }
                    int currentSum = keyboards[i] + pendrives[j];
                    if(currentSum <= moneyAvail) {
                        if(flag == false){
                            max = currentSum ;
                          //  System.out.println(max);
                            flag = true;
                            break;
                        }
                        if(flag == true && currentSum >= max) {
                            System.out.println(currentSum);
                            break;
                        }

                    }
                }
            }
           // System.out.println("itr:" + itr);

        }

    }

//display the array elements
    static void display(int item []) {
        for(int i = 0; i < item.length; i++) {
            System.out.print(item[i] + "\t");
        }
        System.out.println("\n");
    }
    // sorting array in reverse order
   static int []  sort(int item []) {
        int temp = 0;
       for(int i = 0; i < item.length - 1; i++) {
           for(int j = i+1 ; j < item.length; j++) {
               if(item [i] < item[j]) {
                   temp = item[j];
                   item[j] = item[i];
                   item[i] = temp;
               }
           }
       }
        return item;
    }
}
