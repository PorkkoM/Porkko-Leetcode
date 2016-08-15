package in.sample.porkko.test;

public class NumberHasZero {
	
	public static void main(String[] args) {
		
		int n=200;
		int count =0;
		for(int i=0;i<n;i++){
			count+= has0(i);
		}
		System.out.println(count+1);
	}
	
	static int has0(int x){
		while(x>0){
			if(x%10==0){
				return 1;
			}
			x/=10;
		}
		return 0;
	}

}
