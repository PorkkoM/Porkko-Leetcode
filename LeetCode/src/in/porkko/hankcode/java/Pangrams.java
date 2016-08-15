package in.porkko.hankcode.java;

public class Pangrams {
	
	public static void main(String[] args) {
		
		String a ="We promptly judged antique ivory buckles for the next prize";
		char[] ch  = a.toLowerCase().toCharArray();
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		a= " "+a.toLowerCase();
		boolean chkFlag=true;
		for(int i=0;i<alphabet.length-1;i++){
			if(a.indexOf(alphabet[i])<0){
				chkFlag=false;
				break;
			}
		}
		if(chkFlag){
			System.out.println("Pangram");
		}else{
			System.out.println("not pangram");
		}
	}

}
