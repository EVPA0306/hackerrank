package com.eap.hackerrank.test;

import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/3/16.
 */
public class Person {

    private int age;
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    public Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge <= 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else
            this.age = initialAge;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:

        String answer = "You are old";

        if (age < 13) {
            answer = "You are young.";
        }
        if(age >= 13 && age < 18) {
            answer = "You are a teenager.";
        }
        System.out.println(answer);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

}