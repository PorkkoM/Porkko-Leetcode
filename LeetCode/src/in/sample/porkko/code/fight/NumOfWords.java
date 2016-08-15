package in.sample.porkko.code.fight;

import java.util.ArrayList;
import java.util.List;

public class NumOfWords {
	public static void main(String[] args) {
		String sentence = "wow,l0l that's funny";
		int templen=0;
		List<String> testSTring  = new ArrayList<String>();
		for(int i=0;i<sentence.length();i++){
			int charcCheck =(int)sentence.charAt(i);
			if((charcCheck>=65 && charcCheck<=90)||(charcCheck>=97 && charcCheck<=122)){
				templen ++;
			}else{
				testSTring.add(sentence.substring(0,templen));
				sentence = sentence.substring(templen, sentence.length());
			}
		}
		System.out.println(""+testSTring.size());
		for(String s:testSTring){
			System.out.println(s);
		}
	}
}
