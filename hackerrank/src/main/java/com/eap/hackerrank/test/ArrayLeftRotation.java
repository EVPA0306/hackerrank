package com.eap.hackerrank.test;

/**
 * Created by evgenypavlenko on 9/28/16.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {

        int[] back_copy = new int[n];
        System.arraycopy(a,0,back_copy,0,a.length);
        int[] copy = new int[n];
        for (int i = 0; i < k; i++) {
            System.arraycopy(a,1,copy,0,a.length-1);
            copy[a.length-1] = back_copy[i];
            a = copy;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//array's size
        int k = in.nextInt();//number of rotations

        int a[] = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];

        output = arrayLeftRotation(a, n, k);

        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
