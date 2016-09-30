package com.eap.hackerrank.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by evgenypavlenko on 9/29/16.
 */
public class Anagrams {
    public static int numberNeeded(String first, String second) {

        boolean found = false;
        //byte[] a = first.getBytes();
        //byte[] b = second.getBytes();
        //char[] a = first.toCharArray();
        //char[] b = second.toCharArray();

        StringBuilder a = new StringBuilder(first);
        StringBuilder b = new StringBuilder(second);

        StringBuilder retaind = new StringBuilder();
        StringBuilder removed = new StringBuilder();
        //Arrays.sort(a);
        //Arrays.sort(b);

        for (int i=0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j) ) {
                    retaind.append(a.charAt(i));
                    found = true;
                }
            }
            if (!found) {
                removed.append(a.charAt(i));
                //b.deleteCharAt(b.charAt(j));
            }
        }

        /*for (int i=0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found++;
                    //break;
                }
            }
        }*/

        return 0;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //String first = in.next();
        //String second = in.next();
        //String first =  "fcrxzwscanmligyxyvym";
        //String second = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        //30
        //String first = "abc";
        //String second = "cde";

        //String first = "bacdc";
        //String second = "dcbad";


        String first = "abccd";
        String second = "abddc";


        System.out.println(numberNeeded(first, second));
    }
}
