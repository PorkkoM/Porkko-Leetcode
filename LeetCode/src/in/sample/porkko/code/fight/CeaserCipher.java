package in.sample.porkko.code.fight;

public class CeaserCipher {
	
	public static void main(String[] args) {
		
		String ency = "CeaserCipher";
		int enc=4;
		StringBuilder stb = new StringBuilder();
		for(int i=0;i<ency.length();i++){
			char c = ency.charAt(i);
			if(Character.isLowerCase(c)){
				int ch1 = (((int)c+enc-97)%26+97);
				char h = (char)ch1;
				stb.append(h);
			}else{
				int ch1 = (((int)c+enc-65)%26+65);
				char h = (char)ch1;
				stb.append(h);
			}
		}
		System.out.println(stb.toString());
	}
}
