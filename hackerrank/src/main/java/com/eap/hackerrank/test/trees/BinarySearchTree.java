package com.eap.hackerrank.test.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static com.eap.hackerrank.test.trees.TreeNode.insert;

/**
 * Created by evgenypavlenko on 10/20/16.
 */
public class BinarySearchTree {

    //static int t;

    public static void main(String...args) {

        Scanner sc = new Scanner(System.in);
        //int f = sc.nextInt();
        int t = sc.nextInt();
        TreeNode root = null;

        while(t-- > 0) {
            int data = sc.nextInt();
            root = insert(root,data);
        }
        int height = getHeight(root);
        System.out.println(height);
        //System.out.println(find(f,root));
        //levelOrder(root);
        System.out.println(find(5,root));
    }

    static void levelOrder(TreeNode root) {

        java.util.Queue<TreeNode> queue = new java.util.LinkedList();

        if(root != null ) {
            queue.add(root);

            while (!queue.isEmpty()) {

                TreeNode current = queue.poll();
                System.out.print(current.data + " ");
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    }


    static TreeNode find(int key, TreeNode root) {
        TreeNode current = root;

        while (current.data != key) {
            if (current.data > key) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null)
                return null;
        }
        return current;
    }

    static int getHeight(TreeNode root) {
        if (root == null){
            return -1;
        }
        else{
            return 1 + Math.max( getHeight(root.left), getHeight(root.right) );
        }
    }
}
