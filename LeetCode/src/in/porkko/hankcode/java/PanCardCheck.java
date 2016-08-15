package in.porkko.hankcode.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCardCheck {

	public static void main(String[] args) {
		
		String s = "ABCDE1234F"; // get your edittext value here
		Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");

		Matcher matcher = pattern.matcher(s);
		// Check if pattern matches 
		if (matcher.matches()) {
		System.out.println("true");
		}else{
 System.out.println("false");
		}
		
	}
	
}
