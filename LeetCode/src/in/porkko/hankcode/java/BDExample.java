package in.porkko.hankcode.java;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BDExample {
	
	public static void main(String[] args) {
		
		String[] a={"-100","50","0","56.6","90","0.12",".12","02.34","000.000","0","0"};
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1;j++){
				BigDecimal bd1= new BigDecimal(a[j]);
				BigDecimal bd2= new BigDecimal(a[j+1]);
				BigInteger bi = new BigInteger(a[j]);
				if(bd2.compareTo(bd1)>0){
					String tmp = a[j];
					a[j] = a[j+1];
					a[j+1]=tmp;
				}
			}
			
		}
		

		for(String d:a){
			System.out.println(d);
		}
	}

}
