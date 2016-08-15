package in.sample.porkko.test;

import java.util.ArrayList;
import java.util.List;

public class TestPayPl {
	
	public static void main(String[] args) {
		
		String sent = "This is Porkko and is working is Porkko";
		String[] str = sent.split(" ");
		System.out.println(""+str.length);
		List<String> tstList  = new  ArrayList<String>();
		for(int j=0;j<str.length;j++){
			String test= str[j];
			if(tstList.contains(test)){
				
			}
			for(int k=j+1;k<str.length;k++){
				if(test.equals(str[k])){
					System.out.println(test+"--its duPLCATE");
				}
			}
			
		}
	}
}
