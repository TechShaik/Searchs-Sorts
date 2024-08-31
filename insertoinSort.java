package com.search_sorts;

import java.util.Arrays;

public class insertoinSort {
     public static void is(int []arr) {
    	 for(int i=1;i<arr.length;i++) {
    		 int temp=arr[i];
    		int j=i-1;
    		while( j>=0 &&  arr[j]>temp ) {
    			 arr[j+1]=arr[j];
    			j--;
    		} arr[j+1]=temp;
    	
    	 }System.out.println(Arrays.toString(arr));
     }
	public static void main(String[] args) {
         int [] a= {10,2,3,4,65,8,7,96,1};
         System.out.println("Before sorting: "+Arrays.toString(a));
         System.out.println("After sorting: ");
         is(a);
	}

}
