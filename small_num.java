package com.search_sorts;

public class small_num {

 		public static int ls(int []ar,int tar) {
			int start=0,end=ar.length-1;
			int res=-1;
			while(start<=end) {
				int mid=(start+end)/2;
				if(ar[mid]==tar) {
					res=mid;
 				}else if(tar<ar[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			
            System.out.println("number less than "+tar+" is: " +ar[res-1]);
           break;
  		}
			return res;
 			}
			public static void main(String[] args) {

			  int []ar= {10,20,30,40,50,50,60};
              int key=40;
             int res= ls(ar,key);
 	

		}
	

}
