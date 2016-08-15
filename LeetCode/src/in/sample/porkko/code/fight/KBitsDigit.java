package in.sample.porkko.code.fight;

import java.util.ArrayList;
import java.util.List;

public class KBitsDigit {

	public static void main(String[] args) {
		
		int v=0;
		Integer n=4;
		int k=1;
		 List t = new ArrayList();
		    for(n = 1 << n; n-- > 0;)
		        if(Long.bitCount(n)==k)
		            t.add(0,n);
		    
		    
	       System.out.println(t);
		
	}
	
}
