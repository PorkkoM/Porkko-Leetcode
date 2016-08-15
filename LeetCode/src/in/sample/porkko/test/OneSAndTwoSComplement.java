package in.sample.porkko.test;

public class OneSAndTwoSComplement {
	
	public static void main(String[] args) {
		
		String str = "1001";
		StringBuilder onesComplement = new StringBuilder(str);
		StringBuilder twosComplement = new StringBuilder(str);
		for(int i=0;i<onesComplement.length();i++){
			if(str.charAt(i)=='1'){
				onesComplement.setCharAt(i, '0');
			}else{
				onesComplement.setCharAt(i, '1');
			}
		}
		System.out.println("1'S Complement---->"+onesComplement.toString());
		twosComplement = onesComplement;
		int i;
		for(i= str.length()-1;i>=0;i--){
			if(onesComplement.charAt(i)=='1')
				twosComplement.setCharAt(i, '0');
			else{
				twosComplement.setCharAt(i, '1');
				break;
			}
		}
		System.out.println("2'S Complement--->"+twosComplement.toString());
	}
	
	static char flip(char c){
		return c=='0'?'1':'0';
	}

}
