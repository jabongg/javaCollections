package com.datastructures.tree;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ejangpa on 2/4/2017.
 */
public class TreeNodeInsert {
    public static void main(String[] args) {
        BSTNode root = null;
        root = insert(root, 28);
        root = insert(root, 45);
        root = insert(root, 20);
        root = insert(root, 25);
        root = insert(root, 30);
        root = insert(root, 13);
        root = insert(root, 93);
        root = insert(root, 50);
        root = insert(root, 27);
        root = insert(root, 13);  // trying for duplicity in the tree
        root = insert(root, 28);

        System.out.println("Inorder Traversal:");
        inorder(root); // prints tree elements

        findMinElement(root);
        findMaxElement(root);

        int treeHeight = findHeight(root);
        System.out.println("tree Height" + treeHeight);

        System.out.println("BFS Traversal:");
        levelOrderTraversal(root);

        System.out.println("\nMirror Tree:");
        mirror(root);
        inorder(root);
    }

    public static void mirror(BSTNode root) {
        if (root == null ) {
            return;
        } else {
            mirror(root.left);
            mirror(root.right);

            //swap the nodes then.
            BSTNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }

    /**
     * prints all nodes at same level then proceeds to next
     * @param root
     */
    public static void levelOrderTraversal(BSTNode root) {
        if (root == null) {
            return;
        }
        Queue<BSTNode> queue = new LinkedList<>();
        queue.offer(root);

            while (!queue.isEmpty()) {
                BSTNode current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
   }

   /**
     * finding height of a binary tree. Height of binary tree is number of edges in longest path from leaf node to root.
     * @param root
     */
    public static int findHeight(BSTNode root) {
        if (root == null) {
            return -1;
        }
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }

    /**
     * finding minimum element in the tree.
     * @param root
     */
    public static void findMaxElement(BSTNode root) {
        BSTNode current = root;
        if (root == null) {
            return;
        }
        //iterative way of find maximum element in the tree.
/*           while (current.right != null) {
                current = current.right;
            }
            System.out.println("Max element" + current.data);*/

        //reucrsive way of finding maximum lement in the tree.
        if (root.right == null) {
            System.out.println("Max element " + root.data);
        }
        findMaxElement(root.right);
    }

    /**
     * finding minimum element in the tree.
     * @param root
     */
        public static void findMinElement(BSTNode root) {
            BSTNode current = root;
            if (root == null) {
                return;
            }
           /* while (current.left != null) {
                current = current.left;
            }
            System.out.println("Min element" + current.data);*/
            if (root.left == null) {
                System.out.println("\nMin element " + root.data);
            }
            findMinElement(root.left);
        }

    /**
     * printing tree nodes using inorder traversal.
     * @param root
     */
    public static void inorder(BSTNode root) {
        if (root == null) {
            return;
        } else {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    /**
     * method to insert a node in the tree.
     * @param root
     * @return
     */
    public static BSTNode insert(BSTNode root, int data) {
        if (root == null) {
           root = new BSTNode(data);
            return root;
        } else {
            if (root.data >= data) {
                root.left = insert(root.left, data);
            }
            if (root.data < data) {
                root.right = insert(root.right, data);
            }
            return root;
        }
    }
}

class BSTNode {
    BSTNode left;
    int data;
    BSTNode right;

    public BSTNode(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
