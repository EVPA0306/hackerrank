package com.eap.hackerrank.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class HourGlasses {

	/*static int arr[][] = {
			 {1,1,1, 0,0,0}
			,{0,1,0, 0,0,0}
			,{1,1,1, 0,0,0}
			,{0,0,2, 4,4,0}
			,{0,0,0, 2,0,0}
			,{0,0,1, 2,4,0}
	};*/

	static int arr[][] = {
			 {1, 1,  1,  0,  0, 0}
			,{0, 1,  0,  0,  0, 0}
			,{1, 1,  1,  0,  0, 0}
			,{0, 9,  2, -4, -4, 0}
			,{0, 0,  0, -2,  0, 0}
			,{0, 0, -1, -2, -4, 0}
		};

    public static void main(String[] args) {

		int MAX_VALUE = 0;
		int tmp;
        //Scanner in = new Scanner(System.in);
        
        //int arr[][] = new int[6][6];

        //for (int c = 0; c < 3; c++) {
	        
	     for (int a = 0; a < 4; a++) {
			 for (int b = 0; b < 4; b++) {
				 tmp = printHourGlass(a, b);
				 if (tmp > MAX_VALUE)
					 MAX_VALUE = tmp;
			 }
		 }
		System.out.println(MAX_VALUE);
    }

	private static int printHourGlass(int a, int b) {
		int hourGlassSum = 0;
		int cnt = 0;

		for (int i = a; i < (3 + a); i++){
			for (int j = b; j < (3 + b); j++) {
				cnt++;
				if ( cnt == 4 || cnt == 6 )
					continue;
				else {
					hourGlassSum = hourGlassSum + arr[i][j];
					//System.out.print(arr[i][j]);
				}
			}
			//System.out.println();
		}
		//System.out.println("hourGlassSum: " + hourGlassSum);
		return Math.abs(hourGlassSum);
	}
}
