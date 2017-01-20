package com.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ejangpa on 1/18/2017.
 */


// Min-Heap formation

        import java.util.*;

public class JesseAndCookies {

    private int capacity = 10;
    private int size = 0;

    int[] items = new int[capacity];

    private int getLeftChildIndex(int parentIndex) { return 2 * parentIndex + 1; }
    private int getRightChildIndex(int parentIndex) { return  2 * parentIndex + 2; }
    private int getParentIndex(int childIndex) { return (childIndex - 1 ) / 2; }

    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }
    private boolean hasParent(int index) { return getParentIndex(index) >= size; }

    private int leftChild(int index) { return items[getLeftChildIndex(index)]; }
    private int rightChild(int index) { return items[getRightChildIndex(index)]; }
    private int parent(int index) { return items[getParentIndex(index)]; }

    /**
     * swaps the values at indexOne with indexTwo
     * @param indexOne
     * @param indexTwo
     */
    private void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    /**
     * Ensures if array is filled completely .
     */
    private void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, 2 * capacity);
            capacity = capacity * 2;
        }
    }

    /**
     * gets the root element of the heap. Here Minimum element.
     * @return
     */
    public int peek() {
        if (size == 0) {
            throw new IllegalStateException();
        } else {
            return items[0];
        }
    }

    /**
     * It deletes the root element of the Heap and rebuilds it.
     * @return
     */
    public int poll() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    /**
     * add the element in the heap
     */
    public void add(int item) {
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    /**
     *  heapifyDown() method will maintain the Max-Heap
     */
    public void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (items[index] < items[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }

    }

    /**
     * heapifyUp() method will maitain the Min-Heap
     */
    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    /**
     * printing Heap elements
     * @param
     */
    public void printHeap(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        JesseAndCookies buildHeap = new JesseAndCookies();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // number of cookies
        int K = scanner.nextInt(); // minimum sweetness of cookies
        for (int i = 0; i < N; i++) {
            buildHeap.add(i);
        }
    }
}