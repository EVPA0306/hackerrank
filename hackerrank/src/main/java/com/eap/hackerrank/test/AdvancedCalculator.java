package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/17/16.
 */
public class AdvancedCalculator implements AdvancedArithmetic {

    public int divisorSum(int n) {
        int k = 0;
        for (int i=1; i <=n; i++) {
            if (n % i == 0)
                k += i;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new AdvancedCalculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
