package in.sample.porkko.test;

public class GenerateStringInPattern {
	
	public static void main(String[] args) {
		String str = "1??0?101";
		StringBuilder sb = new StringBuilder(str);
		printPatter(sb,0);
		return;
		
	}
	static void printPatter(StringBuilder st,int index){
		if(index == st.length()){
			System.out.println(st);
			return;
		}
		if(st.charAt(index)=='?'){
			st.setCharAt(index, '0');
			printPatter(st, index+1);
			
			st.setCharAt(index, '1');
			printPatter(st, index+1);
		}else{
			printPatter(st, index+1);
		}
	}
}
