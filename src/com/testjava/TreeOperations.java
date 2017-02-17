package com.datastructures;

/**
 * Created by ejangpa on 1/20/2017.
 */
public class TreeOperations {
    

    public static void main(String[] args) {
	    insert(13);
        insert(34);
        insert(89);
        insert(37);
        insert(78);
        insert(81);
        insert(16);
        insert(38);
    }
	
	public static void insert(int element) {
		TreeNode current = new TreeNode();
		current.data = element;
		if ( node == null) {			
			return current;
		} else {
			if (node.left)
			
		}
	}
	
}


class TreeNode {
	
	TreeNode left;
    int data;
    TreeNode right;

    public TreeNode(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}



public static TreeNode Insert(TreeNode root, int value) {
      TreeNode i = new TreeNode();
      i.data = value;
      
      if(root == null) {
         root = i;
         return root;
      }
      
      // This executes only when root is not null
      TreeNode parent, current = root;
      
      while(true) {
         parent = current;
         
         if(i.data < parent.data) {
            current = current.left;
            if(current == null) { parent.left = i; return root; }
         } else {
            current = current.right;
            if(current == null) { parent.right = i; return root; }
         }
      }
   }