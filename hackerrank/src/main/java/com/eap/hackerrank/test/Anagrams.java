package com.eap.hackerrank.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by evgenypavlenko on 9/29/16.
 */
public class Anagrams {
    public static int numberNeeded(String first, String second) {

        int found = 0;
        //byte[] a = first.getBytes();
        //byte[] b = second.getBytes();
        char[] a = first.toCharArray();
        char[] b = second.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i=0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found++;
                    //break;
                }
            }
        }

        for (int i=0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found++;
                    //break;
                }
            }
        }

        return a.length + b.length - found;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //String first = in.next();
        //String second = in.next();
        //String first =  "fcrxzwscanmligyxyvym";
        //String second = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        //30
        //String first = "abcqkmyxy";
        //String second = "cdekmqmvm";

        String first = "bacdc";
        String second = "dcbad";


        System.out.println(numberNeeded(first, second));
    }
}
