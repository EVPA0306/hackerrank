package com.eap.hackerrank.test;

/**
 * Created by evgenypavlenko on 10/11/16.
 */
public class MyBook extends Book {

    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}
