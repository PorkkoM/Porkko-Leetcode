package in.porkko.hankcode.java;

import java.util.Arrays;

public class UnionArray {
	
	public static void main(String[] args) {
		
		int[] a ={7,1,2,3,5,6};
		int[] b={3,8,6,10,7};
		int m = a.length;
		int n = b.length;
		int[] res = new int[m+n]; 
		if(m>n){
			for(int i=0;i<b.length;i++){
				res[i]=b[i];
			}
		}else{
			for(int i=0;i<a.length;i++){
				res[i]=a[i];
			}
		}
		Arrays.sort(res,0,n);
		for(int i=0;i<n;i++){
			if(binarySearch(res, a[i], res[n], 0)==-1){
				System.out.println(res[i]);
			}
		}
		System.out.println(Arrays.toString(res));
	}
	
	static int binarySearch(int[] ar,int k,int r,int l){
		if(r>=l){
			int mid=l+(r-l)/2;
			if(ar[mid]==k)return mid;
			if(ar[mid]>k)return binarySearch(ar, k, l, mid-1);
			return binarySearch(ar, k, r, mid+1);
		}
		return -1;
	}

}
