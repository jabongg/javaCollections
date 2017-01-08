package com.hackerrank.java;

import java.util.Scanner;

/**
 * Created by ejangpa on 12/12/2016.
 */
public class InsertANodeAtASpecificPositionInALinkedList {


/*  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as */
  class Node {
     int data;
     Node next;
  }

    Node head;

    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        Node tmp = new Node();
        tmp.data = data;
//        tmp.next = null;

        int count = 0;
        if(head == null) {
            tmp.next = null;
            head = tmp;
            count = 0;
            return head;
        }
        if (position == 0) {
            tmp.next = head;
            return tmp;
        }
        else {
            //newNode.next = null;
            Node start = head;
            // Node tmp = head;
            while(count < position-1 && start.next != null) {
                start = start.next;
                count++;
            }
            Node temp2 = start.next ;

            //tmp.next = start.next;
            start.next = tmp;
            tmp.next = temp2;
            return head;
        }
    }

    void Print(Node head) {
        while(head != null) {
            System.out.print(head.data);
            head = head.next;
        }
    }


    public static void main( String args []) {
        Scanner scanner = new Scanner(System.in);
        InsertANodeAtASpecificPositionInALinkedList nodeObj = new InsertANodeAtASpecificPositionInALinkedList();
        int nodeNumber = scanner.nextInt();

        for(int i = 0; i < nodeNumber; i++) {
            int dataLinkedList =  scanner.nextInt();
            int postion = scanner.nextInt();
            nodeObj.head = nodeObj.InsertNth(nodeObj.head,dataLinkedList,postion);
        }
        nodeObj.Print(nodeObj.head);
    }

}
