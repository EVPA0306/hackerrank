package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/6/16.
 */
public class AnagramForOneWord {

    private static char[] arr;
    private static int size;

    public static void doAnagram(int newSize) {
        if (newSize == 1)
            return;
        for (int i=0; i < newSize; i++) {
            doAnagram(newSize - 1);
            if (newSize == 2)
                //displayWord();
            rotate(newSize);
        }
    }


    public static void rotate(int newSize) {
        int i;
        int position = size - newSize;
        char temp = arr[0];
        for (i=1; i<size; i++)
            arr[i-1] = arr[i];
        arr[i-1] = temp;
    }

    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        size = word.length();
        arr = new char[size];
        arr = word.toCharArray();
        doAnagram(size);
    }

}
