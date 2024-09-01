package com.search_sorts;

import java.util.Arrays;

public class mergeSort {

    // Merge two sorted subarrays into one sorted array
    public static void merge(int ar[], int s, int mid, int l) {
        int merger[] = new int[l - s + 1];
        int id1 = s;      // Start of the first subarray
        int id2 = mid + 1; // Start of the second subarray
        int x = 0;         // Index for the merger array

        // Merge the two subarrays
        while (id1 <= mid && id2 <= l) {
            if (ar[id1] <= ar[id2]) {
                merger[x] = ar[id1];
                id1++;
            } else {
                merger[x] = ar[id2];
                id2++;
            }
            x++;
        }

        // Copy remaining elements from the first subarray, if any
        while (id1 <= mid) {
            merger[x] = ar[id1];
            id1++;
            x++;
        }

        // Copy remaining elements from the second subarray, if any
        while (id2 <= l) {
            merger[x] = ar[id2];
            id2++;
            x++;
        }

        // Copy the merged array back to the original array
        for (int i = 0, j = s; i < merger.length; i++, j++) {
            ar[j] = merger[i];
        }
    }

    // Divide the array into two halves, sort and merge them
    public static void divide(int ar[], int s, int l) {
        // Use if statement to ensure recursion stops
        if (s < l) {
            int mid = s + (l - s) / 2;

            // Recursively divide the first half
            divide(ar, s, mid);

            // Recursively divide the second half
            divide(ar, mid + 1, l);

            // Merge the two halves
            merge(ar, s, mid, l);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 3, 9, 8, 4, 2, 56, 12};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
