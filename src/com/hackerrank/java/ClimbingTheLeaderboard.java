package com.hackerrank.java;

/**
 * Created by ejangpa on 12/17/2016.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }

        int[] rankArray = new int[n];
        // your code goes here
        int rank = 1; int flag = 0;
        int j = 0;

        Set setvalues = new TreeSet();

        for( int s : scores) {
            setvalues.add(s);

        }


        Iterator itr=setvalues.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

//        List list = new ArrayList(setvalues);
//        Collections.reverse(list);

//        System.out.println( "List : " + list);




        for( int a : alice) {
           // List list = new ArrayList(setvalues);
            setvalues.add(a);
//            System.out.println(" List : " + list);
            List list = new ArrayList(setvalues);
            Collections.reverse(list);
            System.out.println((list.indexOf(a) + 1));
//            list.indexOf(a);

        }
        /*



                for(int i = 0; i < scores.length; i++) {
            if(i == scores.length-1 ) {
                rankArray[j] = scores[i];
            }
            else {
                if (scores[i] == scores[i + 1]) {
                    continue;//rankArray[i] = scores[i];
                }
                rankArray[j] = scores[i];
            }

            j++;
        }


        for(int i = 0; i < alice.length; i++) {
            for (int k = 0; k < rankArray.length; k++) {
                if ( alice[i] >= rankArray[k]) {
                    System.out.println(k+1);
                    break;
                }
            }
        }*/
    }


}
