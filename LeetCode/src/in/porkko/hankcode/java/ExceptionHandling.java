package in.porkko.hankcode.java;

import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) throws IOException {
		
		ExceptionHandling ex = new ExceptionHandling();
		System.out.println(ex.generatePower(3, 5));
		System.out.println(ex.generatePower(2, 4));
		System.out.println(ex.generatePower(-1, -2));
		
	}
	
	public int generatePower(int n,int p) throws IOException{
		
		int result =1;
		if(n<0||p<0){
			throw new IOException("n and p should be non-negative");
		}else{
			
			for(int i=1;i<=p;i++){
				result *= n;
			}
		}
		
		return result;
	}
	
}
