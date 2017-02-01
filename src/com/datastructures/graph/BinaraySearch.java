package com.datastructures.graph;

// Java implementation of recursive Binary Search
class BinaraySearch
{
    // Returns index of x if it is present in arr[l..r], else
    // return -1
    int binarySearchRecursive(int arr[], int l, int r, int x)
    {
        if (r >= l)
        {
            int mid = l + (r - l)/2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
                return binarySearchRecursive(arr, l, mid-1, x);

            // Else the element can only be present in right
            // subarray
            return binarySearchRecursive(arr, mid+1, r, x);
        }

        // We reach here when element is not present in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinaraySearch ob = new BinaraySearch();
        int arr[] = {2,3,4,10,40,51,62,73,87,93};
        int n = arr.length;
        int x = 87;
        //int result = ob.binarySearchRecursive(arr,0,n-1,x);
        int result = ob.binarySearchIterative(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }

    //iteratvie binary search
    int binarySearchIterative(int[] arr, int l, int r, int x) {
        int mid = 0;

        for(int i = l; i < r; i++) {
            mid = l + (r - l)/2;
            if(arr[mid]  == x) {
                return mid;
            }
            if(x > arr[mid]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return mid;
    }
}
/* This code is contributed by Rajat Mishra */
