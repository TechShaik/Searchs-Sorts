package com.JavaCodingFromScratch;

public class binarySearch {
	public static void bsearch(int[] arr,int tar) {
		int start=0 , end =arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==tar) {
				System.out.println("Element found at: "+mid);
				return;
			}else if(tar>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		}
	

	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 40;
        bsearch(arr, key);
	}
}
