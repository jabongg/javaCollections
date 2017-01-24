package com.hackerrank.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * Created by ejangpa on 1/24/2017.
 */


public class RegExPatternsAndIntroToDatabases {
    public static void main(String[] args) {
        ArrayList<String> ss= new ArrayList();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 0; i < N; i++){
            String firstName = in.next();
            String emailID = in.next();


            String s = "gmail";
            int index = emailID.indexOf(s);
            if (index > 0){
                ss.add(firstName);
            }
        }
        Collections.sort(ss);

        for (String name : ss)
            System.out.println(name);
    }
}
