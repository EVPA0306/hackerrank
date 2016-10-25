package com.eap.hackerrank.test;

/**
 * Created by evgenypavlenko on 10/20/16.
 */
public class TreeNode {

    TreeNode left;
    TreeNode right;
    int data;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right= null;
    }

    public static TreeNode insert(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode cur;
            if(data <= root.data){
                cur = insert(root.left,data);
                root.left = cur;
            }
            else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
}
