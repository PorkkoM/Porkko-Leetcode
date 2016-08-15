package in.porkko.sample.ggeks;

import java.util.Arrays;

public class OddEvenSeggregation {
	
	public static void main(String[] args) {
		
		int arr[]={12,34,45,9,8,90,3};
		int l=0,r=arr.length-1;
		while(l<r){
			while(arr[l]%2==0 && l<r){
				l++;
			}
			while(arr[r]%2!=0 && l<r){
				r--;
			}
			while(l<r){
				int tmp =arr[l];
				arr[l]=arr[r];
				arr[r]=tmp;
				l++;
				r--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
