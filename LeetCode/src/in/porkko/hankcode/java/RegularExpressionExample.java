package in.porkko.hankcode.java;

import java.util.regex.Pattern;

public class RegularExpressionExample {
	
	public static void main(String[] args) {
		
		String str = "";
		//String pat="^[a-zA-Z0-9_]*$";
		String pat="batcatpat(nat";
		TestGenerics myPrinter =new TestGenerics();
		Integer[] intArray = { 1, 2, 3 };
       // String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
	    
	    try{
	    	Pattern r = Pattern.compile(pat);

	    }catch(Exception e){
	    	try {
				throw new Exception("Invalid");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	  		
	}

}
