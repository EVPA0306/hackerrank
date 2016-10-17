package com.eap.hackerrank.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by evgenypavlenko on 10/4/16.
 */
public class OddEven {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int nT = in.nextInt();//number of test cases

        for (int i=0; i < nT; i++) {
            String inputStr = in.next();
            char[] fArr = inputStr.toCharArray();
            printArray(fArr);
        }


    }

    private static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i]);
            }
        }
        System.out.print(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}
