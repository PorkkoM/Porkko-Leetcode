package in.sample.porkko.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Phaser;

public class StringCombination {
	
	public static void main(String[] args) {
		printCombination("23");
		
	}

	static void printCombination(String s){
		
		Map<Character,String> hm= new HashMap<Character,String>();
		hm.put('0', "0");
		hm.put('1', "1");
		hm.put('2', "ABC");
		hm.put('3', "DEF");
		hm.put('4', "GHI");
		hm.put('5', "JKL");
		hm.put('6', "MNO");
		hm.put('7', "PQR");
		hm.put('8', "TUV");
		hm.put('9', "WXYZ");
		StringBuilder strb = new StringBuilder();
		printStrings(s,0,hm,strb);
	}
	static void printStrings(String phNo,int i,Map<Character,String> hm,StringBuilder st){
		if(i==phNo.length()){
			System.out.print(""+st+" ");
			return;
		}
		String s= hm.get(phNo.charAt(i));
		for(int j=0;j<s.length();j++){
			st.append(s.charAt(j));
			printStrings(phNo, i+1, hm, st);
			st.deleteCharAt(st.length()-1);
		}
	}
}
