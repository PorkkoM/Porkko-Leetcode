package in.porkko.sample.ggeks;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentDigits {
	
	public static void main(String[] args) {
		
		int[] chk  = new int[10];
		int a = 1223345;
		int a1 = (int)1;
		System.out.println(a1);
		Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		myMap.put(0, 0);
		myMap.put(1, 0);
		myMap.put(2, 0);
		myMap.put(3, 0);
		myMap.put(4, 0);
		myMap.put(5, 0);
		myMap.put(6, 0);
		myMap.put(7, 0);
		myMap.put(8, 0);
		myMap.put(9, 0);
		int len=0;
		while(a>0){
			int ase = a%10;
			myMap.put(ase, myMap.get(ase)+1);
			a=a/10;
		}
		
		System.out.println(myMap);
	}

}
