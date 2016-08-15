package in.sample.porkko.code.fight;

public class CountingDistinctCharinString {
	
	public static void main(String[] args) {
		
		String str = "cvavavab";
		int count =0;
		for(int i=0;i<26;i++){
			boolean cap = false;
			
			for(int j=0;j<str.length();j++){
				if(str.charAt(j)=='a'+i){
					count++;
				}
				
			}
			
		}
		
		System.out.println(""+count);
	}

}
