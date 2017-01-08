package com.algorithms;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by ejangpa on 12/21/2016.
 */
public class DFS {
    private int V; // number of vertices

    //Array of list for Adjecency List Representation
    private LinkedList<Integer> adjcencyListArray[];

    //constructor
    DFS(int V) {
        this.V = V;
        adjcencyListArray = new LinkedList[V];
        for(int i = 0; i < V; i++) {
            adjcencyListArray[i] = new LinkedList<Integer>();
        }
    }


    public static void main(String args []) {
        DFS dfs = new DFS(4);
        dfs.addEdge(0,1);
        dfs.addEdge(0,2);
        dfs.addEdge(1,2);
        dfs.addEdge(2,0);
        dfs.addEdge(2,3);
        dfs.addEdge(3,3);
        dfs.traverseDFS(2);
    }

// function to add Edge
    void addEdge(int v, int w) {
        adjcencyListArray[v].add(w); // Add w to v's list
    }

    void traverseDFS(int v) {
        boolean visited []  = new boolean[V]; // make all the vertices not visited initially
        //calling the recursive helper function to print DFS traversal
        dfsUtil(v,visited);
    }

    void dfsUtil(int v,boolean [] visited) {
        //marking the current root node as visited
        visited[v] = true;
        System.out.print(v+" ");
        //iterating to all the vertices adjecent to it.
        Iterator<Integer> itr = adjcencyListArray[v].listIterator();
        while(itr.hasNext()) {
            int n = itr.next();
            if (!visited[n])
                dfsUtil(n, visited);
        }
    }
}
