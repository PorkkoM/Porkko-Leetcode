package in.porkko.project.euler;

import java.math.BigInteger;

public class SelfPowers {
	
	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		BigInteger one = new BigInteger("1");
		BigInteger count = new BigInteger("1");
		for(int i=1; i<=1000; i++){
		    BigInteger pow = count.pow(i);
		    sum = sum.add(pow);
		  //  System.out.println(sum);
		    count = count.add(one);
		}
		System.out.println(sum);
	}

}
