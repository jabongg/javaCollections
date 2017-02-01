package com.datastructures.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by ejangpa on 12/21/2016.
 */
public class BFS {
    private int V; // number of vertices

    //Array of list for Adjecency List Representation
    private LinkedList<Integer> adjcencyListArray[];

    //constructor
    BFS(int V) {
        this.V = V;
        adjcencyListArray = new LinkedList[V];
        for(int i = 0; i < V; i++) {
            adjcencyListArray[i] = new LinkedList<Integer>();
        }
    }

    public static void main(String args []) {
       Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i = 0; i < q; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            BFS bfs = new BFS(n);
            for(int j = 0; j < m; j++) {
                int u = scan.nextInt();
                int v = scan.nextInt();
                bfs.addEdge(u,v);
            }
            int s = scan.nextInt();
            bfs.traverseBFS(s,n);

            for(int k = 1; k <= n; k++) {
                bfs.isReachable( s,  k, n);
            }
        }

       /* BFS bfs = new BFS(4);
        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(1,2);
        bfs.addEdge(2,0);
        bfs.addEdge(2,3);
        bfs.addEdge(3,3);
        bfs.traverseBFS(2);*/
/*        if(bfs.isReachable(1,3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if(bfs.isReachable(3,1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }*/
    }

    //prints BFS traversal from a given source s
    void isReachable(int s, int d, int w)
    {
        LinkedList<Integer>temp;

        // Mark all the vertices as not visited(By default set
        // as false)
        boolean visited[] = new boolean[w];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s - 1]=true;
        queue.add(s);
        int flag = 0;
        // 'i' will be used to get all adjacent vertices of a vertex
        Iterator<Integer> i;
        while (queue.size()!=0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();

            int n;
            i = adjcencyListArray[s - 1].listIterator();

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            while (i.hasNext())
            {
                n = i.next();

                // If this adjacent node is the destination node,
                // then return true
                if (n == d) {
                    flag = 1;
                    System.out.print(6 + " ");
                }
                // Else, continue to do BFS
                if (!visited[n - 1])
                {
                    visited[n - 1] = true;
                    queue.add(n);
                }
            }

        }

        // If BFS is complete without visited d
        if(flag == 1)
        System.out.print(-1 + " ");
    }
    // function to add Edge
    void addEdge(int v, int w) {
        adjcencyListArray[v-1].add(w); // Add w to v's list
    }

    void traverseBFS(int v,int n) {
        boolean visited []  = new boolean[n]; // make all the vertices not visited initially
        //calling the recursive helper function to print DFS traversal
        bfsUtil(v,visited);
    }

    void bfsUtil(int v,boolean [] visited) {
        // making queue to store the nodes
        LinkedList<Integer> queue = new LinkedList<Integer>();

        //marking the current root node as visited
        visited[v - 1] = true;
        //enqueue the current root node to queue
        queue.add(v);


        while (queue.size() != 0) {
            // deque the element and print it.
            v = queue.poll();
            //System.out.print(v + " ");
            int d = 0;
            //getting all the adjecent vertices of current dequeued node v and  if and adjecent is not visited then marking it
            // as visited and enqueueing it.
            Iterator<Integer> itr = adjcencyListArray[v-1].listIterator();
            while(itr.hasNext()) {
                int n = itr.next();
                if(!visited[n - 1]) {
                    visited[n - 1] = true;
                    queue.add(n);

                }
            }
        }
    }
}
