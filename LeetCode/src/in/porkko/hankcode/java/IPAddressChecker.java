package in.porkko.hankcode.java;

import java.util.Scanner;

public class IPAddressChecker {
	
	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//        while(in.hasNext())
//        {
            String IP = "10.2.255.255";
            System.out.println((new myRegex().check(IP)));
        //}		
	}

}
