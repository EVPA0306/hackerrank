package com.eap.hackerrank.test;

import java.util.Arrays;

/**
 * Created by evgenypavlenko on 9/30/16.
 */
public class RemoveDups {

    public static void main(String...args) {
        String strWithDups = "aaaaadsdsfkajglkasaksdkkkklkksddddbbbbdddddcccccc";
        char[] arr = strWithDups.toCharArray();
        char[] tempArray = new char[arr.length];
        Arrays.sort(arr);
        int a = 0;
        int k = 0;
        for (int i=1; i < arr.length; i++) {
            if (arr[a] != arr[i]) {
                    tempArray[k] = arr[a];
                    k++;
                    a++;
                } else
                    a++;
        }
        char[] resArray = new char[k];
        System.arraycopy(tempArray,0,resArray,0,k);
        System.out.println(new String(resArray));
    }
}


