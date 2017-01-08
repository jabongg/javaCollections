package com.hackerrank.java;

import java.util.*;

public class RansomNote {
    //  Map<String, Integer> magazineMap;
    //  Map<String, Integer> noteMap;

    public RansomNote(String magazine, String note) {


        String[] noteArray = note.split(" ");
        String[] magazineArray = magazine.split(" "); //split on word boundries

        int count = 0;
        int m= noteArray.length;
        int n= magazineArray.length;

        for(int i = 0; i < m; i++ ) {
            for(int j = 0; j < n; j++) {
                if(noteArray[i].equals(magazineArray[j])) {
                    count++;
                    magazineArray[i]=magazineArray[n-1];
                    n = n - 1;
                    break;
                }
                //Arrays.asList(noteArray).contains("ram");
            }
            //search array for word

        }


        if(count == noteArray.length)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    // public boolean solve() {

    //}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();

    }
}
