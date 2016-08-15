package in.porkko.hankcode.java;

public class FunnyString {

	public static void main(String[] args) {
		 
		String str = "acxz";
		String revStr = new StringBuffer(str).reverse().toString();
		String result="";
		int n=10;
		 String[] strs = new String[n];
		for(int i=1;i<str.length();i++){
		  int l=Math.abs((int)(str.charAt(i))-(int)(str.charAt(i-1)));
		  int r=Math.abs((int)(revStr.charAt(i))-(int)(revStr.charAt(i-1)));
		  if(l==r){
			  result="Funny";
		  }else{
			  result="Not Funny";
			  break;
		  }
		}
		
	}
	
}
