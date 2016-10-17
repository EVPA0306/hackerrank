package com.eap.hackerrank.test;
import java.util.*;

/**
 * Created by evgenypavlenko on 10/14/16.
 */
public class Except {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            Integer cnt = Integer.parseInt(S);
            System.out.println(cnt);
        } catch (NumberFormatException nfe) {
            System.out.println("Bad String");
        }
    }
}
