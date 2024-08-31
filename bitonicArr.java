package com.search_sorts;

public class bitonicArr {
	
	public static int ba(int[] ar) {
		int start=0;int end=ar.length-1;
		while(start<=end) {
		int mid=start+(end-start)/2;
		if((start==0 || ar[mid]>ar[mid-1])&&(start==ar.length-1 || ar[mid]>ar[mid+1])) {
			return mid;
		}else if(start>0 && ar[mid-1]>ar[mid]) {
			start=mid-1;
		}else {
			end=mid+1;
		}
		}
		return -1;
		
	}

	public static void main(String[] args) {
              int [] arr= {10,20,30,40,35,20,10,2};
              int res=ba(arr);
              System.out.println("peak index: "+res);
              System.out.println("Peak value: "+arr[res]);
	}

}
