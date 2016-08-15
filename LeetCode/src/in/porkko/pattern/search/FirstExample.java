package in.porkko.pattern.search;

public class FirstExample {

	public static void main(String[] args) {

		String str = "AABAACAADAABAAABAA";
		String pat="AABA";
		cheeckAndPrint(str.toCharArray(), pat.toCharArray());
	}
	static void cheeckAndPrint(char[] c,char[] d){
		int m=c.length;
		int n= d.length;
		for(int i=0;i<=m-n;i++){
			int j;
			for(j=m-1;j>=0;j--){
				if(c[i+j]!=d[j]){
					break;
				}
			}
			if(j==m){
				System.out.println("Pattern found at"+i);
			}
		}
	}
	
}
