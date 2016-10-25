package com.eap.hackerrank.test;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/25/16.
 */
public class Day26 {

    public static void main(String[] args) throws Exception {
        int fine = 0;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int ddActual = sc.nextInt();
        if (ddActual < 1 || ddActual > 31 )
            throw new Exception("Date is incorrect");
        int mmActual = sc.nextInt();
        if (mmActual < 1 || mmActual > 12 )
            throw new Exception("Month is incorrect");
        int yyActual = sc.nextInt();
        if (yyActual < 1 || yyActual > 3000 )
            throw new Exception("Year is incorrect");

        int ddExpected = sc.nextInt();
        if (ddExpected < 1 || ddExpected > 31 )
            throw new Exception("Date of expected return is incorrect");
        int mmExpected = sc.nextInt();
        if (mmExpected < 1 || mmExpected > 12 )
            throw new Exception("Month of expected return is incorrect");
        int yyExpected = sc.nextInt();
        if (yyExpected < 1 || yyExpected > 3000 )
            throw new Exception("Year of expected return is incorrect");

        Calendar calendarActual = new GregorianCalendar(yyActual,mmActual,ddActual);
        Calendar calendarExpected = new GregorianCalendar(yyExpected, mmExpected, ddExpected);

        //int a = calendarExpected.compareTo(calendarActual);

        if (yyExpected >= yyActual) {
            if (mmExpected >= mmActual || calendarExpected.compareTo(calendarActual) == 1) {
                if (ddActual <= ddExpected || calendarActual.compareTo(calendarExpected) == -1) {
                    fine = 0;
                } else if (ddActual >= ddExpected) {
                    fine = Math.abs(ddActual - ddExpected) * 15;
                }
            } else {
                fine = Math.abs(mmActual - mmExpected) * 500;
            }
        } else {
            fine = 10000;
        }

        System.out.println(fine);
    }

}
