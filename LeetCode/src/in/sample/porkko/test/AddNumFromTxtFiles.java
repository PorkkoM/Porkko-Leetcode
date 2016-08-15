package in.sample.porkko.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddNumFromTxtFiles {

	public static void main(String[] args) throws IOException {
		int tot=0;
		BufferedReader bfr = new BufferedReader( new FileReader("C:\\JavaInputFolder\\inputfile.txt"));
		for(String s = bfr.readLine();s!=null;s=bfr.readLine()){
			tot += Integer.valueOf(s);  
		}
		System.out.println(""+tot);
		bfr.close();
	}
	
}
