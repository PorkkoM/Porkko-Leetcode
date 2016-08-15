package in.porkko.sample.ggeks;

public class RotaArrayWithOutSpecailChar {
	
	public static void main(String[] args) {
		
		String str = "Ab,c,de!$";
		int len = str.length();
		String tempStr = "";
		for(int i=0;i<str.length();i++){
			if(Character.isAlphabetic(str.charAt(i))){
				tempStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println(tempStr);
		tempStr = new StringBuffer(tempStr).reverse().toString();
		int k=0;
		StringBuilder strs  = new StringBuilder(str);
		for(int j=0;j<str.length();j++){
			if(Character.isAlphabetic(str.charAt(j))){
				strs.setCharAt(j, tempStr.charAt(k));
				k++;
			}
		}
		System.out.println(str);
		System.out.println("str---=>"+strs.toString());
	}

}
