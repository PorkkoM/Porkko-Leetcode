package in.sample.porkko.test;

import java.io.IOException;
import java.util.Arrays;

public class AnagramCheck {
	
	public static void main(String[] args) throws IOException {
		
		String an ="god";
		String dg="dog";
		char[] ch1 = an.toLowerCase().toCharArray();
		char[] ch2 = dg.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)){
			System.out.println("Anagram");
		}
		if(Arrays.equals(ch1, ch2)){
			throw new IOException("Not Equal");
		}
		
	}

}
