package in.porkko.hankcode.java;

import java.util.ArrayList;
import java.util.List;

public class MakeItAnagram {
	
	public static void main(String[] args) {
		
		
		
		String test="fcrxzwscanmligyxyvym";
		String test2="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		
		char[] testArr = test.toCharArray();
		char[] test2Arr = test2.toCharArray();
		List<Character> list1 = new ArrayList<Character>();
		for(char ch:testArr){
			list1.add(ch);
		}
		List<Character> list2 = new ArrayList<Character>();
		for(char ch:test2Arr){
			list2.add(ch);
		}
		int returnValue=0;
		int returnValue2=0;
		for(int i=0;i<list1.size();i++){
			if(list1.contains(list2.get(i))){
				returnValue++;
			}
		}
		System.out.println((list1.size()+list2.size())-(returnValue+returnValue2));
	}

}
