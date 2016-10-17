package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/17/16.
 */
public class Calculator {

    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        if (p == 0)
            return 1;
        int k = n;
        for (int i=p-1; i>0; i--) {
                k *= n;
        }
        return k;
    }

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();

        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
