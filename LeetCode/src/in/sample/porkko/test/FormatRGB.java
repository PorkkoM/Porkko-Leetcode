package in.sample.porkko.test;

public class FormatRGB {
	
	public static void main(String[] args) {
		int r=9,g=4,b=8;
		System.out.println(String.format("%02X%02X%02X", r,g,b));
		String str = "ZorkkoM";
		char[] ch = str.toCharArray();
		int n = (int)ch[0];
		System.out.println(""+n);
	}

}
