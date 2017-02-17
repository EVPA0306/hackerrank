package com.eap.hackerrank.test.trees;

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
        //int t = sc.nextInt();
        int t = 8;
        TreeNode root = null;
        //int[] arr = {100,50,25,75,150,125,110,75};
        int[] arr = {75,110,125,150,75,25,50,100};

        while(t-- > 0) {
            int data = arr[t];//sc.nextInt();
            root = insert(root,data);
        }
        int height = getHeight(root);
        System.out.println("Tree's height: " + height);
        //System.out.println(find(f,root));
        System.out.print("levelOrder: ");
        levelOrder(root);
        System.out.println(find(25,root));
    }

    static void levelOrder(TreeNode root) {

        java.util.Queue<TreeNode> queue = new java.util.LinkedList();

        if(root != null ) {
            queue.add(root);

            while (!queue.isEmpty()) {

                TreeNode current = queue.poll();
                System.out.print(current.data + " ");
                //System.out.println();
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
