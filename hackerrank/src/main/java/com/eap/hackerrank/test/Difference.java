package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/12/16.
 */
public class Difference {

    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    private void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++)
            if (maximumDifference < Math.abs(elements[i] - elements[j]))
                maximumDifference = Math.abs(elements[i] - elements[j]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}