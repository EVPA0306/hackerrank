package com.eap.hackerrank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by evgenypavlenko on 10/26/16.
 */
public class Day28 {

    public static void main(String[] args) {

        List<String> users = new ArrayList<String>();

        Pattern namePattern = Pattern.compile("[a-z]+");
        Pattern emailPattern = Pattern.compile("[a-z]+\\@[gmail]+\\.");

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int a0 = 0; a0 < N; a0++){

            String firstName = in.next();
            String emailID = in.next();

            if (firstName.length() < 20 && emailID.length() < 50) {

                Matcher mName = namePattern.matcher(firstName);
                Matcher mEmail = emailPattern.matcher(emailID);
                if (mName.find() && mEmail.find())
                {
                    users.add(firstName);
                }
            }
        }
        Collections.sort(users);
        for (String name: users) {
            System.out.println(name);
        }
    }
}
