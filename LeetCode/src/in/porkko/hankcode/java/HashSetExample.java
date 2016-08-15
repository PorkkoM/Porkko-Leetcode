package in.porkko.hankcode.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> st = new HashSet<String>();
        for(int i=0;i<100000;i++){
            String s = sc.next();
            st.add(s);
            System.out.println(st.size());
        }
		
	}
	

}
