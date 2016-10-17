package com.eap.hackerrank.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by evgenypavlenko on 10/17/16.
 */
public class Palindrome {

    Stack<Character> charStack;
    Queue<Character> charQueue;

    Palindrome() {
        charStack = new Stack<Character>();
        charQueue = new LinkedList<Character>();
    }
    //Stack
    public void pushCharacter(char c) {
        charStack.push(c);
    }


    public char popCharacter() {
        return charStack.pop();
    }

    //Queue
    public void enqueueCharacter(char c) {
        charQueue.add(c);
    }

    public char dequeueCharacter() {
        return charQueue.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Palindrome p = new Palindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
