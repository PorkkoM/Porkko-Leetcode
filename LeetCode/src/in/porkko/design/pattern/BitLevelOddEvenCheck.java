package in.porkko.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class BitLevelOddEvenCheck {
	
	public static void main(String[] args) {
		
		int[] ar = {1,2,3,4,5,7,8,9};
		List li = new ArrayList();
		for(int d:ar){
			if((d & 1)==1){
				li.add(d);
			}
		}
		for(Object s:li){
			System.out.println(s);
		}
	
	}

}
