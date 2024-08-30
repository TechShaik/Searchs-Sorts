package com.JavaCodingFromScratch;

import java.util.Arrays;

public class bs_recurss {
	public static int bs(int []arr,int fs,int ls,int k) {
		while(fs<=ls) {
			int m=(fs+ls)/2;
			if(arr[m]==k) {
				System.out.println("Element found at : "+m);
				break;
			}
				 
				else if(k<arr[m]) {
					return bs(arr,fs,m-1,k);
 			}else {
				return bs(arr,m+1,ls,k);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[]a= { 10,11,21,23};
		int key=21;
               bs(a,0,a.length-1,key);
               System.out.println("Element at :"+Arrays.binarySearch(a, key));
	}

}
