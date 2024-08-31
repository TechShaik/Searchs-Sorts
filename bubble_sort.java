package com.search_sorts;

 import java.util.*;

public class bubble_sort {
	
	public static void bub(int []arr) {
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					
				}
			}
		}System.out.println(Arrays.toString(arr));
		 
  		
	}

	public static void main(String[] args) {
		int []a= {10,4,6,8,12,55,6,0};
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(a));
		System.out.println("After sorting: ");

		bub(a);
            
	}

}
