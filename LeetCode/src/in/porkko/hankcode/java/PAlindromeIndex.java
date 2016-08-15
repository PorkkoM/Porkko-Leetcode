package in.porkko.hankcode.java;

public class PAlindromeIndex {
	

	public static void main(String[] args) {
		String str = "aaab";
		String revStr = new StringBuffer(str).reverse().toString();
		System.out.println(revStr);
		int index=0;
		if(str.equals(revStr)){
			index=0;
		}else{
			for(int j=0;j<str.length();j++){
				if(str.charAt(j)!=revStr.charAt(j)){
						index=j;
						break;
				}
			}
		}	
		System.out.println(index);
	}
}
