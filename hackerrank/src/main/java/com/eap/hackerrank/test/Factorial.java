package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/7/16.
 */
public class Factorial {

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n+"!= " +factorial(n));
    }
}
