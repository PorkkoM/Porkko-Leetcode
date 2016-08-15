package in.porkko.design.pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicalCheck {
	
	public static void main(String[] args) {
		
		String s="welcometojava";
		int k =3;
		List<String> testList = new ArrayList<String>();
		for(int i=0;i<=s.length()-3;i++){
			//testList.add(java.util.Arrays.toString(s.split("(?<=\\G...)")));
			testList.add(s.substring(i, i+k));
		}
		Collections.sort(testList);
		System.out.println(""+testList.get(0));
		System.out.println(""+testList.get(testList.size()-1));
		
	}

}
