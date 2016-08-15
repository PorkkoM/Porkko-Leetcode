package in.sample.porkko.test;

public class CountFive {
	public static void main(String[] args) {
		int n=49;
		int c=0;
		for(int i=10;i<n;i++){
			c+=has5(i);
		}
		System.out.println(c+1);
	}
	static int has5(int n){
		int cnt=0;
		while(n>0){
			int x=n%10;
			if(x==5){
				cnt++;
			}
			n/=10;
		}
		return cnt;
	}
}
