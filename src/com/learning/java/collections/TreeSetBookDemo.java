package com.learning.java.collections;

/**
 * Created by ejangpa on 1/27/2017.
 */
import java.util.*;
import java.lang.*;

public class TreeSetBookDemo {
    public static void main(String[] args) {
        Book b1 = new Book(4444, "Melting Of the Golden God 1", "JangBahadur Patel", "Benten Publications", 1000);
        Book b2 = new Book(2222, "Melting Of the Golden God 2", "JangBahadur Patel", "BPB Publications", 5000);
        Book b3 = new Book(3333, "Melting Of the Golden God 3", "JangBahadur Patel", "Pothi Publications", 4000);
        Book b4 = new Book(1111, "Melting Of the Golden God 4", "JangBahadur Patel", "Arihant Publications", 3000);

        Set<Book> book = new TreeSet<>();
       // ArrayList<Book> book = new ArrayList<>();
        book.add(b1);
        book.add(b2);
        book.add(b3);
        book.add(b4);
        System.out.println(book.size());
        System.out.println(book);

        // traversing treeset
/*        for (Book b : book) {
            System.out.println(b.ISBN + " " + b.bookName + " " + b.authorName + " " + b.publisherName + " " + b.noOfCopies);
        }*/


        Iterator<Book> iterator = book.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            System.out.println(b.ISBN + " " + b.bookName + " " + b.authorName + " " + b.publisherName + " " + b.noOfCopies);

            //System.out.println(iterator.next().ISBN);
            //System.out.println(iterator.next().bookName);
           // System.out.println(iterator.next().authorName);
            //System.out.println(iterator.next().publisherName);
            //System.out.println(iterator.next().noOfCopies);

/*            System.out.println(iterator.next().ISBN + " " + iterator.next().bookName + " " + iterator.next().authorName
                + " " + iterator.next().publisherName + " " + iterator.next().noOfCopies);*/
        }
        System.out.println();

    }
}

 class Book implements Comparable<Book> {
    int ISBN;
    String bookName;
    String authorName;
    String publisherName;
    int noOfCopies;
    public Book(int ISBN,
                String bookName,
                String authorName,
                String publisherName,
                int noOfCopies) {

        this.ISBN 			=  ISBN;
        this.bookName		= bookName;
        this.authorName		= authorName;
        this.publisherName 	= publisherName;
        this.noOfCopies		= noOfCopies;
    }

    //implementing compareTo() method of Comparable
     // resembles the signum funtion of Math.
     public int compareTo(Book book) {
         if (ISBN > book.ISBN) {
             return 1;
         } else if (ISBN < book.ISBN){
             return -1;
         } else {
             return 0;
         }
     }

}
