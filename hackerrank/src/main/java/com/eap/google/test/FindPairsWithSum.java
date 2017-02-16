package com.eap.google.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by evgenypavlenko on 2/8/17.
 */
public class FindPairsWithSum {

    public static void main(String[] args) {

        //int[] data = new int[]{1,2,3,6,9};
        //int[] data = new int[]{1,2,3,4,10};
        int[] data = new int[]{1,2,3,4,4,9};
        //int[] data = new int[]{};
        //Scanner scanner = new Scanner(System.in);
        //int sz = scanner.nextInt();
        //data = new int[sz];
        //for (int i=0; i<sz; i++) {
        //    data[i] = scanner.nextInt();
        //}
        //int sum = scanner.nextInt();
        int sum = 8;
        System.out.println(findPairsWithSum(data,sum));
    }

    private static boolean findPairsWithSum(int[] inData, int inSum) {
        Set comp = new HashSet();
        for (int i=0; i<inData.length;i++) {
            if( comp.contains(inSum-inData[i]) )
                return true;
            comp.add(inData[i]);
        }
        return false;
    }
}
