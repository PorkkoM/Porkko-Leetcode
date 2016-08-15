package in.porkko.hankcode.java;

import java.util.Arrays;

public class ReOrderrrBasedOnIndex {
	
	public static void main(String[] args) {
		
		int[] a={10,11,12};
		int[] in={1,0,2};
		
		for(int i=0;i<a.length;i++){
			while(in[i]!=i){
				System.out.println("in[i]==="+in[i]);
				
				int oldTarI = in[in[i]];
				int oldTarE = a[in[i]];
				
				System.out.println("oldTarI==="+oldTarI);
				System.out.println("oldTarE==="+oldTarE);
				System.out.println("in[in[i]]==="+in[in[i]]);
				
				a[in[i]]=a[i];
				in[in[i]]=in[i];
				
				in[i]=oldTarI;
				a[i]=oldTarE;
				
			}
		}
		
	System.out.println(Arrays.toString(a));	
	System.out.println(Arrays.toString(in));	
	}

}
