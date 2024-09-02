package com.search_sorts;

public class quickSort {

    // Partition method to rearrange elements
    public static int partn(int arr[], int low, int high) {
        int pivot = arr[high];  // Choose the last element as the pivot
        int i = low - 1;        // Index of the smaller element

        // Loop to partition the array based on the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;  // Return the pivot index
    }

    // Recursive Quick Sort method
    public static void qs(int arr[], int low, int high) {
        if (low < high) {  // Only proceed if low is less than high
            int pidx = partn(arr, low, high);  // Get the pivot index

            // Recursively sort elements before and after partition
            qs(arr, low, pidx - 1);  // Sort the left side
            qs(arr, pidx + 1, high); // Sort the right side
        }
    }

    public static void main(String[] args) {
        int ar[] = {10, 6, 8, 5, 1, 96, 4};
        qs(ar, 0, ar.length - 1);

        // Print the sorted array
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
