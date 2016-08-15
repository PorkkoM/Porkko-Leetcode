package in.porkko.hankcode.java;

import java.util.Arrays;

public class LibraryFine {
	
	public static void main(String[] args) {
		
		
		String firstDate= "9 6 2015";
		String seconDate= "9 6 2015";
		
		String[] splitFD = firstDate.split(" ");
		String[] splitSD = seconDate.split(" ");
		
		if(Arrays.equals(splitFD, splitSD)){
			System.out.println("No fine");
		}else{
			if(Integer.parseInt(splitSD[0])>Integer.parseInt(splitFD[0])){
				System.out.println("10 % Fine");
			}else if(Integer.parseInt(splitSD[1])>Integer.parseInt(splitFD[1])){
				System.out.println("50% Fine");
			}
			
		}
		
		
		
	}

}
