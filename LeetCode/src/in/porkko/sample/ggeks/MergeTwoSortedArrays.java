
package in.porkko.sample.ggeks;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	public static void main(String[] args) {
		
		int a[] ={1,5,9,10,15,20};
		int b[]={2,3,8,13};
		domergeSort(a, b);
	}
	static void domergeSort(int a[],int b[]){
		int m = a.length;
		int n=b.length;
		for(int i=n-1;i>=0;i--){
			int j,last = a[m-1];
			for(j=m-1;j>=0 && a[j]>b[i];j--){
				a[j+1]=a[j];
				if(j!=m-1){
					a[j+1]=b[i];
					b[i]=last;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}
}
