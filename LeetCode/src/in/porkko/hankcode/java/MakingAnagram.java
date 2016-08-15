package in.porkko.hankcode.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakingAnagram {

	public static void main(String[] args) {
		
		String a ="bugexikjevtubidpulaelsbcqlupwetzyzdvjphn";
		String b ="lajoipfecfinxjspxmevqxuqyalhrsxcvgsdxxkacspbchrbvvwnvsdtsrdk";
		String[] a1= a.split("");
		String[] b1=b.split("");
		List<String> as = new ArrayList<String>(Arrays.asList(a1));
		List<String> bs = new ArrayList<String>(Arrays.asList(b1));
		as.remove(0);
		bs.remove(0);
		for(int i=0;i<as.size();i++){
			String tmp = as.get(i);
			for(int j=0;j<bs.size();j++){
				if(tmp.equals(bs.get(j))){
					as.remove(i);
					bs.remove(j);
					break;
				}
			}
		}
		System.out.println(""+(as.size()+bs.size()));
		
		
	}
	
}
