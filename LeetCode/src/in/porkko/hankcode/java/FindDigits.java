package in.porkko.hankcode.java;

import java.util.Scanner;

public class FindDigits {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		while(n>0){
//			int digit = sc.nextInt();
			int digit = 106108048;
			countDivisible(digit);
//			
//			n--;
//		}
		
	}
	public static void countDivisible(int digit){
		int count =0;
		int newdigit = digit;
		while(newdigit>0){
			int ace = newdigit%10;
			int ds = 0;
			if(ace!=0){
				ds = digit%ace;
				if(ds == 0){
					count++;
					newdigit = newdigit/10;
				}else{
					newdigit = newdigit/10;
				}
			}else{
				newdigit = newdigit/10;
			}


		}
		System.out.println(count);
	}

}
