package in.porkko.design.pattern;

import java.util.Arrays;

public class isAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A="anagram";
		String B="margana";
		int ah =A.hashCode();
		int bh= B.hashCode();
		System.out.println(""+ah+"----"+bh);
		char[] a =A.toLowerCase().toCharArray();
		char[] b = B.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)){
			System.out.println("Anagram");
		}else{
			System.out.println("Not Anagrams");
		}

	}

}
