package com.eap.hackerrank.test;

/**
 * Created by evgenypavlenko on 10/19/16.
 */
public class ArrayGeneric {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.println(i);
        }
    }

    public static void printArray(String[] stringArray) {
        for (String i : stringArray) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) throws Exception{
        int[] intArray = { 1, 2, 3 };
        //int[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray(intArray);
        printArray( stringArray );

        if(ArrayGeneric.class.getDeclaredMethods().length > 2){
            //System.out.println("You should only have 1 method named printArray.");
            throw new Exception("You should only have 1 method named printArray.");
        }
    }
}
