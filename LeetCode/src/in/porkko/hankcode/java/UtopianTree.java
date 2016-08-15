package in.porkko.hankcode.java;

import java.util.Scanner;

public class UtopianTree {
	
	public static void main(String[] args) {
		
		UtopianTree ut = new UtopianTree();
		System.out.println(ut.utopTree(1));
		Scanner sc = new Scanner(System.in);
		int no= sc.nextInt();
		while(no>2){
			
		}
	}
	
	public int utopTree(int n){
		int result =2;
		for(int i=1;i<n;i++){
			if(i%2==0){
				result = result*2;
			}else{
				result = result+1;
			}
		}
	   return result;
	}
}
