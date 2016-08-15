package in.sample.porkko.test;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chk = "GeeksForGeeks";
		char[] ch = chk.toCharArray();boolean flag=false;
		for(int i=0;i<ch.length;i++){
			if(chk.indexOf(ch[i])>=0){
				//chk=chk.replaceAll(ch[i], '*');
			}else{
				System.out.println("First Occurence String"+ch[i]);
				break;
			}
		}
	}
}
