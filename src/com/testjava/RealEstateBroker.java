//package com.hackerrank.java;
// selling maximum houses
import java.util.Scanner;

/**
 * Created by ejangpa on 11/23/2016.
 */
public class RealEstateBroker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfClients = scan.nextInt();
        int numOfUnsoldHouses = scan.nextInt();
        int [] a = new int [numOfClients];
        int [] p = new int [numOfClients];
        int [] x = new int [numOfUnsoldHouses];
        int [] y = new int [numOfUnsoldHouses];

        for(int i = 0; i < numOfClients; i++) {
            a[i] = scan.nextInt();
            p[i] = scan.nextInt();
        }

        for(int j = 0; j < numOfUnsoldHouses; j++) {
            x[j] = scan.nextInt();
            y[j] = scan.nextInt();
        }

// calculate number of Houses sold
        int numOfHousesSold = calculateSoldHouses(a, p, x, y, numOfUnsoldHouses, numOfClients);
        System.out.print(numOfHousesSold);
    }

    // calculating number of sold houses
    static int calculateSoldHouses(int [] a, int [] p, int [] x, int [] y , int numOfUnsoldHouses, int numOfClients) {
        int count = 0;
        boolean isSold = false;
        //boolean oneForSold = true;
        boolean [] houseIsSold = new boolean [numOfUnsoldHouses];
        for(int i = 0; i < numOfClients; i++) {
            for(int j = 0; j < numOfUnsoldHouses; j++) {
                if(x[j] >= a[i] && y[j] <= p[i]) {
                    if(houseIsSold[j] != true) {
                        isSold = true;  // house can be sold
                        houseIsSold[j] = isSold;
                        count++;
						break;
                    }
                }
            }
        }
		for(int i = 0; i < numOfUnsoldHouses; i++) {
			System.out.print("\t" + houseIsSold[i]);
		}
		System.out.println();
		System.out.print(houseIsSold);
        return count;
    }
}
