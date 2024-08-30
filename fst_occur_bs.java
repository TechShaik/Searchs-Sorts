package com.JavaCodingFromScratch;

public class fst_occur_bs {
	static int res=-1;

	public  static int fbs(int []arr,int tar) {
		int start=0,end=arr.length-1;
		 while (start <= end) {
	            int mid = (start + end) / 2;
	            if (arr[mid] == tar) {
	                res = mid;
	                end = mid - 1;  // Move to the left half to find the first occurrence
	            } else if (arr[mid] < tar) {
	                start = mid + 1;  // Corrected: Move to the right half
	            } else {
	                end = mid - 1;    // Move to the left half
	            }
	        }
		return res;
	}

	public static void main(String[] args) {
              int[]ar= {10,20,20,30,40,40,50};
             int key=40;
             fbs(ar,key);
             if(res!=-1) {
            	System.out.println("Element found at "+res);
            	 
             }else {
            	 System.out.println("Element not found");
            	 
             }
            		
	}

}
