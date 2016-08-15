package in.sample.porkko.code.fight;

import java.util.Set;
import java.util.TreeSet;

public class ExpandAndFInd {
	
	public static void main(String[] args) {
		String str = "a2b3c2a1";
		Set<String> myString  = new TreeSet<String>();
		if(myString instanceof Object){
			System.out.println("true");
		}
		for(int i=1;i<6;i=i+2){
			for(int j=0;j<i;j++){
				myString.add(str.substring(0,i-1));
			}
		}
		System.out.println(""+myString);
 	}
}
