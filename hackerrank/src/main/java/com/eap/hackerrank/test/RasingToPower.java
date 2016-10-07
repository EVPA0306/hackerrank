package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/7/16.
 */
public class RasingToPower {

    public static int power(int i, int power) {

        System.out.println("j: " + power);
        if (i > 0 && power > 0) {
            return i * power(i,power-1);
        } else {
            return 1;
        }
    }

    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Power = " + power(a,b) );
    }

}
