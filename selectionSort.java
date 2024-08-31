package com.search_sorts;

import java.util.Arrays;

public class selectionSort {
	public static void ss(int[] arr) {
		int min;
		for(int i=0;i<=arr.length-1;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}int temp;
			temp=arr[min];
			arr[min]=arr[i];
		      arr[i]=temp;
		}System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int []a= {10,4,6,8,12,55,6,0};
		System.out.println("Before sorting: "+Arrays.toString(a));
		System.out.println( "After sorting: " );
		ss(a);

	}

}
