package in.porkko.hankcode.java;

public class StringIntro {

	public static void main(String[] args) {
		
		String A="vuut";
		String B="vuuuuu";
		int len = A.length()+B.length();
		System.out.println(len);
		System.out.println(A.compareTo(B)>0?"Yes":"No");
		A=String.valueOf(Character.toUpperCase(A.charAt(0)))+A.substring(1,A.length());
		B=String.valueOf(Character.toUpperCase(B.charAt(0)))+B.substring(1,B.length());
		System.out.println(A+" "+B);
	}
	
}
