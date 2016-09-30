package com.eap.hackerrank.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = mealCost * tipPercent/100;
        double tax = mealCost * taxPercent/100;
        double cost = mealCost + tip + tax;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(cost);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
