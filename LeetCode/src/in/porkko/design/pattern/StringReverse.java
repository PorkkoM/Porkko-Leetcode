package in.porkko.design.pattern;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
		
		StringBuffer stringBuffer = new StringBuffer(A).reverse();
		String B = stringBuffer.toString();
		String c = new StringBuffer(A).reverse().toString();
		if(A.equals(new StringBuffer(A).reverse().toString())){
			
		}
		if(A.equals(B)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
