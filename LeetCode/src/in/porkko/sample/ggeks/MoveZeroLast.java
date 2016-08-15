package in.porkko.sample.ggeks;

import java.util.Arrays;

public class MoveZeroLast {

	public static void main(String[] args) {
		int arr[] ={2,3,0,4,0,6,0,5,9};
		int l=0,r=arr.length-1;
		while(l<r){
			if(arr[l]==0 && arr[r]!=0){
				int tmp = arr[l];
				arr[l]=arr[r];
				arr[r]=tmp;
				l++;
				r--;
			}
			if((arr[l]!=0 && arr[r]==0)||(arr[l]!=0 && arr[r]!=0)){
				r--;
				l++;
			}
			if(arr[l]==0 && arr[r]==0){
				r++;
				}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
