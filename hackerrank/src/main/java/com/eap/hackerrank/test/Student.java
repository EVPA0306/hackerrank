package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/10/16.
 */
public class Student extends Person{

    private int[] testScores;
    //Constructor
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    protected char calculate(){
        int sum = 0;
        int avg = 0;
        //char ret = 'T';
        for (int i=0; i<testScores.length;i++)
            sum += testScores[i];
        avg = sum / testScores.length;
        if (avg >= 90 && avg <= 100)
            return 'O';
        else if(avg >= 80 && avg < 90)
            return  'E';
        else if (avg >= 70 && avg < 80)
            return 'A';
        else if (avg >= 55 && avg < 70)
            return 'P';
        else if (avg >= 40 && avg < 55)
            return 'D';
        else if (avg < 40)
            return 'T';
        else
            return 'T';
    }

    public static void main(String...args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
