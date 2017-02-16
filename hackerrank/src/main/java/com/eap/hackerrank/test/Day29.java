package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/27/16.
 */
public class Day29 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){

            int n = in.nextInt();
            int k = in.nextInt();
            int a = 0;
            for (int i=1; i <= n; i++) {
                for (int j=i+1; j <= n; j++) {
                    int r = (i & j);
                    if ( r > a && r < k ) {
                        a = r;
                }
            }
        }
        System.out.println(a);
    }
    }
}
