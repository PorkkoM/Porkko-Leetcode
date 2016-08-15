package in.porkko.hankcode.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myRegex {
	
	String IPADDRESS_PATTERN = 
			"(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
public String check(String ipString){
	Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
	Matcher matcher = pattern.matcher(ipString);
	        if (matcher.find()) {
	            return "true";
	        }
	        else{
	            return "false";
	        }
}
}
