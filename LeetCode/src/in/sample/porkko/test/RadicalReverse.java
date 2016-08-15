package in.sample.porkko.test;

public class RadicalReverse {
	public static void main(String[] args) {
		String str = "malayalam";
		int length = str.length(),last =str.length()-1;
		char[] chr = str.toCharArray();
		for(int i=0;i<length/2;i++){
			char c = chr[i];
			chr[i] = chr[last-i];
			chr[last-i] = c;
		}
		System.out.println(new String(chr));
		if(str.equalsIgnoreCase(new String(chr))){
			System.out.println("PAlindrome");
		}else{
			System.out.println("Not PAlindrome");
		}
	}
}
