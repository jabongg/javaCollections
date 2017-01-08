package com.learning.java;

/**
 * Created by ejangpa on 10/7/2016.
 */
public class LinearSearch {

    public static void main(String[] args) {
       int arr[] = new int[]{
                  1816
                , 1825
                , 1817
                , 1818
                , 1824
                , 1821
                , 1820
                , 1823
                , 1822
                , 1819
                , 1826
                , 1827
                , 1896
                , 1871
                , 1823
                , 1883
                , 1322
                , 1154
                , 1134
                , 1166
                , 1854
                , 1898
                , 1878
                , 1896
                , 1865
                , 1112
        };
    int counter = 0;
        for(int i = 12342400; i < 100000000; i++){
            if (counter == 1000_00_00){

            }
        }

        //searching the array for a particular element
        int numToSearch = 1896;

        // linear search
        linearSearch(arr , numToSearch);

        // sentinal linear search
        sentinalLinearSearch(arr , numToSearch);

    }

    static public  void linearSearch(int arr [], int numToSearch) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == numToSearch) {
                System.out.println(i);
                break;
            }
        }
    }

   public  static void  sentinalLinearSearch(int arr [] , int numToSearch){
       int i;
       arr[arr.length-1] = numToSearch;
       i = 0;
       for(; arr[i]!=numToSearch;i++){}
       if (i == arr.length)
           System.out.println("Not found !");

       else
           System.out.println("number Found at " + i + "th index ." );
    }
}
