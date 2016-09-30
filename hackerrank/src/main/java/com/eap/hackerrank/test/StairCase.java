package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 9/30/16.
 */
public class StairCase {

    static void StairCase(int n) {
        int i = 0;
        while (i < n) {
            int k = 0;
            while ((n-i)-1 > k ) {
                System.out.print(" ");
                k++;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            i++;
            System.out.println();
        }
    }


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        StairCase(_n);

        //Sergey's version
        for (int i = 1; i<=_n; i++) {

            for (int j = 1; j <= _n - i; j++) {
                System.out.print(" ");
            }
            for (int j = _n - i; j < _n; j++) {
                System.out.print("#");
            }
            if (i < _n)
                System.out.println();
        }

    }
}
