package in.sample.porkko.leetjudge;

public class ReverseSTring {
	public static void main(String[] args) {
		String s="hello";
		StringBuilder ss = new StringBuilder(s);
		int k=0;
		for(int j=s.length()-1;j>=0;j--){
			char c =s.charAt(j);
			ss.setCharAt(k,c);
			k++;
		}
		int n=-2147483648;
		int ns= Integer.bitCount(5);
		System.out.println(ns);
        System.out.println(ss.toString());
	}
}
