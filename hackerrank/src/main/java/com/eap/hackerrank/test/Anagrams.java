package com.eap.hackerrank.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by evgenypavlenko on 9/29/16.
 */
public class Anagrams {

    public static int deleted;

    public static int numberNeeded(String first, String second) {

        int found = 0;

        char[] a = first.toCharArray();
        found = removeDups(a);
        char[] b = second.toCharArray();
        found = found + removeDups(b);

        for (int i=0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found++;
                }
            }
        }

        for (int i=0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found++;
                }
            }
        }

        return a.length + b.length - found;
    }

    public static int removeDups(char[] arrWithDups) {
        int res = 0;
        //char[] arr = strWithDups.toCharArray();
        char[] tempArray = new char[arrWithDups.length];
        Arrays.sort(arrWithDups);
        int a = 0;
        int k = 0;
        for (int i=1; i < arrWithDups.length; i++) {
            if (arrWithDups[a] != arrWithDups[i]) {
                tempArray[k] = arrWithDups[a];
                k++;
                a++;
            } else
                a++;
        }
        tempArray[k] = arrWithDups[a];
        char[] resArray = new char[k+1];
        System.arraycopy(tempArray,0,resArray,0,k+1);
        //System.out.println(new String(resArray) + " = " + (arr.length - resArray.length));
        res = arrWithDups.length - resArray.length;
        arrWithDups = resArray;
        return res;
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

        String first = "bacdc";
        String second = "dcbad";


        //String first = "abccd";
        //String second = "abddc";

        System.out.println(numberNeeded(first, second));
    }
}
