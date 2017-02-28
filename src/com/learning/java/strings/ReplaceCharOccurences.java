package com.learning.java.strings;

/**
 * Created by ejangpa on 2/20/2017.
 */
public class ReplaceCharOccurences {
    public static void main(String[] args) {

        String str = "hellothisworldisgoingtodie";
        String strReplaced = str.replaceAll("o","");

        System.out.println(strReplaced);

        String line = "foo";
        line = line.replaceAll("f", "");
        System.out.println(line);

    }
}
