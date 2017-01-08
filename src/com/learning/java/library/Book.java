package com.learning.java.library;

/**
 * Created by ejangpa on 1/8/2017.
 */
public class Book {
    //properties , fields , global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;//whether the book is checked out ??
    int dayCheckedOut = -1;

    //Constructor
    public Book(String title, int pageCount, int ISBN) {
        this.title          = title;
        this.pageCount      = pageCount;
        this.ISBN           = ISBN;
        isCheckedOut        = false;
    }

    //getters --> INSTANCE METHODS
    public String getTitle() {
        return this.title;
    }
    public int getPageCount() {
        return this.pageCount;
    }
    public int getISBN() {
        return this.ISBN;
    }
    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }
    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    //setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }

}

