package in.porkko.hankcode.java;

import java.util.HashSet;
import java.util.LinkedList;

public class StringSplit {
	
	public static void main(String[] args) {
		
		String temp = "  sf?";
		String[] terms = temp.split("[\\s@&.?*^%#!?:,$+'-]+");
		
		System.out.println(""+terms.length);
		for(String str:terms){
            System.out.println(str);
        }
		String test = new String("Welcome");
		if("Welcome".trim().equals(test)){
			System.out.println("v");
		}else{
			System.out.println("vv");
		}
		System.out.println(1234*20);
		LinkedList ll = new LinkedList();
		HashSet ss = new HashSet();
	}

}
