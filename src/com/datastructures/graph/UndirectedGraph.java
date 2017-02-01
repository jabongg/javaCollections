package com.datastructures.graph;

/**
 * Created by ejangpa on 12/22/2016.
 */
public class UndirectedGraph {
    boolean adjMatrixUndirected[][] ;
    private  int vertexCount;

    public UndirectedGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrixUndirected = new boolean[vertexCount][vertexCount];
    }

    public  static void main(String args[]) {
        UndirectedGraph undrctd = new UndirectedGraph(4);
        undrctd.addEdge(1,2);
        undrctd.addEdge(1,3);
    }
   void addEdge(int i, int j) {

    }
}
