package com.datastructures;

/**
 * Created by ejangpa on 1/18/2017.
 */
public class HeapPractice {
    private int[] data;
    private int heapSize;

    public HeapPractice(int size) {
        data = new int[size];
        heapSize = 0;
    }

    public int getMinimum() {
        if (isEmpty())
            throw new HeapException("Heap is empty");
        else
            return data[0];
    }

    public boolean isEmpty() {
        return (heapSize == 0);
    }

    private int getLeftChildIndex(int nodeIndex) {
        return 2 * nodeIndex + 1;
    }

    private int getRightChildIndex(int nodeIndex) {
        return 2 * nodeIndex + 2;
    }

    private int getParentIndex(int nodeIndex) {
        return (nodeIndex - 1) / 2;
    }

    public class HeapException extends RuntimeException {
        public HeapException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        int[] heapArray = {40, 38, 39, 36, 33, 18, 12, 8};
    }
}
