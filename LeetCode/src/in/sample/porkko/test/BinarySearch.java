package in.sample.porkko.test;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a={2,4,5,68,3,8,9};
		Arrays.sort(a);
		int k = 3;
		System.out.println(Arrays.toString(a));
		System.out.println(binarySearch(a, k));
	}
	static int binarySearch(int[] a,int k){
		int l=0,r=a.length-1;
		while(l<=r){
			int mid = (l+r)/2;
			if(a[mid]==k){
				return mid;
			}
			if(a[mid]>k){
				 r=mid-1;
			}else {
				 l=mid+1;
			}
		}
		return -1;
	}
}
