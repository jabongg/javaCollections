package com.datastructures;

/**
 * Created by ejangpa on 1/24/2017.
 */

/*
*
*
* PSEUDOCODE OF HEAP SORT

MaxHeapify(A, i)
    l = left(i)
    r = right(i)
    if l <= heap-size[A] and A[l] > A[i]
        then largest = l
        else largest = i
    if r <= heap-size[A] and A[r] > A[largest]
        then largest = r
    if largest != i
        then swap A[i] with A[largest]
        MaxHeapify(A, largest)
end func

BuildMaxHeap(A)
    heap-size[A] = length[A]
    for i = |length[A]/2| downto 1
        do MaxHeapify(A, i)
end func

HeapSort(A)
    BuildMaxHeap(A)
    for i = length[A] downto 2
        do swap A[1] with A[i]
            heap-size[A] = heap-size[A] – 1
            MaxHeapify(A, 1)
end func

 */


import java.util.Arrays;

public class HeapSortAlgorithm {
    int A[];

    private void swap(int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // To Max-Heapify a subtree rooted at node i which is
    // an index in A[].  n -> size of heap
    void maxHeapify(int A[],int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && A[l] > A[largest])
            largest = l;

        // If right child is larger than largpest so far
        if (r < n && A[r] > A[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            swap(i,largest);
            // Recursively heapify the affected sub-tree
            maxHeapify(A,n,largest);
        }
    }

    // Build-Max-Heap (rearrange array)
    //Converting array A to Max-Heap
    public void BuildMaxHeap(int A[])
    {
        int n = A.length;
        // one by one checking all root nodes
        //and calling Heapify function
        //if they does not satisfy heap property
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(A,n,i);
    }

    // main function to do Heap Sort
    public void heapSort(int arr[])
    {
        this.A=arr;
        int n = A.length;

        BuildMaxHeap(A);
        // One by one extract an element from heap
        //and get the sorted array
        for (int i=n-1; i>=0; i--)
        {
            // Move top root element to end element
            swap(0,i);
            // call max heapify on the reduced heap
            maxHeapify(arr, i, 0);
        }
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = {6,5,3,1,8,7,2,4};
        //print unsorted array using Arrays.toString()
        System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(arr));

        HeapSortAlgorithm ob = new HeapSortAlgorithm();
        ob.heapSort(arr);

        System.out.print("Sorted array: ");
        //print sorted array
        System.out.println(Arrays.toString(arr));
    }
}