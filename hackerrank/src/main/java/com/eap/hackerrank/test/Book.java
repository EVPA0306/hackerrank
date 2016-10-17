package com.eap.hackerrank.test;

import java.util.*;

/**
 * Created by evgenypavlenko on 10/11/16.
 */
public abstract class Book {

    String title;
    String author;

    Book(String t, String a){
        title = t;
        author= a;
    }
    abstract void display();

}
