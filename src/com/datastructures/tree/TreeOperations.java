package com.datastructures.tree;

/**
 * Created by ejangpa on 1/20/2017.
 */
public class TreeOperations {
    TreeNode root;

    public static void main(String[] args) {
        TreeOperations treeOperations = new TreeOperations();
        // creating a binary tree and inserting nodes
        treeOperations.root                  = new TreeNode(1);
        treeOperations.root.left             = new TreeNode(2);
        treeOperations.root.right            = new TreeNode(3);
        treeOperations.root.left.left        = new TreeNode(4);
        treeOperations.root.right.right      = new TreeNode(5);
        System.out.println("The diameter of the tree is: " + treeOperations.diameter());
    }

    // a wrapper over diameter root.
    int diameter() {
        return diameter(root);
    }
    int diameter(TreeNode root) {
        /* base case if tree node is empty */
        if (root == null) {
            return 0;
        }
        /* get height of the left and right subtrees */
        int lHeight = height(root.left);
        int rHeight = height(root.right) ;

        /* get diameter of the left and right subtrees */
        int lDiameter = diameter(root.left) ;
        int rDiameter = diameter(root.right);

        /* Return max of following three
          1) Diameter of left subtree
          2) Diameter of right subtree
          3) Height of left subtree + height of right subtree + 1
         */
        return Math.max(lHeight + rHeight + 1, Math.max(lDiameter,rDiameter));
    }

    static int height(TreeNode node ) {
        if (node == null) {
            return 0;
        }
        /* if tree is not empty  return height of leftsubtree and right subtree + 1*/
        return (1 + Math.max(height(node.left),height(node.right)));
    }
}

class TreeNode {
    TreeNode left;
    int data;
    TreeNode right;

    public TreeNode(int data) {
        this.left = left;
        this.data = data;
        this.right = right;
    }
}
