package in.porkko.hankcode.java;

public class IfElseCheck {

	public static void main(String[] args) {
		
		
		int N=9;
		String ans="";
		if(N%2==1){
			ans="Wierd";
		}else if(N>=2 && N<=5 && N%2==0){
			ans="Not Wierd";
		}else if(N>=6 && N<=20 && N%2==0){
			ans="Wierd";
		}else if(N>20 && N%2==0){
			ans="Not Wierd";
		}
		
		
		
	}
	
}
