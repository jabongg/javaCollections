package com.hackerrank.java;

/**
 * Created by ejangpa on 1/3/2017.
 */


import java.util.*;
        import java.io.*;
class TreeNode {
    TreeNode left;
    TreeNode right;
    int data;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TreeHeight {
    /*
        class Node
            int data;
            Node left;
            Node right;
        */
    static int height(TreeNode root) {
        if (root == null)
            return -1;

        int nLeft = height(root.left);
        int nRight = height(root.right);

        return(Math.max(nLeft, nRight)+1);
    }

    public static TreeNode insert(TreeNode root, int data) {
        if(root == null){
            return new TreeNode(data);
        }
        else {
            TreeNode cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        TreeNode root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
}