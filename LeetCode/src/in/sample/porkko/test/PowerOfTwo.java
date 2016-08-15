package in.sample.porkko.test;

import java.util.Arrays;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		int x =8;
		System.out.println((x & (x-1))==0);
		System.out.println((x & -x) == x);
		int[] test = {1,2,3,4,5,6,7,8,10,9};
		test = Arrays.copyOf(test,3);
		for(int d:test){
			System.out.print(d);
			System.out.print(",");
		}
	}
	
}
