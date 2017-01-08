package com.learning.java.library;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ejangpa on 1/8/2017.
 */
public class LibraryCatalogue {
    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCatalogue(Map<String, Book> bookCollection, int lengthOfCheckOutPeriod,
                            double initialLateFee, double feePerLateDay) {
        this.bookCollection                  = bookCollection;
        this.lengthOfCheckOutPeriod          = lengthOfCheckOutPeriod;
        this.initialLateFee                  = initialLateFee;
        this.lengthOfCheckOutPeriod          = lengthOfCheckOutPeriod;
        this.feePerLateDay                   = feePerLateDay;

    }
    public LibraryCatalogue(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;

    }
    //getters
    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }
    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }
    public int getCurrentDay() {
        return this.currentDay;
    }
    public int getLengthOfCheckOutPeriod() {
        return this.lengthOfCheckOutPeriod;
    }
    public double getInitialLateFee() {
        return this.initialLateFee;
    }
    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    //setters
    public void nextDay() {
        currentDay++;
    }
    public void setDay(int day) {
        currentDay = day;
    }
    public  void checkOutBook(String title) {
        Book book = getBook(title);
        if(book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out the book : \"" + title + " " +"\" which contains "
                    + book.pageCount +"pages \n with ISBN number "+ book.getISBN() + ".It is due on day " +
                    (getCurrentDay() + getLengthOfCheckOutPeriod()) + ".");
        }
    }
    public void returnBook(String title) {
        Book book   = getBook(title) ;
        int dayLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckOutPeriod());
        if(dayLate > 0) {
            System.out.println("You owe library Rs." + (getInitialLateFee() + dayLate * getFeePerLateDay())
                + "because your book is " + dayLate + " days Overdue !");
        } else {
            System.out.println("Book returned . Thank you ! ");
        }
        book.setIsCheckedOut(false, -1);
    }
    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry book " + book.getTitle() + "is already checked out ! " +
            "it should be back by " + book.getDayCheckedOut() + getLengthOfCheckOutPeriod());
    }

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many books you want to create :");
        int numberOfBooks = scanner.nextInt();
        for(int i = 1; i <= numberOfBooks; i++) {
            System.out.println("Enter the title of the book You want to add to library : " );
            String bookName = scanner.next() ;
            System.out.println("Enter the number of pages this book has : ");
            int pageCount   = scanner.nextInt();
            System.out.println("Enter the ISBN of the book : ");
            int ISBN        = scanner.nextInt();
            Book book       = new Book(bookName, pageCount, ISBN);
            bookCollection.put(bookName, book);
        }
        System.out.println(bookCollection);

        LibraryCatalogue libraryCatalogue = new LibraryCatalogue(bookCollection);
        System.out.println("Enter the book you want to check out ");
        libraryCatalogue.checkOutBook(scanner.next());
        libraryCatalogue.nextDay();
        libraryCatalogue.nextDay();
        libraryCatalogue.checkOutBook("Antarang");
        System.out.println(bookCollection);
        libraryCatalogue.setDay(17);
        libraryCatalogue.returnBook("Antarang");
        System.out.println(bookCollection);
        libraryCatalogue.checkOutBook("Antarang");
    }
}
