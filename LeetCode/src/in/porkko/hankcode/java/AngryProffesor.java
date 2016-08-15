package in.porkko.hankcode.java;

import java.util.Scanner;

public class AngryProffesor {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int nTc = in.nextInt();
		String[] strResult = new String[nTc];
		int l=0;
		for(int i=0;i<nTc;i++){
          int noIp = in.nextInt();
          int noStu = in.nextInt();
          int dummCOunt = 0;
          for(int j=0;j<noIp;j++){
            int stu = in.nextInt();
            
            if(stu<=0){
            	dummCOunt++;
            }
          }
          if(dummCOunt>=noStu){
        	  strResult[l]  = "Yes";
        	  l++;
          }else{
        	  strResult[l]  = "No";
        	  l++;
          }
		}
		for(String sd:strResult){
			System.out.println(sd);
		}
	}
	

}
