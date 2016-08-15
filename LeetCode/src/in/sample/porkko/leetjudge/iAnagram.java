package in.sample.porkko.leetjudge;

import java.util.Arrays;

public class iAnagram {
	public static void main(String[] args) {
		String s="anagram";
		String t="nagaram";
		char[] s1 = s.toCharArray();
		char[] t1= t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		s = String.valueOf(s1);
		t = String.valueOf(t1);
		if(s.equals(t)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
