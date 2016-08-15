package in.sample.porkko.leetjudge;

import java.util.ArrayList;
import java.util.List;

public class ReverseOnlyVowels {
	public static void main(String[] args) {
		String s="leetcode";
		List<String> sv = new ArrayList<String>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				sv.add(String.valueOf(c));
			}
		}
		StringBuilder sbd = new StringBuilder(s);
		int k=0;
		for(int j=s.length()-1;j>=0;j--){
			char c = s.charAt(j);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				String cf =sv.get(k);
				char cfg=cf.charAt(0);
				sbd.setCharAt(j, cfg);
				k++;
			}
		}	
		System.out.println(sbd.toString());
	}
}
