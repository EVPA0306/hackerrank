package com.eap.hackerrank.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/24/16.
 */
public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long startTime = System.currentTimeMillis();

        while(n-- > 0) {
            int k  = sc.nextInt();
            isPrimeBest(k);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms.");
    }

    public static boolean isPrimeBF(int n) {

        if (n == 2) {
            System.out.println("Prime");
            return true;
        }
        if (n == 1 || (n & 1) == 0) {
            System.out.println("Not prime");
            return false;
        }

        int a = 0;
        for (long i = 1; i <= n; i++) {
            if ( n % i == 0)
                a++;
        }
        if (a == 2) {
            System.out.println("Prime");
            return true;
        } else {
            System.out.println("Not prime");
            return false;
        }
    }


    public static boolean isPrimeBest(int n) {

        if (n == 2) {
            System.out.println("Prime");
            return true;
        }
        if (n == 1 || (n & 1) == 0) {
            System.out.println("Not prime");
            return false;
        }

        int a = 0;
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            a++;
            // n is not prime if it is evenly divisible by some 'i' in this range
            if( n % i == 0 ){
                System.out.println("Not prime");
                return false;
            }
        }
        System.out.println("Prime");
        return true;
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            System.out.println("Not prime");
            return false;
        }

        int a = 0;
        for (int i = 1; i <= n; i++) {
            if ( n % i == 0)
                a++;
            if (a > 2) {
                System.out.println("Not prime");
                return false;
            }
        }

        System.out.println("Prime");
        return true;
    }
}
