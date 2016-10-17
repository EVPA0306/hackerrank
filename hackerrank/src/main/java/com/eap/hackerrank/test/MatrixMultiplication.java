package com.eap.hackerrank.test;

/**
 * Created by evgenypavlenko on 10/12/16.
 */
public class MatrixMultiplication {

    private static int[][] a = {
            {0,1,1,0}
            ,{0,0,0,1}
            ,{0,1,0,1}
            ,{0,0,0,0}
    };
    private static int[][] b = {
            {0,1,1,0}
            ,{0,0,0,1}
            ,{0,1,0,1}
            ,{0,0,0,0}
    };
    private static int[][] c = new int[4][4];

    public static void main(String...args) {
        for (int i=0; i < a.length; i++) {
                for (int j=0; j < b.length; j++) {
                    int sum = 0;
                    for (int k=0; k < b.length; k++) {
                        sum += (a[i][k] * b[k][j]);
                    }
                    c[i][j] = sum;
                }
        }
        for (int i=0; i < c.length; i++) {
            for (int j=0; j < c.length; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
