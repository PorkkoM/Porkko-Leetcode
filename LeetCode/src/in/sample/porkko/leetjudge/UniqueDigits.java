package in.sample.porkko.leetjudge;

public class UniqueDigits {
	public static void main(String[] args) {
		int n=2;
		int ans=10,base =9;
		for(int i=2;i<=n && i<=10;i++){
			base = base*(9-i+2);
			ans+=base;
		}
		System.out.println(ans);
	}
}
