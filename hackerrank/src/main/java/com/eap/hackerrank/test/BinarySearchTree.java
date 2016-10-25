package com.eap.hackerrank.test;

import java.util.Scanner;

import static com.eap.hackerrank.test.TreeNode.insert;

/**
 * Created by evgenypavlenko on 10/20/16.
 */
public class BinarySearchTree {

    public static void main(String...args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        TreeNode root = null;

        while(T-->0) {
            int data = sc.nextInt();
            root = insert(root,data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

    static int getHeight(TreeNode root) {
        int i = 1;

        TreeNode cur = root;

        while (cur.left != null) {
            cur = cur.left;
            i++;
        }

        while (cur.right != null) {
            cur = cur.right;
            i++;
        }

        return i;
    }
}
