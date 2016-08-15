package in.sample.porkko.test;

public class PrintStringCombinations {
	public static void main(String[] args) {
		String str="abcd";
		printCombination(str, 0, "");
		return;
	}
	static void printCombination(String s,int index,String sr){
		if(index==s.length()){
			System.out.println(""+sr);
		}
		for(int i=index;i<s.length();i++){
			printCombination(s, i+1, sr+"("+s.substring(index,i+1)+")");
		}
	}
	
}
