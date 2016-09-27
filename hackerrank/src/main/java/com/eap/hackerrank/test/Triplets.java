package com.eap.hackerrank.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Triplets
 *
 */
public class Triplets 
{
    public static void main( String[] args )
    {
    	int arrSize = 3;
    	int[] aliceArray = new int[arrSize];
    	int[] bobArray = new int[arrSize];

    	int aliceRes = 0;
    	int bobRes = 0;

    	Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        aliceArray[0] = a0;
        aliceArray[1] = a1;
        aliceArray[2] = a2;

        bobArray[0] = b0;
        bobArray[1] = b1;
        bobArray[2] = b2;

        for (int i = 0; i < arrSize; i++) {
        	if (aliceArray[i] > bobArray[i]) {
        		aliceRes++;
        	} else if (aliceArray[i] < bobArray[i]) {
        		bobRes++;
        	} else continue;
        }
        System.out.println(aliceRes +" "+ bobRes);
    }
}
