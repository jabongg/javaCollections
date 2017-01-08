package com.hackerrank.java;

/**
 * Created by ejangpa on 12/22/2016.
 */
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    public static  Node insert(Node head,int data) {
        //Complete this method
        Node temp = new Node(data);

        if(head == null) {
            head = temp;
            return head;
        }
        else {
            Node tail = head;
            while( tail.next != null) {
                tail = tail.next;
            }
            tail.next = temp;
            return head;
        }
    }


    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();
int position = 2;
        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        System.out.println();
      //  Delete(head,position);
        reverseList(head);

        //display(head);
        sc.close();
    }

    static  void reverseList(Node head) {
        Node currNode = head;
        Node prevNode = null;
        Node nextNode = null;

        if(head == null) {
            return ;
        }

        else {
            while(currNode != null) {
                nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }
            head = prevNode;
        }
        while (prevNode != null) {
            System.out.print(prevNode.data + " ");
            prevNode = prevNode.next;
        }
    }
// delete node
   static Node Delete(Node head, int position) {
       // Complete this method
       if(head == null ) {
           return head;
       }
       else if(position == 0) {
           return head.next;
       }
       else {
           int i = 0;
           Node current = head;
           //Node followCurrent = head;
           while(current.next != null) {
               if(i == position ) {
                   current.data = current.next.data;
                   current.next = current.next.next;
                   break;
               }
               current = current.next;
               i++;
           }
       }
       return head;
    }
}