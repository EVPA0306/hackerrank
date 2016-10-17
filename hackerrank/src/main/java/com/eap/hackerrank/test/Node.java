package com.eap.hackerrank.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by evgenypavlenko on 10/13/16.
 */
public class Node {
    //Properties
    int data;
    Node next;

    //Constructors

    Node(int d) {
        data = d;
        next = null;
    }

    public static  Node insert(Node head, int data) {
        //Complete this method
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {

        //List<Node> linkedList = new LinkedList<Node>();

        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
