package com.eap.hackerrank.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayReversOrder {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int arr[] = new int[n];

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            //System.out.print(arr[arr_i] + " ");
        }

        for (int i= 0; i < arr.length; i++) {
            System.out.print(arr[(n-1)-i] + " ");
        }
        System.out.println();
    }
}
