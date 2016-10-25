package com.eap.hackerrank.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/10/16.
 */
public class BinaryNumbers {

    public static void main(String...agrs) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //System.out.println(Integer.toBinaryString(n));
        System.out.println(convertToBinary(n));

    }

    static public int convertToBinary(int n) {
        int consOnes = 0;
        int temp = 0;
        int i = 8;
        int[] bites = new int[i];
        int remainder;
        while (n > 0) {
            remainder = n % 2;
            bites[i-1] = remainder;
            i--;
            n = n / 2;
        }


        for (int j= 0; j <bites.length; j++) {
            while (j < bites.length && bites[j] == 1) {
                temp++;
                j++;
            }

            if (temp > consOnes)
                consOnes = temp;
            temp = 0;
        }
        return consOnes;
    }
}
