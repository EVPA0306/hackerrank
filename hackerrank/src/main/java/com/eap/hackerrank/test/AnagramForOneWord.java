package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/6/16.
 */
public class AnagramForOneWord {

    private static char[] arr;
    private static int size;
    private static int count = 0;

    public static void doAnagram(int newSize) {
        if (newSize == 1)
            return;
        for (int i=0; i < newSize; i++) {
            doAnagram(newSize - 1);
            if (newSize == 2)
                displayWord();
            rotate(newSize);
        }
    }


    public static void rotate(int newSize) {
        int i;
        int position = size - newSize;
        char temp = arr[position];
        for (i= position+1; i<size; i++)
            arr[i-1] = arr[i];
        arr[i-1] = temp;
    }

    public static void displayWord() {
        if(count < 99)
            System.out.print(" ");
        //if(count < 9)
            //System.out.print(" ");
        System.out.print(++count + " ");
        for (int i=0; i<size; i++)
            System.out.print(arr[i]);
        System.out.println(" ");
        if (count%6 == 0)
            System.out.print(" ");
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
