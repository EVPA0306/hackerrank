package com.eap.hackerrank.test;

import java.util.*;
import java.io.*;

/**
 * Created by evgenypavlenko on 10/6/16.
 */
public class PhoneBook {

    public static void main(String []arg){

        Map<String,Integer> phoneMap = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                phoneMap.put(name,phone);
            }
            while(in.hasNext()){
                String s = in.next();
                // Write code here
                if(phoneMap.containsKey(s)) {
                    System.out.println(s+"="+phoneMap.get(s));
                } else
                    System.out.println("Not found");
            }
            in.close();
        }
}

