package in.sample.porkko.code.fight;

public class DecryptCeaseCipher {
	
	public static void main(String[] args) {
		
		String dec = "GiewivGmtliv";
		int dc=4;
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<dec.length();j++){
			char ch= dec.charAt(j);
			if(Character.isUpperCase(ch)){
				int k = ((((int)ch-dc+65)%26)+65);
				char jk = (char)k;
				sb.append(jk);
			}else{
				int k = ((((int)ch-dc+97)%26)-97);
				//System.out.println("k---"+k);
				char jk = (char)(k);
				
				//System.out.println(jk);
				sb.append(jk);
			}
		}
		System.out.println(sb.toString());
	}

}
