package in.sample.porkko.test;

public class FifthRoot {
	
	public static void main(String[] args) {
		int n=250;
		System.out.println("------------>"+fifthRootResult(250));
	}

	static int fifthRootResult(int n){
		int ret = 0;
		if(n==0 || n==1){
			return 0;
		}
		while(ret*ret*ret*ret*ret<=n){
			ret++;
		}
		return ret-1;
		
	}
}
