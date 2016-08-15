package in.porkko.hankcode.java;

public class GemElement {
	
	public static void main(String[] args) {
		
		
		String[] list  = {"abcdde","baccd","eeabg"};
		int gemCount = 0;
		char[] firstArr = list[0].toCharArray();
		boolean ck = false;
		for(int j=0;j<firstArr.length;j++){
				for(int i=0;i<list.length;i++){
				if(list[i].indexOf(firstArr[j])>=0){
					ck=true;
				}else{
					ck=false;
					break;
				}
			}
				if(ck){
					gemCount++;
				}
		}
		System.out.println(gemCount);
	}

}
