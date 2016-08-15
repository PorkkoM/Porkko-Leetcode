package in.sample.porkko.code.fight;

public class CountCarries {
	
	
	public static void main(String[] args) {
		int r=0,c=0;
		int a=89 ,b=69;
		 for(;a+b>0;a/=10,b/=10){
			 r += c = (c+a%10+b%10)/10;
		 }
		 System.out.println(r);
	}
}
